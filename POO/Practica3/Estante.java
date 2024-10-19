package Practica3;


public class Estante {
    private Libro [] libros;
    private int dimL;
    
    public Estante(){
    libros = new Libro [20];
    dimL = 0;
    }
    public int getCantidad(){
    return dimL;
    }
    public boolean estaLleno (){
    return dimL == 20;
    }
    public void agregarLibro (Libro libro){
    if (dimL<20){
    libros[dimL] = libro;
    dimL++;
    }
    
    }
    public Libro devolverLibro(String nombre){
    int i = 0;
    while(i<dimL){
    if (nombre.equals(this.libros[i].getTitulo()))
        return this.libros[i];
    i++;
    }
    return null;
    }
    
    
    
}
