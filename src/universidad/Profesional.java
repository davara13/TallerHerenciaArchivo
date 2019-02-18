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

public class Profesional extends Sede{
    private int numeroDeProgConRegisDeAltaCalidad;
    private ArrayList<ProgramaDeFormacion> programaDeFromacion;

    public Profesional(int numeroDeProgConRegisDeAltaCalidad, ArrayList<ProgramaDeFormacion> programaDeFromacion, String nombre, String direccion, int telefono, double areaConstruida) {
        super(nombre, direccion, telefono, areaConstruida);
        this.numeroDeProgConRegisDeAltaCalidad = numeroDeProgConRegisDeAltaCalidad;
        this.programaDeFromacion = programaDeFromacion;
    }

    public int getNumeroDeProgConRegisDeAltaCalidad() {
        return numeroDeProgConRegisDeAltaCalidad;
    }

    public void setNumeroDeProgConRegisDeAltaCalidad(int numeroDeProgConRegisDeAltaCalidad) {
        this.numeroDeProgConRegisDeAltaCalidad = numeroDeProgConRegisDeAltaCalidad;
    }

    public ArrayList<ProgramaDeFormacion> getProgramaDeFromacion() {
        return programaDeFromacion;
    }

    public void setProgramaDeFromacion(ArrayList<ProgramaDeFormacion> programaDeFromacion) {
        this.programaDeFromacion = programaDeFromacion;
    }

    
    @Override
    public void darInformacion(){
    
    };
    
}
