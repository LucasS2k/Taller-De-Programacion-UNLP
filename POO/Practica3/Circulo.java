package Practica3;


public class Circulo {
    private double radio;
    private String relleno;
    private String borde;

    public Circulo(double radio, String relleno, String borde) {
        this.radio = radio;
        this.relleno = relleno;
        this.borde = borde;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public String getRelleno() {
        return relleno;
    }

    public void setRelleno(String relleno) {
        this.relleno = relleno;
    }

    public String getBorde() {
        return borde;
    }

    public void setBorde(String borde) {
        this.borde = borde;
    }
    
    public double CalcularPerimetro(){
    double perimetro = 2*Math.PI*this.radio;
    return perimetro;
    }
    public double CalcularArea(){
    double area = Math.PI * (this.radio * this.radio);
    return area;
    }
}
