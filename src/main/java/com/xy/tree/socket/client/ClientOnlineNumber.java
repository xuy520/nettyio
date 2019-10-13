package com.xy.tree.socket.client;

import com.corundumstudio.socketio.SocketIOClient;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class ClientOnlineNumber {
    private static List<SocketIOClient> clients = new ArrayList<SocketIOClient>();//用于保存所有客户端
    private static ReadWriteLock lock = new ReentrantReadWriteLock();

    public static void addClient(SocketIOClient client) {
        try {
            lock.writeLock().lock();
            clients.add(client);
        } finally {
            lock.writeLock().unlock();
        }
    }

    public static void getClient(SocketIOClient client) {
        try {
            lock.readLock().lock();
            clients.add(client);
        } finally {
            lock.readLock().unlock();
        }
    }

    public static List<SocketIOClient> getClients() {
        return clients;
    }
}
