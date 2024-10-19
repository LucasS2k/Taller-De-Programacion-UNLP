/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicas;
import PaqueteLectura.GeneradorAleatorio;
/**
 *
 * @author Lucas
 */
public class Practicas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int DF = 11;
        int [] tabla = new int [DF];
        int i;
        for (i = 0; i<DF;i++)
            tabla[i]=2*i;
        GeneradorAleatorio.iniciar();
        int random = GeneradorAleatorio.generarInt(12);
        while(random != 11) {
            System.out.println("el numero es: " + random);
            System.out.println("el resultado de multiplicarlo es: " + tabla [random] );
            random = GeneradorAleatorio.generarInt(12);
        }
        
        
        
    }
    
}
