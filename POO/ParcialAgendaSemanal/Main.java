package ParcialAgendaSemanal;


public class Main {

    public static void main(String[] args) {
     Agenda agenda = new Agenda(5,6);
     Paciente uno = new Paciente ("mario", false, 35);
     Paciente dos = new Paciente ("maria",true,40);
     agenda.otorgarTurno(uno, 2, 2);
     agenda.otorgarTurno(dos, 2, 3);
     agenda.liberarAgenda("mario");
     System.out.println("este paciente tiene turno este dia?"+agenda.tieneTurno("maria", 2));
     agenda.imprimirTurnos();
    }
    
}
