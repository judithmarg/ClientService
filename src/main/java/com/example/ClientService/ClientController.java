package com.example.ClientService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClientController implements ClientApi {
    @Autowired
    ClientService clientService;

    @PostMapping
    public String addClient(@RequestBody RequestDto requestdto) {
        return this.clientService.createClient(
                requestdto.nombre(),
                requestdto.apellidoPaterno(),
                requestdto.apellidoMaterno(),
                requestdto.ci()
        ).toString();
    }
}
