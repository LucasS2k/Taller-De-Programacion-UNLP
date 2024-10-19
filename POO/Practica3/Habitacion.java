package Practica3;
import PaqueteLectura.*;

public class Habitacion {
    private double costo;
    private Boolean ocupada;
    private Persona cliente;
    
    public Habitacion(){
    costo = GeneradorAleatorio.generarDouble(6001)+2000;
    ocupada = false;
    cliente = null;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public Boolean getOcupada() {
        return ocupada;
    }

    public void setOcupada(Boolean ocupada) {
        this.ocupada = ocupada;
    }

    public Persona getCliente() {
        return cliente;
    }

    public void setCliente(Persona cliente) {
        this.cliente = cliente;
        this.ocupada = true;
    }
    @Override
    public String toString (){
    String aux;
    aux = "Costo por noche: "+costo+" ocupado: "+ocupada;
    if(ocupada){
    aux+=" cliente alojado: "+cliente.toString();
    }return aux;}
}
