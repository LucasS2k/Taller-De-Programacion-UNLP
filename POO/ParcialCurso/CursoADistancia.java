
package ParcialCurso;

public class CursoADistancia extends Curso {
private String link;

    public CursoADistancia(String link, int anio, int max) {
        super(anio, max);
        this.link = link;
    }
    
    public boolean puedeRendir(int DNI){
    return (this.buscarAlumno(DNI).getAprobadas()> 1 && this.buscarAlumno(DNI).getAsistencias()> 1);
    }
}
