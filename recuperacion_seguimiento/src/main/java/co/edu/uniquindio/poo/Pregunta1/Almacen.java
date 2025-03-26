package co.edu.uniquindio.poo.Pregunta1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

class Almacen<T extends Producto> implements Iterable<T> {
    private List<T> productos;

    public Almacen() {
        this.productos = new ArrayList<>();
    }

    public void agregarProducto(T producto) {
        productos.add(producto);
    }

    public void ordenarPorPrecio() {
        Collections.sort(productos, new Comparator<T>() {
            @Override
            public int compare(T p1, T p2) {
                return Double.compare(p1.getPrecio(), p2.getPrecio());
            }
        });
    }

    @Override
    public Iterator<T> iterator() {
        return productos.iterator();
    }
}