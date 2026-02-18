package ies.alcores.api_equipo.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ies.alcores.api_equipo.model.Equipo;
import ies.alcores.api_equipo.service.EquipoService;
import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
@RequestMapping("/api/equipo")
public class EquipoController {

	private EquipoService equipoService;

	@GetMapping
	private ResponseEntity<List<Equipo>> listar() {
		return ResponseEntity.ok(this.equipoService.findAll());
	}

	@PostMapping
	public ResponseEntity<?> create(@RequestBody Equipo equipo) {
		return ResponseEntity.status(HttpStatus.CREATED).body(this.equipoService.create(equipo));

	}
}
