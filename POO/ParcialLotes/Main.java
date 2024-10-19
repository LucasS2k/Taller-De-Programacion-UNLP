package ParcialLotes;

public class Main {

    public static void main(String[] args) {
        Barrio barrio = new Barrio("los teros",6,9);
        Comprador comprador1 = new Comprador (2344, "pepe","paez","romero");
        Comprador comprador2 = new Comprador (2344, "pepe","paez","romero");
        Comprador comprador3 = new Comprador (2344, "pepe","paez","romero");
        Comprador comprador4 = new Comprador (2344, "pepe","paez","romero");
        Comprador comprador5 = new Comprador (2344, "pepe","paez","romero");
        barrio.anadirComprador(comprador5, "ciudad5", 2, 4);
        barrio.anadirComprador(comprador2, "ciudad2", 2, 1);
        barrio.imprimirBarrio();
    }
    
}
