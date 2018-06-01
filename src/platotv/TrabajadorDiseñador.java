/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package platotv;

import java.util.Calendar;
import java.util.Scanner;

/**
 *
 * @author Iván
 */
public class TrabajadorDiseñador extends Trabajador {
     /**
     * Clase hereda de Trabajador
     */
    String Categoria,softwareExperto;
     
    
    public  TrabajadorDiseñador (){
    Scanner sc = new Scanner(System.in);
          
          System.out.println("Introduzca Categoria");
          this.Categoria = sc.next();
          
          System.out.println("Introduzca el software en el que es un experto");
          this.softwareExperto= sc.next();
         
}

    public TrabajadorDiseñador(String Categoria, String softwareExperto) {
        this.Categoria = Categoria;
        this.softwareExperto = softwareExperto;
    }

    public TrabajadorDiseñador(String Categoria, String softwareExperto, String NIF, String nombre, String apellidos, char genero, boolean senior, Calendar fechaIngreso) throws Exception {
        super(NIF, nombre, apellidos, genero, senior, fechaIngreso);
        this.Categoria = Categoria;
        this.softwareExperto = softwareExperto;
    }

    public String getCategoria() {
        return Categoria;
    }

    public void setCategoria(String Categoria) {
        this.Categoria = Categoria;
    }

    public String getSoftwareExperto() {
        return softwareExperto;
    }

    public void setSoftwareExperto(String softwareExperto) {
        this.softwareExperto = softwareExperto;
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
    //habría que añadirle una forma de leer el software en el que es experto
    @Override
    public String toString() {
      return super.toString() + "\nCategoria=" + Categoria + "\nes experto en=" + softwareExperto;
    }
}
