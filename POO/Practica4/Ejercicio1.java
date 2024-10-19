package Practica4;

import PaqueteLectura.*;
public class Ejercicio1 {

    public static void main(String[] args) {
        System.out.println("ingrese el primer lado de su triangulo");
        double ladoA = Lector.leerDouble();
        System.out.println("ingrese el segundo lado de su triangulo");
        double ladoB = Lector.leerDouble();
        System.out.println("ingrese el tercer lado de su triangulo");
        double ladoC = Lector.leerDouble();
        System.out.println("ingrese el relleno de su triangulo");
        String rellenoTriangulo = Lector.leerString();
        System.out.println("ingrese el borde de su triangulo");
        String bordeTriangulo = Lector.leerString();
        Triangulo triangulo = new Triangulo(ladoA,ladoB,ladoC,rellenoTriangulo,bordeTriangulo);
        System.out.println("ingrese el radio de su circulo");
        double radio = Lector.leerDouble();
        System.out.println("ingrese el relleno de su circulo");
        String rellenoCirculo = Lector.leerString();
        System.out.println("ingrese el borde de su circulo");
        String bordeCirculo = Lector.leerString();
        Circulo circulo = new Circulo(radio,rellenoCirculo,bordeCirculo);
        System.out.println(triangulo.toString());
        circulo.despintar();
        System.out.println(circulo.toString());
    }
    
}
