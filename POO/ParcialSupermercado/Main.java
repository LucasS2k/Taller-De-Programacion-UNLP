package ParcialSupermercado;

public class Main {

    public static void main(String[] args) {
       Supermercado supermercado = new Supermercado("dire ", 5);
       Caja caja1 = new Caja("cajero 1",5);
       Caja caja2 = new Caja("cajero 2",3);
       Caja caja3 = new Caja("cajero 3",6);
       supermercado.agregarCaja(1, caja1);
       supermercado.agregarCaja(2, caja2);
       supermercado.agregarCaja(3, caja3);
       supermercado.agregarTicketACaja(1, 4234, 5, 2000, " credito ");
       supermercado.agregarTicketACaja(1, 5555, 2, 2000, " debito ");
       supermercado.imprimirSupermercado();
        System.out.println("la caja con menos ventas hechas por credito es: "+supermercado.obtenerCajaMenor());
    }
    
}
