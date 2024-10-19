package ParcialProgramadores;

public class Empresa {
    private ProgramadorLider pl;
    private String nombreEmpresa;
    private int maximoProgramadores;
    private int programadoresActuales;
    private Programador programadores[];

    public Empresa(ProgramadorLider pl, String nombreEmpresa, int maximoProgramadores, int programadoresActuales) {
        this.pl = pl;
        this.nombreEmpresa = nombreEmpresa;
        this.maximoProgramadores = maximoProgramadores;
        this.programadoresActuales = 0;
        this.programadores = new Programador [maximoProgramadores];
    }

    public ProgramadorLider getPl() {
        return pl;
    }

    public void setPl(ProgramadorLider pl) {
        this.pl = pl;
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    public int getProgramadoresActuales() {
        return programadoresActuales;
    }

    public void setProgramadoresActuales(int programadoresActuales) {
        this.programadoresActuales = programadoresActuales;
    }

    public Programador[] getProgramadores() {
        return programadores;
    }

    public void setProgramadores(Programador[] programadores) {
        this.programadores = programadores;
    }

    
    public void setMaximoProgramadores(int maximoProgramadores) {
        this.maximoProgramadores = maximoProgramadores;
    }

    public int getMaximoProgramadores() {
        return maximoProgramadores;
    }
    public boolean hayEspacio(){
    if (this.getProgramadoresActuales()<this.getMaximoProgramadores()){
        return true;
    }return false;
    }
    public void agregarProgramador(Programador p){
        if(hayEspacio()){
        this.programadores[this.getProgramadoresActuales()] = p;
        this.programadoresActuales++;
        }
    }
    public void imprimirEmpresa(){
        System.out.println(this.nombreEmpresa);
        System.out.println(pl.toString());
        for (int i =0 ;i<this.getProgramadoresActuales();i++){
            System.out.println(this.programadores[i].toString());
        }
    }
    public void aumentarSueldos(double M){
    for (int i =0;i< getProgramadoresActuales();i++){
     this.programadores[i].aumento(M);
    }
    this.pl.aumento(M);
    }
    
    public double totalSueldos(){
    double total = 0;
    for (int i=0;i<getProgramadoresActuales();i++){
    total += this.programadores[i].calcularSueldo();
    }
    total += this.pl.calcularSueldoFinal();
    return total;
    }
}
