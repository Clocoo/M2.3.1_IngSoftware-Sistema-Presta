package mx.osmartorres.ingsoftwaresistemapresta1v;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.time.format.DateTimeFormatter;

public class Prestamo {
    private int idPréstamo;
    private String estado;
    private LocalDateTime creadoEn;
    private LocalDateTime actualizadoEn;
    private List<Material> materiales;

    public Prestamo(int idPréstamo, String estado) {
        this.idPréstamo = idPréstamo;
        this.estado = estado;
        this.creadoEn = LocalDateTime.now();
        this.actualizadoEn = LocalDateTime.now();
        this.materiales = new ArrayList<>();
    }

    public int getIdPréstamo() {
        return idPréstamo;
    }

    public void setIdPréstamo(int idPréstamo) {
        this.idPréstamo = idPréstamo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public LocalDateTime getCreadoEn() {
        return creadoEn;
    }

    public LocalDateTime getActualizadoEn() {
        return actualizadoEn;
    }

    public void agregarMaterial(Material material) {
        materiales.add(material);
        actualizadoEn = LocalDateTime.now(); 
    }

    public void eliminarMaterial(Material material) {
        if (materiales.contains(material)) {
            materiales.remove(material);
            actualizadoEn = LocalDateTime.now();
        }
    }

    public void actualizarMaterial(Material materialAnterior, Material materialNuevo) {
        if (materiales.contains(materialAnterior)) {
            int index = materiales.indexOf(materialAnterior);
            materiales.set(index, materialNuevo);
            actualizadoEn = LocalDateTime.now();
        }
    }

public String retornarMateriales() {
    StringBuilder materialesCadena = new StringBuilder();
    for (Material material : materiales) {
        materialesCadena.append(material.toString()).append("\n"+"\n");
    }
    return materialesCadena.toString();
}
    
    public void verMateriales() {
        System.out.println("Materiales del préstamo: ");
        for (Material material : materiales) {
            System.out.println(material.toString());
            System.out.println();
        }
    }

    @Override
    public String toString() {
        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String creadoEnFormateado = creadoEn.format(formatter1);
        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String actualizadoEnFormateado = actualizadoEn.format(formatter2);
        return "ID Prestamo: " + idPréstamo +
                "\nEstado: " + estado +
                "\nCreado en: " + creadoEnFormateado +
                "\nActualizado en: " + actualizadoEnFormateado;
    }
}

