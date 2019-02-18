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
public class Estudiante {
    private String nombre;
    private String apellido;
    private String colegio;
    private int annio;
    private ProgramaDeFormacion programaDeFormacion;

    public Estudiante(String nombre, String apellido, String colegio, int annio, ProgramaDeFormacion programaDeFormacion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.colegio = colegio;
        this.annio = annio;
        this.programaDeFormacion = programaDeFormacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getColegio() {
        return colegio;
    }

    public void setColegio(String colegio) {
        this.colegio = colegio;
    }

    public int getAnnio() {
        return annio;
    }

    public void setAnnio(int annio) {
        this.annio = annio;
    }

    public ProgramaDeFormacion getProgramaDeFormacion() {
        return programaDeFormacion;
    }

    public void setProgramaDeFormacion(ProgramaDeFormacion programaDeFormacion) {
        this.programaDeFormacion = programaDeFormacion;
    }
    
    
}
