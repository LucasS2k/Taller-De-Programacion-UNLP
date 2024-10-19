package Practica4;

public class Trabajador extends Persona{
    private String oficio;

    public String getOficio() {
        return oficio;
    }

    public void setOficio(String oficio) {
        this.oficio = oficio;
    }

    public Trabajador(String oficio, String unNombre, int unDNI, int unaEdad) {
        super(unNombre, unDNI, unaEdad);
        this.oficio = oficio;
    }
    @Override
    public String toString(){
    return super.toString()+". mi oficio es: "+this.getOficio();
    }
    
}
