package org.example.Controller;

import org.example.Model.Producto;
import org.example.Service.ProductoService;
import org.example.View.ProductoView;
import java.util.List;

public class ProductoController {

    private ProductoService service;
    private ProductoView view;

    public ProductoController(ProductoService service, ProductoView view) {
        this.service = service;
        this.view = view;
    }

    public void registrarProducto(String nombre, double precio, int cantidad) {

        Producto producto = service.registrarProducto(nombre, precio, cantidad);
        view.mostrarMensaje("Producto registrado con ID: " + producto.getId());
    }

    public void listarProductos() {

        List<Producto> productos = service.listarProductos();
        view.mostrarLista(productos);
    }

    public void buscarProducto(long id) {

        Producto producto = service.buscarPorId(id);

        if (producto != null) {
            view.mostrarProducto(producto);
        } else {
            view.mostrarMensaje("Producto no encontrado");
        }
    }

    public void modificarPrecio(long id, double precio) {
        service.modificarPrecio(id, precio);
        view.mostrarMensaje("Precio actualizado");
    }

    public void modificarCantidad(long id, int cantidad) {
        service.modificarCantidad(id, cantidad);
        view.mostrarMensaje("Cantidad actualizada");
    }

    public void eliminarProducto(long id) {
        service.eliminarProducto(id);
        view.mostrarMensaje("Producto eliminado");
    }
}
