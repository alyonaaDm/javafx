package ru.kpfu.itis.server;

import ru.kpfu.itis.client.Client;
import ru.kpfu.itis.model.Room;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class ChatServer {

    private ServerSocket serverSocket;

    private List<Client> clients = new CopyOnWriteArrayList<>();

    private List<Room> rooms = new CopyOnWriteArrayList<>();

    private static ChatServer chatServer;

    public static ChatServer getInstance() {
        if (chatServer == null) {
            chatServer = new ChatServer();
        }
        return chatServer;
    }

    private ChatServer() {
    }

    public void start() {
        try {
            serverSocket = new ServerSocket(8888);
            new Thread(() -> {
                rooms.add(new Room("11-003"));
                rooms.add(new Room("11-003 Информатика"));
                rooms.add(new Room("Мои друзья"));
                while (true) {
                    try {
                        Socket socket = serverSocket.accept();
                        Client client = new Client(socket);
                        clients.add(client);
                        client.start();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }).start();
        } catch (IOException e) {
            //
        }
    }

    public List<Client> getClients() {
        return clients;
    }

    public List<Room> getRooms() {
        return rooms;
    }
}