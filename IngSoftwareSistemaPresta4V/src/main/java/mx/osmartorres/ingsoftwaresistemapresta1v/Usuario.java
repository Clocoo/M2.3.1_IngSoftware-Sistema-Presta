package mx.osmartorres.ingsoftwaresistemapresta1v;
import java.util.ArrayList;
import java.util.List;

public class Usuario {
    private String nombre;
    private String apellidos;
    private String correo;
    private String contraseña;
    private List <Prestamo> préstamos;
    public Prestamo préstamoAux;
    
    public Usuario(String nombre, String apellidos, String correo, String contraseña) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.correo = correo;
        this.contraseña = contraseña;
        this.préstamos = new ArrayList<>();
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

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public int getNúmeroPréstamos() {
        int totalPrestamos = préstamos.size();
        return totalPrestamos;
    }

    public String getIdPrestamoActual(){
        String presActual = String.valueOf(préstamos.size());
        return presActual;
    }

    public void crearPréstamo() {
        préstamoAux = new Prestamo(préstamos.size()+1,"Activo");
    }

    public void agregarPréstamo(Prestamo pAux){
        préstamos.add(pAux);
    }
    
    public void cerrarPréstamo(){
        préstamos.add(préstamoAux);
    }

    public void eliminarPréstamo(int idPrestamo){
        idPrestamo--;
        préstamos.remove(idPrestamo);
    }
    
    public void verPréstamos(){
        System.out.println("Préstamos actuales: ");
        for (Prestamo préstamo : préstamos) {
            System.out.println(préstamo.toString());
            préstamo.verMateriales();
            System.out.println();
        }
    }
    
    public String retornarPréstamos(){
        StringBuilder cadenaCombinada = new StringBuilder();
        cadenaCombinada.append("Préstamos: "+"\n");
        String cadenaPréstamo;
        for (Prestamo préstamo : préstamos) {
            cadenaPréstamo = préstamo.toString() + "\n" + "\n" + "Materiales: " + "\n" + préstamo.retornarMateriales() + "\n";
            cadenaCombinada.append(cadenaPréstamo);
            //cadenaCombinada.append("\n");
        }
        return cadenaCombinada.toString();
    }
    
    public void verMaterialesDePréstamo(int n){
        Prestamo préstamo = préstamos.get(n);
        préstamo.verMateriales();
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre +
               "\nApellidos: " + apellidos +
               "\nCorreo: " + correo +
               "\nContraseña: " + contraseña +
               "\nPréstamos: " + préstamos;
    }
}
