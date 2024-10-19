package Practica4;
import PaqueteLectura.*;
public class Ejercicio2 {

    public static void main(String[] args) {
        System.out.println("ingrese los partidos jugados");
        int partidos = Lector.leerInt();
        System.out.println("ingrese los goles marcados: ");
        int goles = Lector.leerInt();
        System.out.println("ingrese el nombre del jugador: ");
        String nombre = Lector.leerString();
        System.out.println("ingrese el sueldo: ");
        double sueldo = Lector.leerDouble();
        System.out.println("ingrese la antiguedad: ");
        int antiguedad = Lector.leerInt();
        Jugador jugador = new Jugador(partidos, goles, nombre, sueldo, antiguedad);
        System.out.println(jugador.toString());
        System.out.println("ingrese los campeonatos ganados");
        int campeonatos = Lector.leerInt();
        System.out.println("ingrese el nombre del entrenador: ");
        String nombreEntrenador = Lector.leerString();
        System.out.println("ingrese el sueldo: ");
        double sueldoEntrenador = Lector.leerDouble();
        System.out.println("ingrese la antiguedad: ");
        int antiguedadEntrenador = Lector.leerInt();
        Entrenador entrenador = new Entrenador(campeonatos,nombreEntrenador,sueldoEntrenador,antiguedadEntrenador);
        System.out.println(entrenador.toString());
    }
    
}
