package Practica4;

import Practica4.Figura;

public class Triangulo extends Figura{
    private double ladoA;
    private double ladoB;
    private double ladoC;

    public Triangulo(double ladoA, double ladoB, double ladoC, String colorRelleno, String colorLinea) {
        super(colorRelleno, colorLinea);
        this.ladoA = ladoA;
        this.ladoB = ladoB;
        this.ladoC = ladoC;
    }

    public double getLadoA() {
        return ladoA;
    }

    public void setLadoA(double ladoA) {
        this.ladoA = ladoA;
    }

    public double getLadoB() {
        return ladoB;
    }

    public void setLadoB(double ladoB) {
        this.ladoB = ladoB;
    }

    public double getLadoC() {
        return ladoC;
    }

    public void setLadoC(double ladoC) {
        this.ladoC = ladoC;
    }
    public double calcularPerimetro(){
    return getLadoA()+getLadoB()+getLadoC();
    }
    
    public double calcularArea(){
    double s = ladoA+ladoB+ladoC/2.0;
    return (Math.sqrt(s*(s - getLadoA())*(s - getLadoB())*(s - getLadoC())));
    }
    public String toString(){
    return super.toString()+" lado a: "+getLadoA()+" lado b: "+getLadoB()+" lado c: "+getLadoC();
    }
}
