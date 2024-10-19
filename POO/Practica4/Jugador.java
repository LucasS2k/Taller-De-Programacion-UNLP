package Practica4;


public class Jugador extends Empleado{
    private int partidosJugados;
    private int goles;

    public Jugador(int partidosJugados, int goles, String nombre, double sueldoBasico, int antiguedad) {
        super(nombre, sueldoBasico, antiguedad);
        this.partidosJugados = partidosJugados;
        this.goles = goles;
    }

    public int getPartidosJugados() {
        return partidosJugados;
    }

    public void setPartidosJugados(int partidosJugados) {
        this.partidosJugados = partidosJugados;
    }

    public int getGoles() {
        return goles;
    }

    public void setGoles(int goles) {
        this.goles = goles;
    }
    public double calcularEfectividad(){
    double aux = this.goles/this.partidosJugados;
    return aux;
    }
    
    public double sueldoACobrar() {
    double sueldo = super.sueldoACobrar(); 
        if (calcularEfectividad() > 0.5) {
            sueldo += getSueldoBasico();
        }
        return sueldo;
}
    @Override
    public String toString(){
    return super.toString()+ "goles marcados: "+this.goles+" partidos jugados: "+this.partidosJugados;
    }
    
    
     
}
