package Practica4;

public abstract class Empleado {
    private String nombre;
    private double sueldoBasico;
    private int antiguedad;

    public Empleado(String nombre, double sueldoBasico, int antiguedad) {
        this.nombre = nombre;
        this.sueldoBasico = sueldoBasico;
        this.antiguedad = antiguedad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSueldoBasico() {
        return sueldoBasico;
    }

    public void setSueldoBasico(double sueldoBasico) {
        this.sueldoBasico = sueldoBasico;
    }

    public int getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }
    
    public abstract double calcularEfectividad();
    public double sueldoACobrar() {
        return getSueldoBasico() + (getSueldoBasico() * 0.10 * getAntiguedad());
    }
    @Override
    public String toString(){
    String aux = "nombre: "+this.getNombre()+" sueldo: "+this.sueldoACobrar()+" efectividad: "+this.calcularEfectividad()+" % ";
        return aux;
    }
}
