package ParcialGNC;

public class Estacion {
    private String direccion;
    private double precio;
    private Surtidor []surtidores;
    private int maxVentas;

    public Estacion(String direccion, double precio, int maxVentas) {
        this.direccion = direccion;
        this.precio = precio;
        this.surtidores = new Surtidor[6];
        this.maxVentas = maxVentas;
    }  
}
