package ies.alcores.api_equipo.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ies.alcores.api_equipo.model.Equipo;
import ies.alcores.api_equipo.repository.EquipoRepository;

public class EquipoServiceTest {

	private EquipoRepository equipoRepository;
	private EquipoService equipoService;

	@BeforeEach
	void setUp() {
		this.equipoRepository = mock(EquipoRepository.class);
		this.equipoService = new EquipoService(this.equipoRepository);
	}

	@Test
	void testFindAll() {

		// Given
		Equipo p1 = this.createProducto();

		// When
		when(this.equipoRepository.findAll()).thenReturn(List.of(p1));
		List<Equipo> result = this.equipoService.findAll();

		// Then
		assertNotNull(result);
		verify(this.equipoRepository).findAll();
		assertEquals("Prueba", result.get(0).getNombre());

	}

	@Test
	void testSave() {
		// Given
		Equipo equipoAGuardar = new Equipo();
		equipoAGuardar.setId(1);
		equipoAGuardar.setNombre("Real Betis");

		// Simulamos que el repositorio devuelve el equipo al guardarlo
		when(this.equipoRepository.save(any(Equipo.class))).thenReturn(equipoAGuardar);

		// When: Ejecutamos el método del servicio
		Equipo resultado = this.equipoService.create(equipoAGuardar);

		// Then: Verificaciones
		assertNotNull(resultado);
		assertEquals("Real Betis", resultado.getNombre());
		assertEquals(1, resultado.getId());

		// Verificamos que el servicio realmente llamó al repositorio
		verify(this.equipoRepository).save(equipoAGuardar);
	}

	private Equipo createProducto() {
		Equipo p1 = new Equipo();
		p1.setId(0);
		p1.setNombre("Prueba");

		return p1;
	}
}
