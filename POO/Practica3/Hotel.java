package Practica3;
public class Hotel {
    private int cantidadHabitaciones;
    private Habitacion [] habitaciones;
    
    public Hotel (int X){
    cantidadHabitaciones = X;
    habitaciones = new Habitacion[X];
    for (int i = 0;i<X;i++){
    habitaciones[i] = new Habitacion();
    }
    }

    public int getCantidadHabitaciones() {
        return cantidadHabitaciones;
    }
    public Habitacion[] getHabitaciones() {
        return habitaciones;
    }
    public void agregarCliente(Persona C, int N){
    habitaciones[N].setCliente(C);
    }
    public boolean isHabitacionOcupada(int numeroHabitacion) {
    if (numeroHabitacion < 1 || numeroHabitacion > cantidadHabitaciones) {
        System.out.println("El número de habitación no es válido.");
        return false;
    }
    return habitaciones[numeroHabitacion - 1].getOcupada();
}
    
    public void aumento(double valor){
    for (int i=0;i<this.cantidadHabitaciones;i++){
    habitaciones[i].setCosto(valor + habitaciones[i].getCosto());
    }
    }
    @Override
    public String toString(){
    String aux = "";
    for (int i = 0;i<cantidadHabitaciones;i++)
       aux+= "habitacion "+(i+1)+": "+this.habitaciones[i].toString()+"\n";
       return aux;
    }
  
    
    
}
