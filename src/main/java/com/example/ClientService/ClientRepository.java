package com.example.ClientService;

import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class ClientRepository {
    private final List<Client> clients = new ArrayList<>();

    public Client save(Client client) {
        clients.add(client);
        return client;
    }

    public List<Client> findAll() {
        return clients;
    }
}
