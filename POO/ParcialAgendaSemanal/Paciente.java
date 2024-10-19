package ParcialAgendaSemanal;

public class Paciente {
    private String nombre;
    private boolean OS;
    private double costoSesion;

    public Paciente(String nombre, boolean OS, double costoSesion) {
        this.nombre = nombre;
        this.OS = OS;
        this.costoSesion = costoSesion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isOS() {
        return OS;
    }

    public void setOS(boolean OS) {
        this.OS = OS;
    }

    public double getCostoSesion() {
        return costoSesion;
    }

    public void setCostoSesion(double costoSesion) {
        this.costoSesion = costoSesion;
    }
    @Override
    public String toString(){
    String aux;
    aux = "paciente: "+this.getNombre()+" obra social: "+this.isOS()+" costo de sesion: "+this.getCostoSesion(); ;
        return aux;
    }
}
