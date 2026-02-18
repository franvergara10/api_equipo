package ies.alcores.api_productos.service;

import ies.alcores.api_productos.model.Producto;
import ies.alcores.api_productos.repository.ProductoRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.List;
import java.util.Optional;

import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

public class ProductoServiceTest {

    private ProductoRepository productoRepository;
    private ProductoService productoService;

    @BeforeEach
    void setUp(){
        this.productoRepository = mock(ProductoRepository.class);
        this.productoService = new ProductoService(this.productoRepository);
    }

    @Test
    void testFindAll(){

        //Given
        Producto p1 = this.createProducto();

        //When
        when(this.productoRepository.findAll()).thenReturn(List.of(p1));
        List<Producto> result = this.productoService.findAll();

        //Then
        assertNotNull(result);
        verify(this.productoRepository).findAll();
        assertEquals("TEST_0123", result.get(0).getCodBarras());

    }

    @Test
    void testFindOne(){
        //Given
        final Producto p1 = this.createProducto();

        //When
        when(this.productoRepository.findById(p1.getCodBarras())).thenReturn(Optional.of(p1));
        Optional<Producto> result = this.productoService.findByCodigoBarras((p1.getCodBarras()));

        //Then
        assertTrue(result.isPresent());
        assertEquals(p1.getCodBarras(), result.get().getCodBarras());
        verify(this.productoRepository).findById(p1.getCodBarras());
    }

    @Test
    void test_create(){

        //Given
        final Producto p1 = this.createProducto();

        //When
        when(this.productoRepository.save(p1)).thenReturn(p1);
        Producto result = this.productoService.save((p1));

        //Then
        assertNotNull(result);
        assertEquals(p1.getCodBarras(), result.getCodBarras());
        verify(this.productoRepository).save(p1);

    }

    @Test
    void test_delete(){

        //Given
        final Producto p1 = this.createProducto();

        //When
        when(this.productoRepository.save(p1)).thenReturn(p1);
        this.productoService.delete(p1.getCodBarras());

        //Then
        verify(this.productoRepository).deleteById(p1.getCodBarras());

    }

    private Producto createProducto(){
        Producto p1 = new Producto();
        p1.setCodBarras("TEST_0123");
        p1.setCantidad(1);
        p1.setMarca("Iphone");
        p1.setModelo("13 PRO");
        p1.setPrecio(1118.12);

        return p1;
    }
}
