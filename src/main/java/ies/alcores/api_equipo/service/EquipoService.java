package ies.alcores.api_equipo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import ies.alcores.api_equipo.model.Equipo;
import ies.alcores.api_equipo.repository.EquipoRepository;
import ies.alcores.api_equipo.service.exceptions.EquipoNotFoundException;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class EquipoService {

	private EquipoRepository equipoRepository;

	public List<Equipo> findAll() {
		return this.equipoRepository.findAll();
	}

	public Equipo findById(int id) {
		Optional<Equipo> b = this.equipoRepository.findById(id);

		if (b.isEmpty()) {
			throw new EquipoNotFoundException("Equipo with id " + id + " not found");
		}

		return b.get();
	}

	public Equipo create(Equipo equipo) {
		equipo.setId(0);

		return this.equipoRepository.save(equipo);
	}
}
