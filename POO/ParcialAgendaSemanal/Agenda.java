package ParcialAgendaSemanal;

public class Agenda {
    private Paciente [][] matriz;
    public Agenda (int dias, int turnos){
    matriz = new Paciente [dias][turnos];
    }
    
    public void otorgarTurno (Paciente p, int dia, int turno){
    matriz [dia-1][turno-1] = p;
    }
    
    public void liberarAgenda(String nombre){
    for (int i =0;i<matriz.length;i++){
      for (int j=0;j < matriz[i].length;j++){
          if (matriz [i][j] != null && matriz[i][j].getNombre().equals(nombre)){
              matriz[i][j] = null;
          }
      }
    }}
    

     public boolean tieneTurno(String nombre, int dia) {
        if (dia < 0 || dia >= matriz.length) {
            System.out.println("Día fuera de rango");
            return false;
        }

        // Recorre todos los turnos de ese día para verificar si el paciente tiene un turno
        for (int turno = 0; turno < matriz[dia].length; turno++) {
            if (matriz[dia][turno] != null && matriz[dia][turno].getNombre().equals(nombre)) {
                return true;
            }
        }
        return false;
        }
    public void imprimirTurnos(){
    for (int i =0;i<matriz.length;i++){
     for (int j =0;j<matriz[i].length;j++){
         if(matriz[i][j] != null){
         System.out.println(this.matriz[i][j].toString());}
         else {
             System.out.println("dia: " +(i+1)+ " y turno " +(j+1)+" vacio");}
     }
    }
    }
   
}
