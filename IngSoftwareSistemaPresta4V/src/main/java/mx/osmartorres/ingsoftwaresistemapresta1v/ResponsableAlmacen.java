/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.osmartorres.ingsoftwaresistemapresta1v;

import java.util.ArrayList;
import java.util.List;

public class ResponsableAlmacen {
    private int matricula;
    private String nombre;
    private String apellidos;
    private String contraseña;
    private List<String> listaPrestamos;

    public ResponsableAlmacen(int matricula, String nombre, String apellidos, String contraseña) {
        this.matricula = matricula;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.contraseña = contraseña;
        this.listaPrestamos = new ArrayList<>();
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    // Método para agregar una cadena a la lista de cadenas
    public void agregarCadena(String cadena) {
        listaPrestamos.add(cadena);
    }

    // Método para obtener la lista de cadenas
    public List<String> getListaDeCadenas() {
        return listaPrestamos;
    }

    @Override
    public String toString() {
        return "Matrícula: " + matricula +
               "\nNombre: " + nombre +
               "\nApellidos: " + apellidos +
               "\nContraseña: " + contraseña;
    }
}
