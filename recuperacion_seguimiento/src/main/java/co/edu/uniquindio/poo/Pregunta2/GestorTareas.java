package co.edu.uniquindio.poo.Pregunta2;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

class GestorTareas<T extends Tarea> implements Iterable<T> {
    private LinkedList<T> tareas;

    public GestorTareas() {
        this.tareas = new LinkedList<>();
    }

    public void agregarTarea(T tarea) {
        tareas.addFirst(tarea);
    }

    public void eliminarTarea(T tarea) {
        tareas.remove(tarea);
    }

    public boolean buscarTarea(String descripcion) {
        for (T tarea : tareas) {
            if (tarea.getDescripcion().equals(descripcion)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            private ListIterator<T> iterador = tareas.listIterator(tareas.size());
            
            @Override
            public boolean hasNext() {
                return iterador.hasPrevious();
            }

            @Override
            public T next() {
                return iterador.previous();
            }
        };
    }
}