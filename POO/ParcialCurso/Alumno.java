
package ParcialCurso;

public class Alumno {
    private int dni;
    private String nombre;
    private int asistencias;
    private int aprobadas;

    public Alumno(int dni, String nombre) {
        this.dni = dni;
        this.nombre = nombre;
        this.asistencias = 0;
        this.aprobadas = 0;
    }    
    
    public void incrementarAsistencia(){
    this.asistencias++;
    }
    
    public void incrementarAprobadas(){
    this.aprobadas++;
    }

    public int getDni() {
        return dni;
    }

    public int getAsistencias() {
        return asistencias;
    }

   

    public int getAprobadas() {
        return aprobadas;
    }

   
}
