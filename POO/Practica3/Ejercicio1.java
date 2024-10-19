package Practica3;
import PaqueteLectura.*;
public class Ejercicio1 {
    public static void main(String[] args) {
        System.out.println("ingrese el primer lado ");
        double lado = Lector.leerDouble();
        System.out.println("ingrese el segundo lado ");
        double lado2 = Lector.leerDouble();
        System.out.println("ingrese el tercer lado ");
        double lado3 = Lector.leerDouble();
        System.out.println("ingrese el color de relleno: ");
        String relleno = Lector.leerString();
        System.out.println("ingrese el color de borde: ");
        String borde = Lector.leerString();
        Triangulo triangulo = new Triangulo(lado,lado2,lado3,relleno, borde);
         System.out.println("el perimetro es de: " +triangulo.calcularPerimetro());
         System.out.println("el area es de : "+triangulo.calcularArea());
       
    }
    
}
