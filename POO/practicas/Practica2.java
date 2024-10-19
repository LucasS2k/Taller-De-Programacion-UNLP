/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicas;

import PaqueteLectura.Lector;

/**
 *
 * @author Lucas
 */
public class Practica2 {
    public static void main(String[] args) {
        int DF = 15;
        double [] alturas = new double [14];
        double total = 0;
        for (int i = 0; i<= 14; i++){
        System.out.println("ingrese la altura del: "+(i+1)+ " jugador" );
        alturas[i] = Lector.leerDouble();
        total += alturas[i];
        }
        
        double promedio = total / 15;
        System.out.println("el promedio de altura es: "+promedio);
        
        int superiores = 0;
        for (int i = 0; i<=14; i++){
        if (alturas[i]>promedio)
            superiores++;
        }
        System.out.println("los jugadores que superan el promedio son: "+superiores);
    }
    
}
