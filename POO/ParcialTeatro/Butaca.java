package ParcialTeatro;

public class Butaca {
    private String descriptor;
    private double precio;
    private boolean estado;

    public Butaca(String descriptor, double precio) {
        this.descriptor = descriptor;
        this.precio = precio;
        this.estado = false;
    }

    public String getDescriptor() {
        return descriptor;
    }

    public void setDescriptor(String descriptor) {
        this.descriptor = descriptor;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    @Override
    public String toString(){
        return ""+this.descriptor+" precio: "+this.precio+" estado: "+this.estado;
    }
    
}
