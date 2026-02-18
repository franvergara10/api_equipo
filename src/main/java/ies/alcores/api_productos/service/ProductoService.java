package ies.alcores.api_productos.service;
import ies.alcores.api_productos.model.Producto;
import ies.alcores.api_productos.repository.ProductoRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class ProductoService {

    private ProductoRepository productoRepository;

    public List<Producto> findAll(){
        return this.productoRepository.findAll();
    }

    public Optional<Producto> findByCodigoBarras(final String codBarras){
        return this.productoRepository.findById(codBarras);
    }

    public Producto save(final Producto producto){
        return this.productoRepository.save(producto);
    }

    public void delete(final String codBarras){
        this.productoRepository.deleteById(codBarras);
    }
}
