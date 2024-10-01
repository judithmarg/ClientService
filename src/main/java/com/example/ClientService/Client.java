package com.example.ClientService;

public record Client(
        String nombre,
        String apellidoPaterno,
        String apellidoMaterno,
        String ci
) {
    @Override
    public String toString() {
        return "Client{" +
                "nombre='" + nombre + '\'' +
                ", apellidoPaterno='" + apellidoPaterno + '\'' +
                ", apellidoMaterno='" + apellidoMaterno + '\'' +
                ", ci='" + ci + '\'' +
                '}';
    }
}
