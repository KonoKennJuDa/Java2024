package Course2.Lesson6;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class EchoServer {
    public static void main(String[] args) {
        Socket socket = null;

        try (ServerSocket serverSocket = new ServerSocket(8089)) { //try with resources
            System.out.println("Сервер ожидает подключения... ");
            socket = serverSocket.accept(); //wait connection (БЛОКИРУЕМСЯ) Блокирующий вызов, код ждет клиента. Join
            System.out.println("Клиент подключился! ");
            DataInputStream dataInputStream = new DataInputStream(socket.getInputStream());
            DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());
            while (true) {
                String message = dataInputStream.readUTF(); // (БЛОКИРУЮЩИЙ) Ждем, когда клиент что-то напечатает
                //poison pill. Нам нужен способ разовать бесконечный цикл. Данные закрывающие поток/цикл
                if (message.equals("/end")) {
                    dataOutputStream.writeUTF(message);
                    break;
                }
                System.out.println("Клиент прислал " + message);
                dataOutputStream.writeUTF("Echo: " + message);
            }

        } catch (IOException e) {
            e.printStackTrace();
        } //finally {ServerSocket.close()} // неявно прописанный в try finally с закрытием ServerSocket. Потому что socket имеет интерфейс closable

    }
}
