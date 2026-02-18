package org.example.Service;

import org.example.Model.Producto;
import java.util.ArrayList;
import java.util.List;

public class ProductoServiceImpl implements ProductoService {

    private List<Producto> productos = new ArrayList<>();

    @Override
    public Producto registrarProducto(String nombre, double precio, int cantidad) {

        Producto producto = new Producto(nombre, precio, cantidad);
        productos.add(producto);
        return producto;
    }

    @Override
    public List<Producto> listarProductos() {
        return productos;
    }

    @Override
    public Producto buscarPorId(long id) {

        for (Producto p : productos) {
            if (p.getId() == id) {
                return p;
            }
        }
        return null;
    }

    @Override
    public void modificarPrecio(long id, double nuevoPrecio) {

        Producto producto = buscarPorId(id);

        if (producto != null) {
            producto.setPrecio(nuevoPrecio);
        }
    }

    @Override
    public void modificarCantidad(long id, int nuevaCantidad) {

        Producto producto = buscarPorId(id);

        if (producto != null) {
            producto.setCantidad(nuevaCantidad);
        }
    }

    @Override
    public void eliminarProducto(long id) {

        Producto producto = buscarPorId(id);

        if (producto != null) {
            productos.remove(producto);
        }
    }
}
