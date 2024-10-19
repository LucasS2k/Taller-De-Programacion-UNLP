package ParcialProgramadores;

public class Main {

    public static void main(String[] args) {
     ProgramadorLider lider = new ProgramadorLider(5,5,"pepe",43555333,10000,300,"typescript"); 
     int cant = 4;
     Empresa empresa = new Empresa (lider,"nombre empressa", cant, 0);
     Programador dev1 = new Programador("carlos",41444555,5000,100,"java");
     Programador dev2 = new Programador ("sarita",655343,2000,400,"C");
     Programador dev3 = new Programador ("mateo",32442212,1000,400,"cobol");
     empresa.agregarProgramador(dev1);
     empresa.agregarProgramador(dev2);
     empresa.agregarProgramador(dev3);
     empresa.imprimirEmpresa();
     empresa.aumentarSueldos(1000);
     empresa.imprimirEmpresa();
     System.out.println(empresa.totalSueldos());
    }
}
