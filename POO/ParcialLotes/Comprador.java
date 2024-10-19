package ParcialLotes;

public class Comprador {
 private int DNI;
 private String nombre;
 private String apellido;
 private String ciudad;

    public Comprador(int DNI, String nombre, String apellido, String ciudad) {
        this.DNI = DNI;
        this.nombre = nombre;
        this.apellido = apellido;
        this.ciudad = ciudad;
    }
    @Override
    public String toString(){
    return " dni: " +this.DNI+" nombre: "+this.nombre+" apellido "+this.apellido+" ciudad "+this.ciudad;
    }
}
