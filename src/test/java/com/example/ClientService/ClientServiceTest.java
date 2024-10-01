package com.example.ClientService;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClientServiceTest {

    @Test
    void createClient() {
        ClientService clientService = new ClientService();


        assertNotNull(clientService.createClient("ho","hi","hi" ,"1346"));
    }
}