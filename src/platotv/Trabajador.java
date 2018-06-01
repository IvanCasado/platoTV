/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package platotv;

import java.util.Calendar;
import java.util.Scanner;
import java.text.SimpleDateFormat;

/**
 *
 * @author Iván
 */
public class Trabajador {
    String NIF, nombre,apellidos,paraChar;
    char genero;
    boolean senior;
    private Calendar fechaIngreso;
          
    
    public  Trabajador (){
    Scanner sc = new Scanner(System.in);
          
          System.out.println("Introduzca NIF del trabajador");
          this.NIF = sc.next();
          
          System.out.println("Introduzca nombre del trabajador");
          this.nombre= sc.next();
          
          System.out.println("Introduzca apellidos del trabajador");
          this.apellidos= sc.next();
          
          System.out.println("Introduzca su genero");
          this.paraChar = sc.next();
          
         if (paraChar.equalsIgnoreCase("V")) {
            genero=paraChar.charAt(0);
        }
            
        
          System.out.println("Introduzca si es senior");
          this.senior = sc.nextBoolean();
         
}

   
    /**
       * Constructor que recibe los parametros
       * @param NIF
       * @param nombre
       * @param apellidos
       * @param genero 
       * @param senior
       * @param fechaIngreso
       */
      public Trabajador(String NIF, String nombre, String apellidos, char genero, boolean senior, Calendar fechaIngreso) {
        this.NIF = NIF;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.genero = genero;
        this.senior = senior;
        this.fechaIngreso = fechaIngreso;
    }

    public String getFechaIngreso() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        return sdf.format(fechaIngreso.getTime());
    }

    public void setFechaIngreso(Calendar fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public String getNIF() {
        return NIF;
    }

    public void setNIF(String NIF) {
        this.NIF = NIF;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getParaChar() {
        return paraChar;
    }

    public void setParaChar(String paraChar) {
        this.paraChar = paraChar;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public boolean isSenior() {
        return senior;
    }

    public void setSenior(boolean senior) {
        this.senior = senior;
    }
       /**
     * Metodo tostring
     * @return 
     */
    
    @Override
    public String toString() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        return "NIF del trabajador=" + NIF + "\nnombre=" + nombre + "\napellidos=" + apellidos + "\ngenero=" + genero + "\ncondicion=" + senior + "FechaIngreso=" + sdf.format(fechaIngreso.getTime());
    }
}
