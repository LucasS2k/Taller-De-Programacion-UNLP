
package practicas;
import PaqueteLectura.GeneradorAleatorio;
import PaqueteLectura.Lector;
/*
 * @author Lucas
 */
public class Practica3 {
    public static void main(String[] args) {
        int matriz [][] = new int [5][5];
        for (int i= 0;i<5;i++){
        for (int j =0;j<5;j++){
        matriz [i][j] = GeneradorAleatorio.generarInt(31);
        }
        }
        for (int i= 0;i<5;i++){
        for (int j =0;j<5;j++){ 
            System.out.print(matriz[i][j]+ "\t");
        }
            System.out.println();
    }
    int totalFila = 0;
    for (int i = 0; i<5; i++){
    totalFila += matriz[0][i];
    }
        System.out.println("total de la fila: " + totalFila);
    int [] acumulador = new int [5];
    for (int i = 0;i<5;i++){
     for (int j =0;j< 5;j++){
     acumulador[j]+= matriz[i][j];}
    }
    for (int i =0;i<5;i++){
        System.out.println("cantidad en " +(i)+ " "+(acumulador[i]));
    }
        System.out.println("ingrese un numero a buscar");
        int buscado = Lector.leerInt();
        boolean finded = false;
        for (int i = 0;i<5 && !finded; i++){
         for (int j = 0;j< 5 && !finded; j++){
            if (buscado == matriz [i][j]){
                System.out.println("encontrado en fila: " +(i+1)+" y columna "+(j+1));
                finded = true;
            }
         }
         if (!finded){}
            System.out.println("no encontrado");
    }
        
    
    }
    
    
    
    
    
    
    
}
