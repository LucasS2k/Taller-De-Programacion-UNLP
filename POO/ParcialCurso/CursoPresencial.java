/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ParcialCurso;

public class CursoPresencial extends Curso{
    private int aula;

    public CursoPresencial(int aula, int anio, int max) {
        super(anio, max);
        this.aula = aula;
    }
    public boolean puedeRendir(int DNI){
    return (this.buscarAlumno(DNI).getAsistencias()> 3);
    }
}
