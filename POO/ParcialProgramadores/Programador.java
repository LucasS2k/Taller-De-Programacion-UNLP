package ParcialProgramadores;

public class Programador {
    private String nombre;
    private int DNI;
    private double sueldoBasico;
    private int lineasPorHora;
    private String lenguaje;

    public Programador(String nombre, int DNI, double sueldoBasico, int lineasPorHora, String lenguaje) {
        this.nombre = nombre;
        this.DNI = DNI;
        this.sueldoBasico = sueldoBasico;
        this.lineasPorHora = lineasPorHora;
        this.lenguaje = lenguaje;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDNI() {
        return DNI;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }

    public double getSueldoBasico() {
        return sueldoBasico;
    }

    public void setSueldoBasico(double sueldoBasico) {
        this.sueldoBasico = sueldoBasico;
    }

    public int getLineasPorHora() {
        return lineasPorHora;
    }

    public void setLineasPorHora(int lineasPorHora) {
        this.lineasPorHora = lineasPorHora;
    }

    public String getLenguaje() {
        return lenguaje;
    }

    public void setLenguaje(String lenguaje) {
        this.lenguaje = lenguaje;
    }
    public double aumento(double A){
    return this.sueldoBasico +=A;
    }
    public double calcularSueldo(){
    double sueldo = this.getSueldoBasico();
    if (this.getLineasPorHora() > 200){
    
    sueldo += 50000;
    }
    return sueldo;
    }
    @Override
    public String toString(){
    String aux;
    aux = "nombre: "+this.getNombre()+" dni: "+this.getDNI()+" lenguaje: "+this.getLenguaje()+" sueldo final: "+this.calcularSueldo();
    return aux;
    }
}
