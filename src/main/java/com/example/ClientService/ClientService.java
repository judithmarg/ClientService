package com.example.ClientService;

import org.springframework.stereotype.Service;

@Service
public class ClientService {

    private final ClientRepository clientRepository;

    public ClientService(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    public Client createClient(String name, String ap1, String ap2, String ci) {
        Client client = new Client(name, ap1, ap2, ci);
        return clientRepository.save(client);
    }
}
