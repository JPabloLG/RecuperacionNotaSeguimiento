package co.edu.uniquindio.poo.Pregunta1;

public class Main {
    public static void main(String[] args) {
        Almacen<Producto> almacen = new Almacen<>();
        almacen.agregarProducto(new Producto("Laptop", 10, 1200.50));
        almacen.agregarProducto(new Producto("Mouse", 50, 25.75));
        almacen.agregarProducto(new Producto("Teclado", 30, 45.00));

        System.out.println("Productos antes de ordenar por precio:");
        for (Producto p : almacen) {
            System.out.println(p);
        }

        almacen.ordenarPorPrecio();
        System.out.println("\nProductos después de ordenar por precio:");
        for (Producto p : almacen) {
            System.out.println(p);
        }
    }
    
}
