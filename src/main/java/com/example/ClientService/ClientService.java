package com.example.ClientService;

import org.springframework.stereotype.Service;

@Service
public class ClientService {

    public Client createClient(String name, String ap1, String ap2, String ci) {
        return new Client(name, ap1, ap2, ci);
    }
}
