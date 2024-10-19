package Practica4;

import Practica4.Figura;

public class Rectangulo extends Figura{
    private double base;
    private double altura;

    public Rectangulo(double base, double altura, String colorRelleno, String colorLinea) {
        super(colorRelleno, colorLinea);
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    public double calcularArea(){
    return getBase()*getAltura();
    }
    public double calcularPerimetro(){
    return getBase()+getAltura()*2;
    }

    @Override
    public String toString() {
        String aux =super.toString()+"base: " + getBase() + "altura: " + getAltura();
        return aux;
    }
    
    
}
