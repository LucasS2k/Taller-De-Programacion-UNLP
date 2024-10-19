package Practica4;
public abstract class Figura {
    private String colorRelleno;
    private String colorLinea;
    
    public String toString(){
    String aux;
    aux = "perimetro: "+this.calcularPerimetro()+"area: "+this.calcularArea()+"color relleno: " +this.colorRelleno+"color de linea: "+this.colorLinea;
    return aux;
    }

    public Figura(String colorRelleno, String colorLinea) {
        this.colorRelleno = colorRelleno;
        this.colorLinea = colorLinea;
    }

    public String getColorRelleno() {
        return colorRelleno;
    }

    public void setColorRelleno(String colorRelleno) {
        this.colorRelleno = colorRelleno;
    }

    public String getColorLinea() {
        return colorLinea;
    }

    public void setColorLinea(String colorLinea) {
        this.colorLinea = colorLinea;
    }
    public void despintar(){
    this.colorLinea= "negro";
    this.colorRelleno="blanco";
    }
    public abstract double calcularArea();
    public abstract double calcularPerimetro();
    
}
