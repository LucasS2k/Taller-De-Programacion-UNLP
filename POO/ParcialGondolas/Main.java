
package ParcialGondolas;

public class Main {

    public static void main(String[] args) {
       Supermercado supermercado = new Supermercado("ejemplo","dire",4,1);
       Producto prod1 = new Producto(54,"ej1","ej1",4,455);
       supermercado.agregarProducto(prod1);
       Producto prod2 = new Producto(55,"ej2","ej2",65,55);
       supermercado.agregarProducto(prod2);
       Producto prod3 = new Producto(56,"ej3","ej3",6,45);
       supermercado.agregarProducto(prod3);
       Producto prod4 = new Producto(57,"ej4","ej4",6,555);
       supermercado.agregarProducto(prod4);
       System.out.println(supermercado.toString());
       supermercado.listarProductos("ej3", 1);
       System.out.println(supermercado.gondolaMayor());
    }
    
}
