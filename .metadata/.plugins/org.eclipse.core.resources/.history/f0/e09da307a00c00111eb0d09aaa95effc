package ies.alcores.api_equipo.controller;

import ies.alcores.api_equipo.model.Equipo;
import ies.alcores.api_equipo.service.EquipoService;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/api/equipo")
public class EquipoController {

    private EquipoService equipoService;

    @GetMapping
    private ResponseEntity<List<Equipo>> listar(){
        return ResponseEntity.ok(this.equipoService.findAll());
    }

}
