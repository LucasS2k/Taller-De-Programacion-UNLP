package Practica3;
import PaqueteLectura.*;

public class Ejercicio3 {

    public static void main(String[] args) {
        GeneradorAleatorio.iniciar();
        Estante estante = new Estante();
        for (int i = 0;i<20;i++){
        Autor autor = new Autor (GeneradorAleatorio.generarString(6),GeneradorAleatorio.generarString(6),GeneradorAleatorio.generarString(4));
        Libro libro = new Libro (GeneradorAleatorio.generarString(5),"autor: ",autor,GeneradorAleatorio.generarString(4));
        estante.agregarLibro(libro);
        }
        Libro buscado = estante.devolverLibro("mujercitas");
        if (buscado != null){
            System.out.println(buscado.getPrimerAutor()+ buscado.getTitulo());
        }
    }
    
}
