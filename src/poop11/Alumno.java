/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop11;

/**
 * Clase Alumno
 * @author poo03alu27
 */
public class Alumno {
    private String nombre;
    private String apPat;
    private String apMat;
    private int numCuenta;
    private int edad;
    private int semestre;

    /**
     * Constructor vacio
     */
    public Alumno(){     
    }

    /**
     * Constructor vacio
     * @param nombre
     * @param apPat
     * @param apMat
     * @param numCuenta
     * @param edad
     * @param semestre 
     */
    public Alumno(String nombre, String apPat, String apMat, int numCuenta, int edad, int semestre) {
        this.nombre = nombre;
        this.apPat = apPat;
        this.apMat = apMat;
        this.numCuenta = numCuenta;
        this.edad = edad;
        this.semestre = semestre;
    }

    /**
     * Metodo que devuelve el nombre
     * @return Nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Metodo que establece el nombre
     * @param nombre 
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Metodo que devuelve el apellido paterno
     * @return Apellido paterno
     */
    public String getApPat() {
        return apPat;
    }

    /**
     * Metodo que establece el apellido paterno
     * @param apPat 
     */
    public void setApPat(String apPat) {
        this.apPat = apPat;
    }

    /**
     * Metodo que devuelve el apellido materno
     * @return Apellido materno
     */
    public String getApMat() {
        return apMat;
    }

    /**
     * Metodo que establece el apellido materno
     * @param apMat 
     */
    public void setApMat(String apMat) {
        this.apMat = apMat;
    }

    /**
     * Metodo que devuelve el numero de cuenta
     * @return Numero de cuenta
     */
    public int getNumCuenta() {
        return numCuenta;
    }

    /**
     * Metodo que establece el numero de cuenta
     * @param numCuenta 
     */
    public void setNumCuenta(int numCuenta) {
        this.numCuenta = numCuenta;
    }

    /**
     * Metodo que devuelve la edad
     * @return Edad
     */
    public int getEdad() {
        return edad;
    }

    /**
     * Metodo que establece la edad
     * @param edad 
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     * Metodo que devuelve el semestre
     * @return Semestre
     */
    public int getSemestre() {
        return semestre;
    }

    /**
     * Metodo que establece el semestre
     * @param semestre 
     */
    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    /**
     * Metodo que parsea a una cadena
     * @return String
     */
    @Override
    public String toString() {
        return nombre + "," + apPat + "," + apMat + "," + numCuenta + "," + edad + "," + semestre;
    }
}
