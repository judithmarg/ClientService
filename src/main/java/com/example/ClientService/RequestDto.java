package com.example.ClientService;

public record RequestDto(
        String nombre,
        String apellidoPaterno,
        String apellidoMaterno,
        String ci
) {
}
