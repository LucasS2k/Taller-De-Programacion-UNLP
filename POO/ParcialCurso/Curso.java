package ParcialCurso;

public abstract class Curso {
    private int anio;
    private Alumno alumnos[];
    private int max;
    private int dimL;
    public Curso(int anio, int max) {
        this.anio = anio;
        this.alumnos = new Alumno[max];
        this.dimL =0;
    }
    public boolean agregarAlumno(Alumno A){
     if (dimL < this.max){
        this.alumnos[dimL] = A;
        dimL ++;
        return true;}
     else return false;
    }
    
    public void incrementarAsis(int DNI){
     for (int i=0;i<this.dimL;i++){
      if (this.alumnos[i].getDni() == DNI){
          this.alumnos[i].incrementarAsistencia();
      }
     }
    }
    
    public void incrementarApro(int DNI){
     for (int i=0;i<this.dimL;i++){
      if (this.alumnos[i].getDni() == DNI){
          this.alumnos[i].incrementarAprobadas();
      }
     }
    }
    public Alumno buscarAlumno(int DNI){
    for (int i=0;i<this.dimL;i++){
      if (this.alumnos[i] != null)
      if (this.alumnos[i].getDni() == DNI){
          return this.alumnos[i];
      }
    }return null;
    }
    
    public int alumnosQuePuedenRendir(){
        int aux =0;
    for (int i=0;i<dimL;i++){
      if (puedeRendir(this.alumnos[i].getDni()))
          aux ++;
    }return aux;
    }
    public abstract boolean puedeRendir(int DNI);
    
    
}
