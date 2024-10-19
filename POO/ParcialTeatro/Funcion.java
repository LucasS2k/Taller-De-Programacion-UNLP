package ParcialTeatro;

public class Funcion {
    private String titulo;
    private int fecha;
    private int hora;
    private Butaca matriz[][];
    private int filas;
    private int butacasXFila;
    public Funcion(String titulo, int fecha, int hora, int N, int M) {
        this.titulo = titulo;
        this.fecha = fecha;
        this.hora = hora;
        this.filas = N;
        this.butacasXFila = M;
        this.matriz = new Butaca [N][M];
        
    for (int i=0;i<this.filas;i++){
     for (int j =0;j<this.butacasXFila;j++){
      int precio = 800+(100*i);
      String desc = "butaca: " +i+"" +j;
      this.matriz[i][j] = new Butaca(desc, precio);
      this.matriz[i][j].setEstado(false);
      }
    }
    }
    
    
    public void asignarButaca(int B, int F){
     this.matriz[B-1][F-1].setEstado(true);
        System.out.println("butaca asignada, valor: " +this.matriz[B-1][F-1].getPrecio());
    }
    
    public void desocuparButacas(int F){
     for (int i=0;i<this.butacasXFila;i++){
      this.matriz[F][i].setEstado(false);
     }
    }
    
    public void retornarCiertasButacas(int B){
    for (int i=0;i<this.filas;i++){
        System.out.println(this.matriz[i][B].toString());
    }
    }
    
    public String stringTodasLasButacas(){
    String aux = "";
for (int i=0;i<this.filas;i++){
     for (int j =0;j<this.butacasXFila;j++){
      if (this.matriz[i][j] !=null)
         aux += this.matriz[i][j].toString();
      
      }
    }return aux;
    }
    @Override
    public String toString(){
    return "titulo: "+this.titulo+"fecha: "+this.fecha+"hora: "+this.hora+stringTodasLasButacas();
    }
    }
