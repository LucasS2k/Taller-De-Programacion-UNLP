
package ParcialGondolas;

public class Supermercado {
    private String nombre;
    private String direccion;
    private Producto matriz [][];
    private int gondolas;
    private int estantes;
    private int gondolasOcupadas;
    private int estantesOcupadas;
    public Supermercado(String nombre, String direccion, int G,int E) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.gondolas = G;
        this.estantes=E;
        this.matriz = new Producto [G][E];
        this.gondolasOcupadas = 0;
        this.estantesOcupadas = 0;
    }
    
    public String listarProductos (String M, int X){
     String aux ="";
        for (int i=0;i<this.estantes;i++){
            if (this.matriz[X][i].getMarca().equals(X))
            aux += this.matriz[X][i].toString();
     }return aux;
     } 
    
    public void agregarProducto(Producto P){
      if (gondolasOcupadas < gondolas && estantesOcupadas < estantes) {
            matriz[gondolasOcupadas][estantesOcupadas] = P;
            estantesOcupadas++;

            // Si se llenan todos las estantes de la gondola actual, avanza a la siguiente gondola
            if (estantesOcupadas == estantes) {
                gondolasOcupadas++;
                estantesOcupadas = 0; // Reinicia el estante
            }
        } else {
            System.out.println("La matriz está llena. No se pueden agregar más productos.");
        }
    }
    public int gondolaMayor(){
    int aux =0;
    int max =0;
    for (int i=0;i<gondolas;i++){
        int totalEstante = 0;
     for (int j=0;j<estantes;j++){
         if (this.matriz[i][j] != null)
         totalEstante+=this.matriz[i][j].getCantidad();
     }if ( totalEstante > aux)
         max = i; 
    }return max;
    }
    public String todosLosProductos(){
    String aux = "";
    for (int i=0;i<gondolas;i++){
        aux+= " gondola "+i;
     for (int j=0;j<estantes;j++){
         aux+= " estante "+j;
         if (this.matriz[i][j] != null)
         aux+= this.matriz[i][j].toString();
     }
    }return aux;
    }
    @Override
    public String toString(){
    return " nombre: "+this.nombre+" direccion: "+this.direccion+todosLosProductos();
    }
}
 
