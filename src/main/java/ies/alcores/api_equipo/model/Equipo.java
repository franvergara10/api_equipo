package ies.alcores.api_equipo.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Data;

@Data
@Entity
public class Equipo {

	//Equipazo
    @Id
    private int id;
    
    private String nombre;
    
    @OneToMany(mappedBy = "equipo")
    @JsonIgnore
    private List<Jugador> jugadores;
}
