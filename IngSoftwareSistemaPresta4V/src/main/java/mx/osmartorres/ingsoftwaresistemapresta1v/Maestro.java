
package mx.osmartorres.ingsoftwaresistemapresta1v;

public class Maestro extends Usuario {
    private int idEmpleado;

    public Maestro(String nombre, String apellidos, String correo, String contraseña, int idEmpleado) {
        super(nombre, apellidos, correo, contraseña);
        this.idEmpleado = idEmpleado;
    }

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    @Override
    public String toString() {
        return super.toString() + "\nID Empleado: " + idEmpleado;
    }
}
