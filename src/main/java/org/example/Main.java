package org.example;

import org.example.Controller.ProductoController;
import org.example.Service.ProductoService;
import org.example.Service.ProductoServiceImpl;
import org.example.View.ProductoView;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ProductoService service = new ProductoServiceImpl();
        ProductoView view = new ProductoView();
        ProductoController controller = new ProductoController(service, view);

        Scanner sc = new Scanner(System.in);
        int opcion;

        do {

            System.out.println("===== SISTEMA DE INVENTARIO =====");
            System.out.println("1. Registrar producto");
            System.out.println("2. Listar productos");
            System.out.println("3. Buscar producto por ID");
            System.out.println("4. Modificar precio");
            System.out.println("5. Modificar cantidad");
            System.out.println("6. Eliminar producto");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");

            opcion = sc.nextInt();

            switch (opcion) {

                case 1:
                    System.out.print("Nombre: ");
                    sc.nextLine();
                    String nombre = sc.nextLine();

                    System.out.print("Precio: ");
                    double precio = sc.nextDouble();

                    System.out.print("Cantidad: ");
                    int cantidad = sc.nextInt();

                    controller.registrarProducto(nombre, precio, cantidad);
                    break;

                case 2:
                    controller.listarProductos();
                    break;

                case 3:
                    System.out.print("Ingrese ID: ");
                    long idBuscar = sc.nextLong();
                    controller.buscarProducto(idBuscar);
                    break;

                case 4:
                    System.out.print("Ingrese ID: ");
                    long idPrecio = sc.nextLong();

                    System.out.print("Nuevo precio: ");
                    double nuevoPrecio = sc.nextDouble();

                    controller.modificarPrecio(idPrecio, nuevoPrecio);
                    break;

                case 5:
                    System.out.print("Ingrese ID: ");
                    long idCantidad = sc.nextLong();

                    System.out.print("Nueva cantidad: ");
                    int nuevaCantidad = sc.nextInt();

                    controller.modificarCantidad(idCantidad, nuevaCantidad);
                    break;

                case 6:
                    System.out.print("Ingrese ID: ");
                    long idEliminar = sc.nextLong();
                    controller.eliminarProducto(idEliminar);
                    break;

                case 0:
                    System.out.println("Saliendo del sistema...");
                    break;

                default:
                    System.out.println("Opción inválida");
            }

        } while (opcion != 0);

        sc.close();
    }
}
