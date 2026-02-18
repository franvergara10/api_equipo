package ies.alcores.api_equipo.service;

import ies.alcores.api_equipo.model.Equipo;
import ies.alcores.api_equipo.repository.EquipoRepository;
import ies.alcores.api_equipo.service.EquipoService;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.List;
import java.util.Optional;

import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

public class EquipoServiceTest {

    private EquipoRepository equipoRepository;
    private EquipoService equipoService;

    @BeforeEach
    void setUp(){
        this.equipoRepository = mock(EquipoRepository.class);
        this.equipoService = new EquipoService(this.equipoRepository);
    }

    @Test
    void testFindAll(){

        //Given
        Equipo p1 = this.createProducto();

        //When
        when(this.equipoRepository.findAll()).thenReturn(List.of(p1));
        List<Equipo> result = this.equipoService.findAll();

        //Then
        assertNotNull(result);
        verify(this.equipoRepository).findAll();
        assertEquals("TEST_0123", result.get(0).getCodBarras());

    }

    @Test
    void testFindOne(){
        //Given
        final Equipo p1 = this.createProducto();

        //When
        when(this.equipoRepository.findById(p1.getCodBarras())).thenReturn(Optional.of(p1));
        Optional<Equipo> result = this.equipoService.findByCodigoBarras((p1.getCodBarras()));

        //Then
        assertTrue(result.isPresent());
        assertEquals(p1.getCodBarras(), result.get().getCodBarras());
        verify(this.equipoRepository).findById(p1.getCodBarras());
    }

    @Test
    void test_create(){

        //Given
        final Equipo p1 = this.createProducto();

        //When
        when(this.equipoRepository.save(p1)).thenReturn(p1);
        Equipo result = this.equipoService.save((p1));

        //Then
        assertNotNull(result);
        assertEquals(p1.getCodBarras(), result.getCodBarras());
        verify(this.equipoRepository).save(p1);

    }

    @Test
    void test_delete(){

        //Given
        final Equipo p1 = this.createProducto();

        //When
        when(this.equipoRepository.save(p1)).thenReturn(p1);
        this.equipoService.delete(p1.getCodBarras());

        //Then
        verify(this.equipoRepository).deleteById(p1.getCodBarras());

    }

    private Equipo createProducto(){
        Equipo p1 = new Equipo();
        p1.setCodBarras("TEST_0123");
        p1.setCantidad(1);
        p1.setMarca("Iphone");
        p1.setModelo("13 PRO");
        p1.setPrecio(1118.12);

        return p1;
    }
}
