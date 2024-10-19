package Practica2;
import PaqueteLectura.*;

public class Ejercicio2 {
    public static void main(String[] args) {
    GeneradorAleatorio.iniciar();
     int dimF = 14; 
    Persona [] personas = new Persona[dimF]; 
    int dimL = 0;
    int edad = GeneradorAleatorio.generarInt(99);
    while ((dimL < dimF) &&(edad!=0)){
    personas [dimL] = new Persona();
      personas[dimL].setDNI(GeneradorAleatorio.generarInt(1000));
      personas[dimL].setEdad(edad);        
      personas[dimL].setNombre(GeneradorAleatorio.generarString(10));        
      dimL++;
      edad = GeneradorAleatorio.generarInt(99);
    }
    int dniMin = 999999;
    int mayores = 0;
    for (int i = 0;i<dimL;i++){
        System.out.println(personas[i].getDNI());
        System.out.println(personas[i].getEdad());
        System.out.println(personas[i].getNombre());     
    }
    
    for (int i =0 ;i<dimL;i++){
    int dniActual = personas[i].getDNI();
    if (dniActual < dniMin){
    dniMin = dniActual;
    }
    if (personas[i].getEdad() > 65){
        mayores += 1;
    }
    }
    
        System.out.println("el dni mas chico es: "+dniMin);
        System.out.println("cantidad de mayores a 65: " +mayores);
    
    
    
    }
   
}
