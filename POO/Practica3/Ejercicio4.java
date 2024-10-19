package Practica3;
import PaqueteLectura.*;
public class Ejercicio4 {

    public static void main(String[] args) {
        GeneradorAleatorio.iniciar();
        System.out.println("ingrese la cantidad de habitaciones del hotel");
        int X = Lector.leerInt();
        Hotel hotel = new Hotel(X);
        for (int i= 0;i<X;i++){
            System.out.println("ingrese el nombre del cliente:");
            String nombre = GeneradorAleatorio.generarString(6);
            System.out.println("ingrese el dni del cliente: ");
            int DNI = GeneradorAleatorio.generarInt(2000);
            System.out.println("ingrese la edad del cliente: ");
            int edad = GeneradorAleatorio.generarInt(99);
            Persona cliente = new Persona(nombre, DNI, edad);
            System.out.println("ingrese la habitacion deseada: ");
            int habitacionNro = GeneradorAleatorio.generarInt(X);
            hotel.agregarCliente(cliente, habitacionNro);
        }
        hotel.toString();
        System.out.println("ingrese el valor del aumento: ");
        double aumento = Lector.leerDouble();
        hotel.aumento(aumento);
        System.out.println(hotel.toString());
    }
    
}
