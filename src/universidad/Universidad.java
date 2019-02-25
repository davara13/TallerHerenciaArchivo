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
    public static void RegistrarSedes() throws IOException {
        File archivo = new File("infoSedes.txt");
        FileWriter escribir;
        PrintWriter linea;
        Scanner entrada = new Scanner(System.in);

        if (!(archivo.exists())) {
            try {
                archivo.createNewFile();

            } catch (IOException ex) {
                Logger.getLogger(Universidad.class
                        .getName()).log(Level.SEVERE, null, ex);
            }
        }
        System.out.println("Ingrese la siguiente información de la sede: \n \n");
        System.out.println("Tipo de sede (1. Profesional - 2. tecnologico - 3. Educación continuada): ");
        int tipoDeSede;
        tipoDeSede = entrada.nextInt();

        if (tipoDeSede == 1) {
            /*SEDE DE TIPO PROFESIONAL*/
            BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
            String name, direccion, aux;
            int telefono, altaCalidad;
            double areaConstruida;
            ArrayList<ProgramaDeFormacion> programas = new ArrayList<ProgramaDeFormacion>();
            System.out.println("\n Nombre de la sede: ");
            name = br1.readLine();
            System.out.println("\n Direccion de la sede: ");
            direccion = br1.readLine();
            System.out.println("\n Telefono de la sede: ");
            aux = br1.readLine();
            telefono = Integer.parseInt(aux);
            System.out.println("\n Area Construida de la sede: ");
            aux = br1.readLine();
            areaConstruida = Double.parseDouble(aux);
            System.out.println("\n Numero de programas de Alta Calidad con los que cuenta la sede: ");
            aux = br1.readLine();
            altaCalidad = Integer.parseInt(aux);

            /*PROCESO DE GUARDADO DE DATOS EN EL ARCHIVO*/
            try {
                escribir = new FileWriter(archivo, true);
                linea = new PrintWriter(escribir);
                linea.println("\nProfesional");
                linea.println("sede: " + name);
                linea.println("direccion: " + direccion);
                linea.println("telefono: " + telefono);
                linea.println("area Construida: " + areaConstruida);
                linea.println("numero de Programas con registro de alta calidad: " + altaCalidad);
                linea.println("Programas ");

                System.out.println("\n Ingrese el numero de programas de Formación con los que cuenta la Sede: ");
                int numeroProAlta = entrada.nextInt();
                for (int i = 0; i < numeroProAlta; i++) {
                    String nombrePro, descripcion, tipo;
                    System.out.println("\n Nombre del programa de Formacion: ");
                    nombrePro = br1.readLine();
                    System.out.println("\n Descipcion del programa de Formacion: ");
                    descripcion = br1.readLine();
                    System.out.println("\n Escriba el Tipo de programa de Formacion (Profesional, tecnologico o de Educación continua): ");
                    tipo = br1.readLine();
                    ProgramaDeFormacion p = new ProgramaDeFormacion(nombrePro, descripcion, tipo);
                    programas.add(p);

                    linea.println("nombre del Programa: " + nombrePro);
                    linea.println("tipo: " + tipo);
                    linea.println("descripcion: " + descripcion);
                }

                escribir.close();
                linea.close();
                br1.close();

            } catch (IOException ex) {
                Logger.getLogger(Universidad.class
                        .getName()).log(Level.SEVERE, null, ex);
            }

            Profesional pro = new Profesional(altaCalidad, programas, name, direccion, telefono, areaConstruida);

        } else if (tipoDeSede == 2) {
            /*SEDE DE TIPO TECNOLOGICA*/
            BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
            String name, direccion, aux;
            int telefono, numEstMat;
            double areaConstruida;
            ArrayList<ProgramaDeFormacion> programas = new ArrayList<ProgramaDeFormacion>();
            System.out.println("\n Nombre de la sede: ");
            name = br1.readLine();
            System.out.println("\n Direccion de la sede: ");
            direccion = br1.readLine();
            System.out.println("\n Telefono de la sede: ");
            aux = br1.readLine();
            telefono = Integer.parseInt(aux);
            System.out.println("\n Area Construida de la sede: ");
            aux = br1.readLine();
            areaConstruida = Double.parseDouble(aux);
            System.out.println("\n Numero de Estudiantes matriculados: ");
            aux = br1.readLine();
            numEstMat = Integer.parseInt(aux);

            /*PROCESO DE GUARDADO DE DATOS EN EL ARCHIVO*/
            try {
                escribir = new FileWriter(archivo, true);
                linea = new PrintWriter(escribir);
                linea.println("\nTecnologico");
                linea.println("sede: " + name);
                linea.println("direccion: " + direccion);
                linea.println("telefono: " + telefono);
                linea.println("area Construida: " + areaConstruida);
                linea.println("numero de Estudiantes matriculados:  " + numEstMat);
                linea.println("Programas ");

                System.out.println("\n Ingrese el numero de programas de Formación con los que cuenta la Sede: ");
                int numeroProAlta = entrada.nextInt();
                for (int i = 0; i < numeroProAlta; i++) {
                    String nombrePro, descripcion, tipo;
                    System.out.println("\n Nombre del programa de Formacion: ");
                    nombrePro = br1.readLine();
                    System.out.println("\n Descipcion del programa de Formacion: ");
                    descripcion = br1.readLine();
                    System.out.println("\n Escriba el Tipo de programa de Formacion (Profesional, tecnologico o de Educación continua): ");
                    tipo = br1.readLine();
                    ProgramaDeFormacion p = new ProgramaDeFormacion(nombrePro, descripcion, tipo);
                    programas.add(p);

                    linea.println("nombre del Programa: " + nombrePro);
                    linea.println("tipo: " + tipo);
                    linea.println("descripcion: " + descripcion);
                }

                escribir.close();
                linea.close();
                br1.close();

            } catch (IOException ex) {
                Logger.getLogger(Universidad.class
                        .getName()).log(Level.SEVERE, null, ex);
            }

            Tecnologico tec = new Tecnologico(numEstMat, programas, name, direccion, telefono, areaConstruida);

            /*SEDE DE TIPO EDUCACION CONTINUADA*/
        } else if (tipoDeSede == 3) {

            BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
            String name, direccion, aux, cursoMasPopular;
            int telefono, numEstMat;
            double areaConstruida;
            ArrayList<ProgramaDeFormacion> programas = new ArrayList<ProgramaDeFormacion>();
            System.out.println("\n Nombre de la sede: ");
            name = br1.readLine();
            System.out.println("\n Direccion de la sede: ");
            direccion = br1.readLine();
            System.out.println("\n Telefono de la sede: ");
            aux = br1.readLine();
            telefono = Integer.parseInt(aux);
            System.out.println("\n Area Construida de la sede: ");
            aux = br1.readLine();
            areaConstruida = Double.parseDouble(aux);
            System.out.println("\n Nombre del curso más popular: ");
            cursoMasPopular = br1.readLine();

            /*PROCESO DE GUARDADO DE DATOS EN EL ARCHIVO*/
            try {
                escribir = new FileWriter(archivo, true);
                linea = new PrintWriter(escribir);

                linea.println("\nSede: " + name);
                linea.println("direccion: " + direccion);
                linea.println("telefono: " + telefono);
                linea.println("area Construida: " + areaConstruida);
                linea.println("nombre del curso mas popular: " + cursoMasPopular);

                escribir.close();
                linea.close();

            } catch (IOException ex) {
                Logger.getLogger(Universidad.class
                        .getName()).log(Level.SEVERE, null, ex);
            }

            EducacionContinuada edCon = new EducacionContinuada(cursoMasPopular, name, direccion, telefono, areaConstruida);
        }

    }

    public static void EliminarSede(String sede) throws FileNotFoundException, IOException {
        File f1 = new File("infoSedes.txt");
        File f2 = new File("fichero2.txt");
        String cadena = null;
        if (!f2.exists()) {
            f2.createNewFile();
        }
        FileWriter fw;
        PrintWriter pw;
        try {
            fw = new FileWriter(f2, true);
            FileReader fr = new FileReader(f1);
            pw = new PrintWriter(fw);
            BufferedReader br;
            br = new BufferedReader(fr);

            do {
                cadena = br.readLine();
                if (cadena != null) {

                    if (cadena.equals("sede: " + sede)) {
                        do {
                            cadena = br.readLine();
                        } while (cadena != null && !cadena.equals("Profesional") && !cadena.equals("Tecnologico") && !cadena.equals("Educacion"));
                        //pw.println("");
                    }
                }
                pw.println(cadena);
            } while (cadena != null);

            cadena = f1.getName();

            File f3 = new File(cadena);
            //f3.createNewFile();
            System.out.println(f3.getName());
            //f2.renameTo(f3);
            fw.close();
            pw.close();
            fr.close();
            br.close();
            f1.delete();
            f2.renameTo(f3);

        } catch (IOException ex) {
            Logger.getLogger(Universidad.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void ModificarSede(String sede, String que, String porQue) throws FileNotFoundException, IOException {
        File f1 = new File("infoSedes.txt");
        File f2 = new File("fichero2.txt");
        String cadena = null;
        String prueba = null;
        String prueba2 = null;
        StringTokenizer control;
        StringTokenizer control2;
        if (!f2.exists()) {
            f2.createNewFile();
        }
        FileWriter fw;
        PrintWriter pw;
        try {
            fw = new FileWriter(f2, true);
            FileReader fr = new FileReader(f1);
            pw = new PrintWriter(fw);
            BufferedReader br;
            br = new BufferedReader(fr);

            do {
                cadena = br.readLine();
                if (cadena != null) {

                    if (cadena.equals("sede: " + sede)) {
                        if (que.equals("nombre")) {
                            pw.println("sede: " + porQue);
                        } else {
                            pw.println(cadena);
                            do {
                                cadena = br.readLine();
                                if (cadena != null && !cadena.equals("")) {
                                    control = new StringTokenizer(cadena);
                                    control2 = new StringTokenizer(que);
                                    prueba = control.nextToken();
                                    prueba2 = control2.nextToken();
                                    if (prueba.equals(prueba2 + ":")) {
                                        pw.println(que + ": " + porQue);
                                    } else if (!cadena.equals("Profesional") && !cadena.equals("Tecnologico") && !cadena.equals("Educacion")) {
                                        pw.println(cadena);
                                    }
                                }
                            } while (cadena != null && !prueba.equals("Sede:") && !prueba.equals("Profesional") && !prueba.equals("Tecnologico") && !prueba.equals("Educacion"));
                            pw.println("");
                        }
                    }

                    if (cadena.equals(que)) {
                        pw.println(porQue);
                    } else {
                        pw.println(cadena);
                    }
                }

            } while (cadena != null);

            cadena = f1.getName();

            File f3 = new File(cadena);
            //f3.createNewFile();
            System.out.println(f3.getName());
            //f2.renameTo(f3);
            fw.close();
            pw.close();
            fr.close();
            br.close();
            f1.delete();
            f2.renameTo(f3);

        } catch (IOException ex) {
            Logger.getLogger(Universidad.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static void ConsultarSede(String sede) {
        String cadena = null;
        String prueba = null;
        String palabraClave = "";
        String palabraClave2 = "sede:";
        String palabraClave3 = "Profesional";
        String palabraClave4 = "Tecnologico";
        String palabraClave5 = "Educacion";
        File archivo = new File("infoSedes.txt");
        FileReader ArchivoMostrar;
        StringTokenizer control;
        try {
            ArchivoMostrar = new FileReader(archivo);
            BufferedReader br = new BufferedReader(ArchivoMostrar);
            do {
                cadena = br.readLine();
                if (cadena != null) {
                    if (!cadena.equals(palabraClave)) {
                        control = new StringTokenizer(cadena);
                        prueba = control.nextToken();
                    }
                    if (cadena.equals("sede: " + sede)) {
                        System.out.println(cadena);
                        do {
                            cadena = br.readLine();
                            if (!cadena.equals(palabraClave)) {
                                control = new StringTokenizer(cadena);
                                prueba = control.nextToken();
                            }
                            if (!prueba.equals(palabraClave2) && !prueba.equals(palabraClave3) && !prueba.equals(palabraClave4) && !prueba.equals(palabraClave5)) {
                                System.out.println(cadena);
                            }
                        } while (!prueba.equals(palabraClave2) && cadena != null);
                    }

                }
            } while (cadena != null);

            br.close();
            ArchivoMostrar.close();

        } catch (FileNotFoundException ex) {
            Logger.getLogger(Universidad.class
                    .getName()).log(Level.SEVERE, null, ex);

        } catch (IOException ex) {
            Logger.getLogger(Universidad.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void main(String[] args) throws IOException {
        int controlMenu = 1;
        String aux;
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        do {
            /*MENU DE LA APLICACION*/
            System.out.println("\n Aplicación de la Universidad");
            System.out.println("1. Registrar Nueva sede");
            System.out.println("2. Eliminar Sede");
            System.out.println("3. Modificar informacion de Sede");
            System.out.println("4. Consultar informacion de Sede");
            System.out.println("5. Salir");
            System.out.println("Ingrese la opción que desea: ");

            aux = entrada.readLine();
            int opcion = Integer.parseInt(aux);
            controlMenu = opcion;
            switch (opcion) {
                /*Opcion para registrar una nueva sede*/
                case 1:
                    RegistrarSedes();
                    break;

                case 2:
                    String sede;
                    Scanner entradaSede = new Scanner(System.in);
                    System.out.println("Ingrese el nombre de la sede a Eliminar");
                    sede = entradaSede.next();
                    try {
                        EliminarSede(sede);

                    } catch (FileNotFoundException ex) {
                        Logger.getLogger(Universidad.class
                                .getName()).log(Level.SEVERE, null, ex);
                    }
                    break;
                case 3:
                    String cualSede,que,porQue;
                    Scanner entradaMod = new Scanner(System.in);
                    System.out.println("Ingrese el nombre de la sede a Modificar");
                    cualSede = entradaMod.nextLine();
                    System.out.println("Ingrese que desea modificar de la sede: (nombre, direccion, etc)");
                    que = entradaMod.nextLine();
                    System.out.println("Ingrese nuevo " + que + " que desea:");
                    porQue = entradaMod.nextLine();

                    ModificarSede(cualSede, que, porQue);

                    break;
                case 4:
                    String sede4;
                    Scanner entradaSede4 = new Scanner(System.in);
                    System.out.println("Ingrese el nombre de la sede a Consultar");
                    sede4 = entradaSede4.next();
                    ConsultarSede(sede4);
                    break;
            }

        } while (controlMenu != 5);
        if (controlMenu == 5) {
            entrada.close();
        }
    }

}
