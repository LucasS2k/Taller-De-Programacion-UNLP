package ParcialSupermercado;

public class Ticket {
    private int cuit;
    private int productos;
    private double monto;
    private String medio;

    public Ticket(int cuit, int productos, double monto, String medio) {
        this.cuit = cuit;
        this.productos = productos;
        this.monto = monto;
        this.medio = medio;
    }

    public int getCuit() {
        return cuit;
    }

    public void setCuit(int cuit) {
        this.cuit = cuit;
    }

    public int getProductos() {
        return productos;
    }

    public void setProductos(int productos) {
        this.productos = productos;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public String getMedio() {
        return medio;
    }

    public void setMedio(String medio) {
        this.medio = medio;
    }
    @Override
    public String toString(){
        return "cuit del cliente: "+this.getCuit()+" cantidad de productos: "+this.getProductos()+" monto:  "+this.getMonto()+" medio de pago: "+this.getMedio();
    }
}
