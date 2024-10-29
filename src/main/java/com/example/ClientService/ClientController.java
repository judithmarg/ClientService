package com.example.ClientService;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClientController implements ClientApi {
    final
    ClientService clientService;

    public ClientController(ClientService clientService) {
        this.clientService = clientService;
    }

    @PostMapping
    public ResponseEntity<ResponseDto> addClient(@RequestParam RequestDto requestdto) {
        ClientRepository repo = new ClientRepository();
        int lengthRepo = repo.findAll().size();

        this.clientService.createClient(
                requestdto.nombre(),
                requestdto.apellidoPaterno(),
                requestdto.apellidoMaterno(),
                requestdto.ci()
        );
        boolean isAdded = lengthRepo < repo.findAll().size();
        ResponseDto responseDto = new ResponseDto(
                requestdto.ci(),
                isAdded
        );
        return ResponseEntity.ok(responseDto);
    }
}
