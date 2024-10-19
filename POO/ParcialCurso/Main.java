package ParcialCurso;

public class Main {

    public static void main(String[] args) {
     CursoADistancia cursoAD = new CursoADistancia("distancia",23,10);
     CursoPresencial cursoP = new CursoPresencial(2,22,2);
     Alumno alu1 = new Alumno(2,"nombre1");
     cursoAD.agregarAlumno(alu1);
     Alumno alu2 = new Alumno(1,"nombre2");
     cursoP.agregarAlumno(alu2);
     cursoP.incrementarApro(1);
     cursoP.incrementarApro(1);
     cursoAD.incrementarAsis(2);
        System.out.println(cursoAD.alumnosQuePuedenRendir());
        System.out.println(cursoP.alumnosQuePuedenRendir());
    }
    
}
