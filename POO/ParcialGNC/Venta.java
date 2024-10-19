
package ParcialGNC;

public class Venta {
    private int dni;
    private int cantidad;
    private double monto;
    private String medio;

    public Venta(int dni, int cantidad, double monto, String medio) {
        this.dni = dni;
        this.cantidad = cantidad;
        this.monto = monto;
        this.medio = medio;
    }
    @Override
    public String toString(){
    return "dni: "+this.dni+" cantidad: "+this.cantidad+" monto: "+this.monto+" medio: "+this.medio;
    
    }
}
