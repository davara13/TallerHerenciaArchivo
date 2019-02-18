/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidad;

import java.util.*;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author david
 */
public class Universidad {

    /**
     * @param args the command line arguments
     */
    public static void RegistrarSedes() {
        File archivo = new File("infoSedes.txt");
        FileWriter escribir;
        PrintWriter linea;
        Scanner entrada = new Scanner(System.in);
        if (!(archivo.exists())) {
            try {
                archivo.createNewFile();
            } catch (IOException ex) {
                Logger.getLogger(Universidad.class.getName()).log(Level.SEVERE, null, ex);
            }

            System.out.println("Ingrese la siguiente información de la sede: \n \n");
            System.out.println("Tipo de sede (1. Profesional - 2. tecnologico - 3. Educación continuada): ");
            int tipoDeSede;
            tipoDeSede = entrada.nextInt();
            
            if (tipoDeSede == 1) {
                /*SEDE DE TIPO PROFESIONAL*/
                String nombre, direccion;
                int telefono, altaCalidad;
                double areaConstruida;
                ArrayList<ProgramaDeFormacion> programas = new ArrayList<ProgramaDeFormacion>();
                System.out.println("\n Nombre de la sede: ");
                nombre = entrada.nextLine();
                System.out.println("\n Direccion de la sede: ");
                direccion = entrada.nextLine();
                System.out.println("\n Telefono de la sede: ");
                telefono = entrada.nextInt();
                System.out.println("\n Area Construida de la sede: ");
                areaConstruida = entrada.nextDouble();
                System.out.println("\n Numero de programas de Alta Calidad con los que cuenta la sede: ");
                altaCalidad = entrada.nextInt();

                /*PROCESO DE GUARDADO DE DATOS EN EL ARCHIVO*/
                try {
                    escribir = new FileWriter(archivo, true);
                    linea = new PrintWriter(escribir);

                    linea.println("Sede: " + nombre);
                    linea.println("Direccion: " + direccion);
                    linea.println("Telefono: " + telefono);
                    linea.println("Area Construida: " + areaConstruida);
                    linea.println("Numero de Programas con registro de alta calidad: " + altaCalidad);
                    linea.println("Programas: ");

                    System.out.println("\n Ingrese el numero de programas de Formación con los que cuenta la Sede: ");
                    int numeroProAlta = entrada.nextInt();
                    for (int i = 0; i < numeroProAlta; i++) {
                        String nombrePro, descripcion, tipo;
                        System.out.println("\n Nombre del programa de Formacion: ");
                        nombrePro = entrada.nextLine();
                        System.out.println("\n Descipcion del programa de Formacion: ");
                        descripcion = entrada.nextLine();
                        System.out.println("\n Escriba el Tipo de programa de Formacion (Profesional, tecnologico o de Educación continua): ");
                        tipo = entrada.nextLine();
                        ProgramaDeFormacion p = new ProgramaDeFormacion(nombrePro, descripcion, tipo);
                        programas.add(p);

                        linea.println("Nombre del Programa: " + nombrePro);
                        linea.println("tipo: " + tipo);
                        linea.println("Descripcion: " + descripcion);
                    }
                    
                    escribir.close();
                    linea.close();
                    
                } catch (IOException ex) {
                    Logger.getLogger(Universidad.class.getName()).log(Level.SEVERE, null, ex);
                }
                
                Profesional pro = new Profesional(altaCalidad, programas, nombre, direccion, telefono, areaConstruida);

            } else if (tipoDeSede == 2) {
                /*SEDE DE TIPO TECNOLOGICO*/
                String nombre, direccion;
                int telefono, numEstMat;
                double areaConstruida;
                ArrayList<ProgramaDeFormacion> programas = new ArrayList<ProgramaDeFormacion>();
                System.out.println("\n Nombre de la sede: ");
                nombre = entrada.nextLine();
                System.out.println("\n Direccion de la sede: ");
                direccion = entrada.nextLine();
                System.out.println("\n Telefono de la sede: ");
                telefono = entrada.nextInt();
                System.out.println("\n Area Construida de la sede: ");
                areaConstruida = entrada.nextDouble();
                System.out.println("\n Numero de Estudiantes matriculados: ");
                numEstMat = entrada.nextInt();
                System.out.println("\n Ingrese el numero de programas de Formación con los que cuenta la Sede: ");
                int numeroProAlta = entrada.nextInt();
                /*PROCESO DE GUARDADO DE DATOS EN EL ARCHIVO*/
                try {
                    escribir = new FileWriter(archivo, true);
                    linea = new PrintWriter(escribir);

                    linea.println("Sede: " + nombre);
                    linea.println("Direccion: " + direccion);
                    linea.println("Telefono: " + telefono);
                    linea.println("Area Construida: " + areaConstruida);
                    linea.println("Numero de Estudiantes Matriculados: " + numEstMat);
                    linea.println("Programas: ");

                    System.out.println("\n Ingrese el numero de programas de Formación con los que cuenta la Sede: ");
                    int numeroProAlta2 = entrada.nextInt();
                    for (int i = 0; i < numeroProAlta2; i++) {
                        String nombrePro, descripcion, tipo;
                        System.out.println("\n Nombre del programa de Formacion: ");
                        nombrePro = entrada.nextLine();
                        System.out.println("\n Descipcion del programa de Formacion: ");
                        descripcion = entrada.nextLine();
                        System.out.println("\n Escriba el Tipo de programa de Formacion (Profesional, tecnologico o de Educación continua): ");
                        tipo = entrada.nextLine();
                        ProgramaDeFormacion p = new ProgramaDeFormacion(nombrePro, descripcion, tipo);
                        programas.add(p);

                        linea.println("Nombre del Programa: " + nombrePro);
                        linea.println("tipo: " + tipo);
                        linea.println("Descripcion: " + descripcion);
                    }
                    
                    escribir.close();
                    linea.close();
                    
                } catch (IOException ex) {
                    Logger.getLogger(Universidad.class.getName()).log(Level.SEVERE, null, ex);
                }
                Tecnologico tec = new Tecnologico(numEstMat, programas, nombre, direccion, telefono, areaConstruida);

                /*SEDE DE TIPO EDUCACION CONTINUADA*/
            } else if (tipoDeSede == 3) {
                String nombre, direccion, cursoMasPopular;
                int telefono;
                double areaConstruida;
                ArrayList<ProgramaDeFormacion> programas = new ArrayList<ProgramaDeFormacion>();
                System.out.println("\n Nombre de la sede: ");
                nombre = entrada.nextLine();
                System.out.println("\n Direccion de la sede: ");
                direccion = entrada.nextLine();
                System.out.println("\n Telefono de la sede: ");
                telefono = entrada.nextInt();
                System.out.println("\n Area Construida de la sede: ");
                areaConstruida = entrada.nextDouble();
                System.out.println("\n Nombre del curso más popular: ");
                cursoMasPopular = entrada.nextLine();

                /*PROCESO DE GUARDADO DE DATOS EN EL ARCHIVO*/
                try {
                    escribir = new FileWriter(archivo, true);
                    linea = new PrintWriter(escribir);

                    linea.println("Sede: " + nombre);
                    linea.println("Direccion: " + direccion);
                    linea.println("Telefono: " + telefono);
                    linea.println("Area Construida: " + areaConstruida);
                    linea.println("Nombre del curso mas popular: " + cursoMasPopular);

                    escribir.close();
                    linea.close();
                    
                } catch (IOException ex) {
                    Logger.getLogger(Universidad.class.getName()).log(Level.SEVERE, null, ex);
                }

                EducacionContinuada edCon = new EducacionContinuada(cursoMasPopular, nombre, direccion, telefono, areaConstruida);
            }

        } else {

            System.out.println("Ingrese la siguiente información de la sede: \n \n");
            System.out.println("Tipo de sede (1. Profesional - 2. tecnologico - 3. Educación continuada): ");
            int tipoDeSede;
            tipoDeSede = entrada.nextInt();

            if (tipoDeSede == 1) {
                /*SEDE DE TIPO PROFESIONAL*/
                String nombre, direccion;
                int telefono, altaCalidad;
                double areaConstruida;
                ArrayList<ProgramaDeFormacion> programas = new ArrayList<ProgramaDeFormacion>();
                System.out.println("\n Nombre de la sede: ");
                nombre = entrada.nextLine();
                System.out.println("\n Direccion de la sede: ");
                direccion = entrada.nextLine();
                System.out.println("\n Telefono de la sede: ");
                telefono = entrada.nextInt();
                System.out.println("\n Area Construida de la sede: ");
                areaConstruida = entrada.nextDouble();
                System.out.println("\n Numero de programas de Alta Calidad con los que cuenta la sede: ");
                altaCalidad = entrada.nextInt();

                /*PROCESO DE GUARDADO DE DATOS EN EL ARCHIVO*/
                try {
                    escribir = new FileWriter(archivo, true);
                    linea = new PrintWriter(escribir);

                    linea.println("Sede: " + nombre);
                    linea.println("Direccion: " + direccion);
                    linea.println("Telefono: " + telefono);
                    linea.println("Area Construida: " + areaConstruida);
                    linea.println("Numero de Programas con registro de alta calidad: " + altaCalidad);
                    linea.println("Programas: ");

                    System.out.println("\n Ingrese el numero de programas de Formación con los que cuenta la Sede: ");
                    int numeroProAlta = entrada.nextInt();
                    for (int i = 0; i < numeroProAlta; i++) {
                        String nombrePro, descripcion, tipo;
                        System.out.println("\n Nombre del programa de Formacion: ");
                        nombrePro = entrada.nextLine();
                        System.out.println("\n Descipcion del programa de Formacion: ");
                        descripcion = entrada.nextLine();
                        System.out.println("\n Escriba el Tipo de programa de Formacion (Profesional, tecnologico o de Educación continua): ");
                        tipo = entrada.nextLine();
                        ProgramaDeFormacion p = new ProgramaDeFormacion(nombrePro, descripcion, tipo);
                        programas.add(p);

                        linea.println("Nombre del Programa: " + nombrePro);
                        linea.println("tipo: " + tipo);
                        linea.println("Descripcion: " + descripcion);
                    }
                    
                    escribir.close();
                    linea.close();
                    
                } catch (IOException ex) {
                    Logger.getLogger(Universidad.class.getName()).log(Level.SEVERE, null, ex);
                }

                Profesional pro = new Profesional(altaCalidad, programas, nombre, direccion, telefono, areaConstruida);

            } else if (tipoDeSede == 2) {
                /*SEDE DE TIPO TECNOLOGICO*/
                String nombre, direccion;
                int telefono, numEstMat;
                double areaConstruida;
                ArrayList<ProgramaDeFormacion> programas = new ArrayList<ProgramaDeFormacion>();
                System.out.println("\n Nombre de la sede: ");
                nombre = entrada.nextLine();
                System.out.println("\n Direccion de la sede: ");
                direccion = entrada.nextLine();
                System.out.println("\n Telefono de la sede: ");
                telefono = entrada.nextInt();
                System.out.println("\n Area Construida de la sede: ");
                areaConstruida = entrada.nextDouble();
                System.out.println("\n Numero de Estudiantes matriculados: ");
                numEstMat = entrada.nextInt();
                System.out.println("\n Ingrese el numero de programas de Formación con los que cuenta la Sede: ");
                int numeroProAlta = entrada.nextInt();
                /*PROCESO DE GUARDADO DE DATOS EN EL ARCHIVO*/
                try {
                    escribir = new FileWriter(archivo, true);
                    linea = new PrintWriter(escribir);

                    linea.println("Sede: " + nombre);
                    linea.println("Direccion: " + direccion);
                    linea.println("Telefono: " + telefono);
                    linea.println("Area Construida: " + areaConstruida);
                    linea.println("Numero de Estudiantes Matriculados: " + numEstMat);
                    linea.println("Programas: ");

                    System.out.println("\n Ingrese el numero de programas de Formación con los que cuenta la Sede: ");
                    int numeroProAlta2 = entrada.nextInt();
                    for (int i = 0; i < numeroProAlta2; i++) {
                        String nombrePro, descripcion, tipo;
                        System.out.println("\n Nombre del programa de Formacion: ");
                        nombrePro = entrada.nextLine();
                        System.out.println("\n Descipcion del programa de Formacion: ");
                        descripcion = entrada.nextLine();
                        System.out.println("\n Escriba el Tipo de programa de Formacion (Profesional, tecnologico o de Educación continua): ");
                        tipo = entrada.nextLine();
                        ProgramaDeFormacion p = new ProgramaDeFormacion(nombrePro, descripcion, tipo);
                        programas.add(p);

                        linea.println("Nombre del Programa: " + nombrePro);
                        linea.println("tipo: " + tipo);
                        linea.println("Descripcion: " + descripcion);
                    }
                    
                    escribir.close();
                    linea.close();
                    
                } catch (IOException ex) {
                    Logger.getLogger(Universidad.class.getName()).log(Level.SEVERE, null, ex);
                }
                Tecnologico tec = new Tecnologico(numEstMat, programas, nombre, direccion, telefono, areaConstruida);

                /*SEDE DE TIPO EDUCACION CONTINUADA*/
            } else if (tipoDeSede == 3) {
                String nombre, direccion, cursoMasPopular;
                int telefono;
                double areaConstruida;
                ArrayList<ProgramaDeFormacion> programas = new ArrayList<ProgramaDeFormacion>();
                System.out.println("\n Nombre de la sede: ");
                nombre = entrada.nextLine();
                System.out.println("\n Direccion de la sede: ");
                direccion = entrada.nextLine();
                System.out.println("\n Telefono de la sede: ");
                telefono = entrada.nextInt();
                System.out.println("\n Area Construida de la sede: ");
                areaConstruida = entrada.nextDouble();
                System.out.println("\n Nombre del curso más popular: ");
                cursoMasPopular = entrada.nextLine();

                /*PROCESO DE GUARDADO DE DATOS EN EL ARCHIVO*/
                try {
                    escribir = new FileWriter(archivo, true);
                    linea = new PrintWriter(escribir);

                    linea.println("Sede: " + nombre);
                    linea.println("Direccion: " + direccion);
                    linea.println("Telefono: " + telefono);
                    linea.println("Area Construida: " + areaConstruida);
                    linea.println("Nombre del curso mas popular: " + cursoMasPopular);

                    escribir.close();
                    linea.close();
                    
                } catch (IOException ex) {
                    Logger.getLogger(Universidad.class.getName()).log(Level.SEVERE, null, ex);
                }

                EducacionContinuada edCon = new EducacionContinuada(cursoMasPopular, nombre, direccion, telefono, areaConstruida);
            }
        }

    }

    public static void main(String[] args) {
        int controlMenu = 1;
        Scanner entrada = new Scanner(System.in);
        do {
            /*MENU DE LA APLICACION*/
            System.out.println("Aplicación de la Universidad \n \n");
            System.out.println("1. Registrar Nueva sede");
            System.out.println("2. Eliminar Sede");
            System.out.println("3. Modificar informacion de Sede");
            System.out.println("4. Consultar informacion de Sede");
            System.out.println("5. Salir");
            System.out.println("Ingrese la opción que desea: ");
            int opcion = entrada.nextInt();
            controlMenu = opcion;
            switch (opcion) {
                /*Opcion para registrar una nueva sede*/
                case 1:
                    RegistrarSedes();
                    break;
            }

        } while (controlMenu != 5);
    }

}
