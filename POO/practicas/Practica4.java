package practicas;
import PaqueteLectura.Lector;



public class Practica4 {
    public static void main(String[] args) {
        int [][] matriz = new int [8][4];
        System.out.println("ingrese su piso: ");
        int piso = Lector.leerInt();
        while (piso != 9){
        System.out.println("ingrese su oficina: ");
        int oficina = Lector.leerInt();
        matriz [piso-1][oficina-1] +=1;
        System.out.println("ingrese su piso: ");
        piso = Lector.leerInt();
        }
        
        for (int i= 0;i<8;i++){
            System.out.println("piso" +(i+1));
          for (int j =0;j<4;i++){
              System.out.println("personas en oficina: "+(j)+ " " +matriz[i][j]);
          }
    }
        
        
        
        
    }
}
