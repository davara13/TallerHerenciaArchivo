/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidad;

/**
 *
 * @author david
 */

import java.util.*;
import java.io.*;

public class Tecnologico extends Sede{
    private int numeroDeEstMat;
    private ArrayList<ProgramaDeFormacion> programaDeFromacion;

    public Tecnologico(int numeroDeEstMat, ArrayList<ProgramaDeFormacion> programaDeFromacion, String nombre, String direccion, int telefono, double areaConstruida) {
        super(nombre, direccion, telefono, areaConstruida);
        this.numeroDeEstMat = numeroDeEstMat;
        this.programaDeFromacion = programaDeFromacion;
    }

    public int getNumeroDeEstMat() {
        return numeroDeEstMat;
    }

    public void setNumeroDeEstMat(int numeroDeEstMat) {
        this.numeroDeEstMat = numeroDeEstMat;
    }

    public ArrayList<ProgramaDeFormacion> getProgramaDeFromacion() {
        return programaDeFromacion;
    }

    public void setProgramaDeFromacion(ArrayList<ProgramaDeFormacion> programaDeFromacion) {
        this.programaDeFromacion = programaDeFromacion;
    }
    
    
    
    @Override
    public void darInformacion(){
        
    }
}
