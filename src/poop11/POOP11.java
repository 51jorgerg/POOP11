/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poop11;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Clase Principal
 * @author poo03alu27
 */
public class POOP11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Crear un archivo de texto plano
        File archivo = new File("archivo.txt");
        
        //verificar si el archivo existe
        System.out.println(archivo.exists());
        try {
            boolean seCreo = archivo.createNewFile();
            System.out.println(archivo.exists());
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        
        //FileWriter
        System.out.println("······FileWriter········");
        
        
        try{
            //Mediante un BufferedReader leer la entrada del sistema
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Escribe texto para el archivo: ");
            String texto = br.readLine();
            
            //imprimir la entrada
            System.out.println(texto);
            
            //Mediante un Filewriter crear un archivo de texto
            FileWriter fw = new FileWriter("archivo.txt");
            //crear un BufferedWriter con el FileWriter
            BufferedWriter bw = new BufferedWriter(fw);
            //Crear un PrinterWriter llamado salida con el BufferedWriter
            PrintWriter salida = new PrintWriter(bw);
            
            //Escribir la entrada en el archivo de texto e imprimir la misma
            salida.println(texto);
            //Escribir una segunda linea en el archivo de texto e imprimir la misma
            salida.println("Esta es la segunda linea");
            
            //Escribir las lineas enumeradas en el archivo de texto e imprimir cada una
            for (int i = 0; i < 10; i++) {
                salida.println("Linea "+ i);
            }
            
            //Escribir la frase cargando archivo en determinados porcentajes en el archivo de texto
            //Ademas de imprimir cada una
            for (int i = 0; i < 10; i++) {
                salida.println("Cargando archivo: "+i*10+"%");
            }
            
            //Cerrar el archivo de texto
            salida.close();
            
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        //FileReader
        System.out.println("########FileReader########");
        
        try{
            //Mediante un FileReader abrir el archivo de texto creado
            FileReader fr = new FileReader("archivo.txt");
            //Crear un BufferedReader con el FileReader
            BufferedReader br = new BufferedReader(fr);
            
            System.out.println("####");
            System.out.println("El texto del archivo es: ");
            //Leer la primera linea del archivo de texto
            String linea = br.readLine();
            
            //Mientras que exista una linea de texto en el archivo 
            while(linea != null){
                //Imprimir la linea de texto
                System.out.println(linea);
                //Moverse a la siguiente linea
                linea = br.readLine();
            }
            //Cerrar el archivo
            fr.close();
            
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        
        //Tokenizer
        System.out.println("######## String Tokenizer ########");
        
        //Cadena de valores de un alumno separados por comas
        String alumnoParseado = "Erick Fernando,Soto,Bolaños,321184593,18,3";
        
        //Imprimir la cadena del alumno
        System.out.println(alumnoParseado);
        
        //Crear un tokenizador con la cadena del alumno
        //El tokenizer reconocera cada coma como un token
        StringTokenizer tokenizador = new StringTokenizer(alumnoParseado,",");
        
        //Mientras que la cadena tenga tokens(comas)
        while(tokenizador.hasMoreTokens()){
            //Imprimir el valor correspondiente hasta llegar a un token (coma)
            System.out.println(tokenizador.nextToken());
        }
        
        System.out.println("#################");
        System.out.println("");
        
        //Crear alumnos con distintos datos usando la clase Alumno
        //Imprimir cada uno de los alumnos
        Alumno alumno1 = new Alumno ("Rodrigo ","Ceron","Noriega",321205476,19,3);
        System.out.println(alumno1);
        
        Alumno alumno2 = new Alumno ("Miguel Alejandro","Vazquez","Hernandez",321206745,20,3);
        System.out.println(alumno2);
        
        Alumno alumno3 = new Alumno ("Jonatan Giovanni","Ramirez","Galindo",321259637,17,0);
        System.out.println(alumno3);
        
        Alumno alumno4 = new Alumno ("Javier Alejandro","Toledo","Hidalgo",378195476,19,1);
        System.out.println(alumno4);
        
        Alumno alumno5 = new Alumno ("Jose","Mora","Franco",456705476,19,3);
        System.out.println(alumno5);
        
        System.out.println("##############");
        
        //Crear una lista de alumnos
        ArrayList<Alumno> lista = new ArrayList<Alumno>();
        
        //Añadir los alumnos creados a la lista
        lista.add(alumno1);
        lista.add(alumno2);
        lista.add(alumno3);
        lista.add(alumno4);
        lista.add(alumno5);
        
        
        //Para cada uno de los alumnos de la lista
        for (Alumno alumno : lista){
            //Imprimir unicamente el nombre del alumno
            System.out.println(alumno.getNombre());
        }
        
        System.out.println("Escribiendo archivo");
        try{
            //Mediate un FileWriter crear un archivo csv de los alumnos
            FileWriter fw = new FileWriter("alumnos.csv");
            //Crear un BufferedWriter con el archivo de los alumnos
            BufferedWriter bw = new BufferedWriter(fw);
            //Permitir modificar el archivo mediante un PrintWriter llamado salida
            PrintWriter salida = new PrintWriter(bw);
            
            //Para cada uno de los alumnos de la lista
            for (Alumno alumno : lista){
                //Escribir el alumno en el archivo csv
                salida.println(alumno);
            }
            
            //Cerrar el archivo
            salida.close();

        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        
        
        System.out.println("#### Tokenizer con FileReader ####");
        try{
            //Mediante un FileReader abrir el archivo csv de alumnos
            FileReader fr = new FileReader("alumnos.csv");
            //Crear un BufferedReader con el FileReader
            BufferedReader br = new BufferedReader(fr);
            //Leer la primera linea del archivo csv
            String linea = br.readLine();
            //Mientras que exista una linea de texto en el archivo 
            while(linea != null){
                //leer la linea con el tokenizador
                StringTokenizer tokenizadorfr = new StringTokenizer(linea,",");
                //Mientras que la cadena tenga tokens(comas)
                while(tokenizadorfr.hasMoreTokens()){
                    //Imprimir el valor correspondiente hasta llegar a un token (coma)
                    System.out.println(tokenizadorfr.nextToken());
                }
                //Moverse a la siguiente linea
                linea = br.readLine();
            }
            //Cerrar el archivo
            fr.close();
            
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        
        System.out.println("#### Exportar y leer con el tokenizer");
        
        //Crear un arreglo de alumnos
        Alumno[] alumnos = new Alumno[10];

        //Llenar el arreglo
        for (int i = 0; i < 10; i++) {
            alumnos[i] = new Alumno("Nombre" + i, "ApPat" + i, "ApMat" + i, 12345678 * i, 18+i,(i + 1));
        }
        
        //Guardar los datos del arreglo en un archivo csv
        try{
            //Mediate un FileWriter crear un archivo csv de los alumnos
            FileWriter fw = new FileWriter("alumnos1.csv");
            //Crear un BufferedWriter con el archivo de los alumnos
            BufferedWriter bw = new BufferedWriter(fw);
            //Permitir modificar el archivo mediante un PrintWriter llamado salida
            PrintWriter salida = new PrintWriter(bw);
            
            //Para cada uno de los alumnos de la lista
            for (int i = 0; i < 10; i++){
                //Escribir el alumno en el archivo csv
                salida.println(alumnos[i]);
            }
            
            //Cerrar el archivo
            salida.close();

        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        
        //Leer la información del archivo csv
        try{
            //Mediante un FileReader abrir el archivo csv de alumnos
            FileReader fr = new FileReader("alumnos1.csv");
            //Crear un BufferedReader con el FileReader
            BufferedReader br = new BufferedReader(fr);
            //Leer la primera linea del archivo csv
            String linea = br.readLine();
            //Mientras que exista una linea de texto en el archivo 
            while(linea != null){
                //leer la linea con el tokenizador
                StringTokenizer tokenizadorcsv = new StringTokenizer(linea,",");
                //Mientras que la cadena tenga tokens(comas)
                while(tokenizadorcsv.hasMoreTokens()){
                    //Imprimir el valor correspondiente hasta llegar a un token (coma)
                    System.out.println(tokenizadorcsv.nextToken());
                }
                //Moverse a la siguiente linea
                linea = br.readLine();
            }
            //Cerrar el archivo
            fr.close();
            
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
