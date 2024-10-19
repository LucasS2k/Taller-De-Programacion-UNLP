package Practica4;

public class Cuadrado extends Figura{
    private double lado;

    public Cuadrado(double lado, String colorRelleno, String colorLinea) {
        super(colorRelleno, colorLinea);
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }
    
    public double calcularArea(){
    return getLado()*2;
    }
    
    public double calcularPerimetro(){
    return getLado()*4;
    }
    public String toString(){
    String aux = super.toString()+"lado: "+getLado();
    return aux;
    }
    
}
