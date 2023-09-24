package mx.osmartorres.ingsoftwaresistemapresta1v;

public class Alumno extends Usuario {
    private int matricula;

    public Alumno(String nombre, String apellidos, String correo, String contraseña, int matricula) {
        super(nombre, apellidos, correo, contraseña);
        this.matricula = matricula;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    @Override
    public String toString() {
        return super.toString() + "\nMatrícula: " + matricula;
    }
}
