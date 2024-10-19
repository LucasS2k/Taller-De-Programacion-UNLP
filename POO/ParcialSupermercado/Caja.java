package ParcialSupermercado;

public class Caja {
    private String cajero;
    private int ticketsMaximos;
    private int ticketsTotales;
    private Ticket[] ticket;
    public Caja(String cajero, int ticketsMaximos) {
        this.cajero = cajero;
        this.ticketsMaximos = ticketsMaximos;
        this.ticketsTotales = 0;
        ticket = new Ticket[ticketsMaximos];
    }

    public String getCajero() {
        return cajero;
    }

    public void setCajero(String cajero) {
        this.cajero = cajero;
    }

    public int getTicketsMaximos() {
        return ticketsMaximos;
    }

    public void setTicketsMaximos(int ticketsMaximos) {
        this.ticketsMaximos = ticketsMaximos;
    }

    public int getTicketsTotales() {
        return ticketsTotales;
    }

    public void setTicketsTotales(int ticketsTotales) {
        this.ticketsTotales = ticketsTotales;
    }
    public void agregarTicket( Ticket ticket){
     if ( this.getTicketsTotales()< this.getTicketsMaximos())
         this.ticket[getTicketsTotales()] = ticket;
         this.ticketsTotales++;
    }
    public int contarCredito(){
    int total =0;
        for (int i=0;i< getTicketsTotales();i++){
         if (this.ticket[i].getMedio().equals("credito"))
             total ++;
    }return total;
    }
    public String toString(){
    String aux = "cajero: "+this.getCajero()+" tickets emitidos: "+this.getTicketsTotales();
    for (int i=0;i<ticketsTotales;i++){
      aux+= ticket[i].toString();
    }return aux;
    }
}
