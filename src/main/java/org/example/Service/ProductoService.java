package org.example.Service;

import org.example.Model.Producto;
import java.util.List;

public interface ProductoService {

    Producto registrarProducto(String nombre, double precio, int cantidad);

    List<Producto> listarProductos();

    Producto buscarPorId(long id);

    void modificarPrecio(long id, double nuevoPrecio);

    void modificarCantidad(long id, int nuevaCantidad);

    void eliminarProducto(long id);
}
