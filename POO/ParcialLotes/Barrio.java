package ParcialLotes;

public class Barrio {
    private String nombre;
    private int lotes;
    private int manzanas;
    private Lote [][] matriz;

    public Barrio(String nombre, int lotes, int manzanas) {
        this.nombre = nombre;
        this.lotes = lotes;
        this.manzanas = manzanas;
        this.matriz = new Lote[manzanas][lotes];
        this.inicializarMatriz();
    }
    public void inicializarMatriz(){
    for (int i =0 ;i<this.manzanas;i++){
     for (int j=0;j<this.lotes;j++){
      this.matriz[i][j] = new Lote();
     }
    }
    }
    
    public void anadirComprador(Comprador C, String ciudad, int lote, int manzana){
     this.matriz[manzana][lote].anadirComprador(C);
    }
    
    public void incrementarPrecio(int X, int P){
    for (int i=0;i<this.lotes;i++){
        if (this.matriz[X][i].getComprador()== null){
        this.matriz[X][i].aumento(P);
        }
    }
    }
    
    public double retornarRecaudacion(){
    double total = 0.0;
    for (int i =0 ;i<this.manzanas;i++){
     for (int j=0;j<this.lotes;j++){
      if (this.matriz[i][j].getComprador() != null){
        total += this.matriz[i][j].getPrecio(); 
      }}
     }
    return total;
    }
    public void imprimirBarrio(){
        System.out.println("barrio: "+this.nombre);
        System.out.println("recaudacion total: "+this.retornarRecaudacion());
        for(int i =0 ;i<this.manzanas;i++){
         System.out.println("manzana: #"+ i);
         for (int j=0;j<lotes;j++){    
             System.out.println("lote: #" +j);
             System.out.println("precio: "+matriz[i][j].getPrecio());
             if (matriz[i][j].getComprador()!= null){
             System.out.println(matriz[i][j].getComprador().toString());}
             else System.out.println("vacio");
         }
        }
    }
    
}
