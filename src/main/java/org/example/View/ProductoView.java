package org.example.View;

import org.example.Model.Producto;
import java.util.List;

public class ProductoView {

    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }

    public void mostrarProducto(Producto producto) {
        System.out.println(producto);
    }

    public void mostrarLista(List<Producto> productos) {

        System.out.println("----- INVENTARIO -----");

        for (Producto p : productos) {
            System.out.println(p);
        }
    }
}
