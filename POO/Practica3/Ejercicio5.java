package Practica3;
import PaqueteLectura.*;
public class Ejercicio5 {
   
    public static void main(String[] args) {
        System.out.println("ingrese el radio de su circulo: ");
       double radioIngresado = Lector.leerDouble();
        System.out.println("ingrese el relleno de su circulo: ");
       String relleno = Lector.leerString();
        System.out.println("ingrese el borde de su circulo: ");
       String borde = Lector.leerString();
       Circulo circulo = new Circulo (radioIngresado,relleno,borde);
       
      System.out.println("area: "+ circulo.CalcularArea());
      System.out.println("perimetro: "+circulo.CalcularPerimetro());
       
    }
    
}
