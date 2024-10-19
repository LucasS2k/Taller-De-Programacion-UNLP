package ParcialLotes;

public class Lote {
    private double precio;
    private Comprador comprador;

    public Lote() {
        this.precio = 5000;
    }

    public double getPrecio() {
        return precio;
    }

    public Comprador getComprador() {
        return comprador;
    }

    
    
    public void anadirComprador (Comprador C) {
        this.comprador = C;
    }
    
    public void aumento(double valor){
    this.precio = this.precio+(this.precio * (valor / 100));
    }
    
    @Override
    public String toString(){
    return "precio: "+this.precio+ "comprador: "+ this.comprador.toString();
    }
}
