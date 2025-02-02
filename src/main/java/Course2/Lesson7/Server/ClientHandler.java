package Course2.Lesson7.Server;

import Course2.Lesson7.Constans.Constants;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Optional;

/**
 * Обработчик для конкретного клиента.
 */
public class ClientHandler {

    private MyServer server;
    private Socket socket;
    private DataInputStream dataInputStream;
    private DataOutputStream dataOutputStream;
    private String name;

    public ClientHandler(MyServer server, Socket socket) {
        try {
            this.server = server;
            this.socket = socket;
            this.dataInputStream = new DataInputStream(socket.getInputStream());
            this.dataOutputStream = new DataOutputStream(socket.getOutputStream());
            new Thread(() -> {
                try {
                    authentication();
                    readMessage();
                } catch (IOException ex) {
                    ex.printStackTrace();
                } finally {
                    closeConnection();
                }
            }).start();

        } catch (IOException ex) {
            throw new RuntimeException("Проблемы при создании обработчика");
        }
    }

    // auth login pass
    private void authentication() throws IOException {
        while (true) {
            String str = dataInputStream.readUTF();
            if (str.startsWith(Constants.AUTH_COMMAND)) {
                String[] tokens = str.split("\\s+"); // Массив длиной 3. \\s+ - регулярное выражение "пробел 1 или больше"
                Optional<String> nick = server.getAuthService().getNickByLoginAndPass(tokens[1], tokens[2]);

                if (nick.isPresent()) {
                    //Можно проверять есть ли такой ник в чате, сделать проверку по нику
                    //Авторизовались
                    name = nick.get();
                    sendMessage(Constants.AUTH_OK_COMMAND + " " + nick);
                    server.broadcastMessage(nick + " вошел в чат");
                    server.broadcastMessage(server.getActiveClient());
                    server.subscribe(this);
                    return;
                } else {
                    sendMessage("Неверные пароль или логин");
                }
            }
        }

    }

    public void sendMessage(String message) {
        try {
            dataOutputStream.writeUTF(message);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private void readMessage() throws IOException {
        while (true) {
            String messageFromClient = dataInputStream.readUTF();
            //hint: можем получать команду

            if (messageFromClient.startsWith(Constants.CLIENT_LIST_COMMAND)) {
                sendMessage(server.getActiveClient());
            } else {

                System.out.println("Сообщение от " + name + ": " + messageFromClient);
                if (messageFromClient.equals(Constants.END_COMMAND)) {
                    break;
                }
                server.broadcastMessage(name + ": " + messageFromClient);
            }
        }
    }

    public String getName() {
        return name;
    }

    private void closeConnection() {
        server.unsubscribe(this);
        server.broadcastMessage(name + " вышел из чата");
        try {
            dataInputStream.close();
        } catch (IOException e) {
            //ignore
        }
        try {
            dataOutputStream.close();
        } catch (IOException e) {
            //ignore
        }
        try {
            socket.close();
        } catch (IOException e) {
            //ignore
        }
    }

}
