package ies.alcores.api_equipo.service.exceptions;

public class EquipoNotFoundException  extends RuntimeException {
    public EquipoNotFoundException(String message) {
        super(message);
    }
}