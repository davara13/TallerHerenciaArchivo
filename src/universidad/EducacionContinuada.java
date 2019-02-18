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

public class EducacionContinuada extends Sede{
    private String nombreDelCursoMasPopular;

    public EducacionContinuada(String nombreDelCursoMasPopular, String nombre, String direccion, int telefono, double areaConstruida) {
        super(nombre, direccion, telefono, areaConstruida);
        this.nombreDelCursoMasPopular = nombreDelCursoMasPopular;
    }

    public String getNombreDelCursoMasPopular() {
        return nombreDelCursoMasPopular;
    }

    public void setNombreDelCursoMasPopular(String nombreDelCursoMasPopular) {
        this.nombreDelCursoMasPopular = nombreDelCursoMasPopular;
    }

    @Override
    public void darInformacion(){
        
    }
    
}
