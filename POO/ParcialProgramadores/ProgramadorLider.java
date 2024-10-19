/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ParcialProgramadores;

/**
 *
 * @author Lucas
 */
public class ProgramadorLider extends Programador {

    public ProgramadorLider(int proyectos, int antiguedad, String nombre, int DNI, double sueldoBasico, int lineasPorHora, String lenguaje) {
        super(nombre, DNI, sueldoBasico, lineasPorHora, lenguaje);
        this.proyectos = proyectos;
        this.antiguedad = antiguedad;
    }
    
    private int proyectos;
    private int antiguedad;

    public int getProyectos() {
        return proyectos;
    }

    public void setProyectos(int proyectos) {
        this.proyectos = proyectos;
    }

    public int getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }

    public double calcularSueldoFinal() {
        double sueldoF = super.calcularSueldo();
        sueldoF += 10000*getAntiguedad();
        sueldoF+= 2000*getProyectos();
        return sueldoF;
    }
    @Override
    public String toString(){
    String aux;
    aux = "programador lider: " +this.getNombre()+" dni: "+this.getDNI()+" lenguaje: "+this.getLenguaje()+" sueldo: "+this.calcularSueldoFinal();
    return aux;
    }
    
    
}
