package ies.alcores.api_equipo.service;
import org.springframework.stereotype.Service;

import ies.alcores.api_equipo.repository.EquipoRepository;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class EquipoService {

    private EquipoRepository equipoRepository;

}
