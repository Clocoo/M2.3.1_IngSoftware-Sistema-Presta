
package mx.osmartorres.ingsoftwaresistemapresta1v;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Material {
    private String nombre;
    private String descripcion;
    private LocalDateTime creadoEn;
    private LocalDateTime actualizadoEn;

    public Material(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.creadoEn = LocalDateTime.now();
        this.actualizadoEn = LocalDateTime.now();
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public LocalDateTime getCreadoEn() {
        return creadoEn;
    }

    public LocalDateTime getActualizadoEn() {
        return actualizadoEn;
    }

    public void actualizarMaterial(String nuevoNombre, String nuevaDescripcion) {
        this.nombre = nuevoNombre;
        this.descripcion = nuevaDescripcion;
        this.actualizadoEn = LocalDateTime.now();
    }

    @Override
    public String toString() {
        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String creadoEnFormateado = creadoEn.format(formatter1);
        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String actualizadoEnFormateado = actualizadoEn.format(formatter2);
        return "Nombre: " + nombre +
                "\nDescripcion: " + descripcion +
                "\nCreado en: " + creadoEnFormateado +
                "\nActualizado en: " + actualizadoEnFormateado;
    }
}
