package ies.alcores.api_equipo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Jugador {

    @Id
    private int id;
    private String nombre;

}
