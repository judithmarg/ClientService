package com.example.ClientService;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClientServiceTest {
    private ClientService clientService;
    private ClientRepository clientRepository;

    @BeforeEach
    public void setUp() {
        clientRepository = new ClientRepository();
        clientService = new ClientService(clientRepository);
    }

    @Test
    public void testCreateClient() {
        Client client = clientService.createClient("John", "Doe", "Smith", "123456789");

        assertEquals("John", client.nombre());
        assertEquals("Doe", client.apellidoPaterno());
        assertEquals("Smith", client.apellidoMaterno());
        assertEquals("123456789", client.ci());
    }
}