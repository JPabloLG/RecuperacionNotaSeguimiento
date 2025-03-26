package co.edu.uniquindio.poo.Pregunta2;

import java.util.Date;

class Tarea {
    private String descripcion;
    private Date fechaCreacion;

    public Tarea(String descripcion) {
        this.descripcion = descripcion;
        this.fechaCreacion = new Date();
    }

    public String getDescripcion() { return descripcion; }
    public Date getFechaCreacion() { return fechaCreacion; }

    @Override
    public String toString() {
        return "Tarea{" +
                "descripcion='" + descripcion + '\'' +
                ", fechaCreacion=" + fechaCreacion +
                '}';
    }
}