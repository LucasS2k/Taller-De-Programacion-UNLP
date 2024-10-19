package ParcialGondolas;

public class Producto {
    private int codigo;
    private String nombre;
    private String marca;
    private int cantidad;
    private double precio;

    public Producto(int codigo, String nombre, String marca, int cantidad, double precio) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.marca = marca;
        this.cantidad = cantidad;
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    @Override
    public String toString (){
        return " codigo: "+this.codigo+" nombre: "+this.nombre+" marca: "+this.marca+" cantidad: "+this.cantidad+" precio: "+this.precio;
    }
}
