package Practica4;


public class Entrenador extends Empleado{
    private int campeonatosGanados;

    public Entrenador(int campeonatosGanados, String nombre, double sueldoBasico, int antiguedad) {
        super(nombre, sueldoBasico, antiguedad);
        this.campeonatosGanados = campeonatosGanados;
    }

    public int getCampeonatosGanados() {
        return campeonatosGanados;
    }

    public void setCampeonatosGanados(int campeonatosGanados) {
        this.campeonatosGanados = campeonatosGanados;
    }
    public double calcularEfectividad(){
    return this.campeonatosGanados/this.getAntiguedad();
    }
    public double sueldoACobrar() {
        double sueldo = super.sueldoACobrar();
        if (campeonatosGanados >= 1 && campeonatosGanados <= 4) {
            sueldo += 5000;
        } else if (campeonatosGanados >= 5 && campeonatosGanados <= 10) {
            sueldo += 30000;
        } else if (campeonatosGanados > 10) {
            sueldo += 50000;
        }

        return sueldo;
    }
    @Override
    public String toString(){
    return super.toString()+"campeonatos ganados: "+this.getCampeonatosGanados();
    }
}
