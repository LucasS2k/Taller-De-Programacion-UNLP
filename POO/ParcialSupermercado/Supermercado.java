/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ParcialSupermercado;

/**
 *
 * @author Lucas
 */
public class Supermercado {
    private String direccion;
    private int ventaActual;
    private Caja[] cajas;
    private int cajasTotales;

    
    public Supermercado(String direccion, int ventaActual) {
        this.direccion = direccion;
        this.ventaActual = 0;
        this.cajasTotales=0;
        cajas = new Caja[5];
        for (int i =0;i < cajas.length;i++){
        cajas[i] = new Caja("vacia",0);
        }
    }
    public int getCajasTotales() {
        return cajasTotales;
    }

    public void setCajasTotales(int cajasTotales) {
        this.cajasTotales = cajasTotales;
    }
    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getVentaActual() {
        return ventaActual;
    }

    public void setVentaActual(int ventaActual) {
        this.ventaActual = ventaActual;
    }

    public Caja[] getCajas() {
        return cajas;
    }

    public void setCajas(Caja[] cajas) {
        this.cajas = cajas;
    }
    public void agregarCaja(int pos, Caja caja){
    this.cajas[pos-1]= caja;
    this.cajasTotales++;
    }
    public void agregarTicketACaja(int C, int cuit, int prod, int monto, String medio){
     Ticket T = new Ticket(cuit, prod, monto, medio);
     this.ventaActual++;
     this.cajas[C].agregarTicket(T);
    }
    public int obtenerCajaMenor(){
    int cajaMenor =999;
    for (int i=0;i<getCajasTotales();i++){
     if (this.cajas[i].contarCredito()<cajaMenor){
     cajaMenor = this.cajas[i].contarCredito();
     }
    }return cajaMenor+1;
    }
    public void imprimirSupermercado(){
        System.out.println("supermercado: "+this.getDireccion()+"cajas: "+this.getCajasTotales());
        for (int i =0;i<this.getCajasTotales();i++){
            System.out.println(this.cajas[i].toString());
        }
    }
    
    
}
