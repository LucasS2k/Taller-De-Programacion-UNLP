package Practica4;

public class Ejercicio3 {

    public static void main(String[] args) {
       Persona persona = new Persona("ejemplo", 3453453, 40);
        System.out.println(persona.toString());
       Trabajador trabajador = new Trabajador( "maestranza","ejemplo empleado", 23423, 32);
        System.out.println(trabajador.toString());
    }
    
}
