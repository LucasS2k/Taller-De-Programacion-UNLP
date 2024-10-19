package Practica4;

public class Circulo extends Figura {
    private double radio;

    public Circulo(double radio, String colorRelleno, String colorLinea) {
        super(colorRelleno, colorLinea);
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    
    public double calcularArea(){
    return Math.PI * (this.radio * this.radio);
    }
    public double calcularPerimetro(){
    return Math.PI*(this.radio+ this.radio);
    }
    @Override
    public String toString() {
        return super.toString() + " radio: " + getRadio();
    }
    
}
