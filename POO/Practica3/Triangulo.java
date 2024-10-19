package Practica3;

public class Triangulo {
    private double lado =0;
    private double lado2 =0;
    private double lado3 =0;
    private String relleno = "";
    private String borde = "";

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
    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    public double getLado2() {
        return lado2;
    }

    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }

    public double getLado3() {
        return lado3;
    }

    public void setLado3(double lado3) {
        this.lado3 = lado3;
    }
    public double calcularPerimetro(){
    double perimetro = lado + lado2+ lado3;
    return perimetro;
    }
    
    public double calcularArea(){
    double s = calcularPerimetro()/2.0;
    double area = Math.sqrt(s*(s - lado)*(s - lado2)*(s - lado3));
    return area;
    }
    public String toString (){
    String aux;
    aux = "los lados son: " +lado+ " " +lado2+ " " +lado3+ "el relleno es : "+relleno+ "el borde es: " +borde  ;
    return aux;
    }
    public Triangulo(double lado, double lado2, double lado3, String relleno, String borde) {
        this.lado = lado;
        this.lado2 = lado2;
        this.lado3 = lado3;
        this.relleno = relleno;
        this.borde = borde;
    }
}
