
package ParcialGNC;

public class Surtidor {
    private boolean estado;
    private Venta [] ventas;
    private int ventaActual;
    private int maximo;
    public Surtidor(boolean estado, int max) {
        this.estado = estado;
        this.ventas = new Venta[maximo];
        this.maximo = max;
        ventaActual = 0;
        
    }
    public boolean hayEspacio(){
    return ventaActual < this.maximo;
    }
    public String imprimirVentas(){
        String concatenar = "";
    for (int i=0;i<this.ventaActual;i++){
        concatenar += ventas[i].toString();
    }
    return concatenar;
    }
    @Override
    public String toString(){
    return "estado: "+this.estado+"ventas: " +imprimirVentas();
    }
}
