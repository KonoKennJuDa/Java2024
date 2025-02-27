package Course2.Lesson7.Server;

import Course2.Lesson7.Constans.Constants;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Логика сервера
 */
public class MyServer {

    /**
     * Сервис аутентификации.
     */
    private AuthService authService;

    /**
     * Автивные клиенты.
     */
    private List<ClientHandler> clients;

    public AuthService getAuthService() {
        return authService;
    }

    public MyServer() {
        try (ServerSocket server = new ServerSocket(Constants.SERVER_PORT)) {
            authService = new BaseAuthService();
            authService.start();

            clients = new ArrayList<>();

            while (true) {
                System.out.println("Сервер ожидает подключения...");
                Socket socket = server.accept(); // БЛОКИРУЕМСЯ. Ждем ответа от клиента
                System.out.println("Клиент подключился.");
                new ClientHandler(this, socket);
            }

        } catch (IOException ex) {
            System.out.println("Ошибка в работе сервера.");
            ex.printStackTrace();
        } finally {
            if (authService != null) {
                authService.stop();
            }
        }
    }

    public synchronized void broadcastMessage(String message) {
        clients.forEach(client -> client.sendMessage(message));

        /*for (ClientHandler client : clients) {
            client.sendMessage(message);
        }*/
    }

    public synchronized void subscribe(ClientHandler client) {
        clients.add(client);
    }

    public synchronized void unsubscribe(ClientHandler client) {
        clients.remove(client);
    }

    public synchronized String getActiveClient() {
        StringBuilder stringBuilder = new StringBuilder(Constants.CLIENT_LIST_COMMAND).append(" ");
        stringBuilder.append(clients.stream().map(clientHandler -> clientHandler.getName()).collect(Collectors.joining(" ")));
//        for (ClientHandler clientHandler : clients) {
//            stringBuilder.append(clientHandler.getName()).append(" ");
//        }
        return stringBuilder.toString();
    }
}
