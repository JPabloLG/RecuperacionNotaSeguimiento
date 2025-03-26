package co.edu.uniquindio.poo.Pregunta2;

public class Main {
    public static void main(String[] args) {
        GestorTareas<Tarea> gestor = new GestorTareas<>();
        Tarea tarea1 = new Tarea("Revisar correo");
        Tarea tarea2 = new Tarea("Terminar informe");
        Tarea tarea3 = new Tarea("Preparar presentación");

        gestor.agregarTarea(tarea1);
        gestor.agregarTarea(tarea2);
        gestor.agregarTarea(tarea3);

        System.out.println("Tareas en orden inverso:");
        for (Tarea t : gestor) {
            System.out.println(t);
        }

        System.out.println("\nBuscando tarea 'Terminar informe': " + gestor.buscarTarea("Terminar informe"));
        System.out.println("Buscando tarea 'Hacer ejercicio': " + gestor.buscarTarea("Hacer ejercicio"));

        System.out.println("\nEliminando tarea 'Terminar informe'");
        gestor.eliminarTarea(tarea2);

        System.out.println("\nTareas después de eliminar:");
        for (Tarea t : gestor) {
            System.out.println(t);
        }
    }
}
