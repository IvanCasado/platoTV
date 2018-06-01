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
    String NIF, nombre,apellidos;
    char genero;
    boolean senior;
    private Calendar fechaIngreso;
          
    
    public  Trabajador (){
 
}
    

   
  /**
   * 
   * @param NIF pide el nif del trabajador se espera un string con formato de nif
   * @param nombre pide el nombre del trabajador espera un string
   * @param apellidos pide el apellido del trabajador espera un string
   * @param genero pregunta el genero del trabajador se espera 'v' o 'm'
   * @param senior pide comprobar si es senior o no es senior
   * @param fechaIngreso contiene la fecha de ingerso de un trabajse espera formato dd-MM-yyyy
   * @throws Exception 
   */
      public Trabajador(String NIF, String nombre, String apellidos, char genero, boolean senior, Calendar fechaIngreso) throws Exception {
        this.NIF = NIF;
        this.nombre = nombre;
        this.apellidos = apellidos;
        
       
      
          if (genero=='V'||genero=='v'||genero=='M'||genero=='m') {
              this.genero = genero;
          }else{
            throw  new Exception("el sexo debe ser v o m");
          }
           if (senior==true||senior==false) {
              this.senior = senior;
          }else{
            throw  new Exception("Senior ha de ser true o false");
          }
           SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
          if (sdf.format(fechaIngreso.getTime()).equals(fechaIngreso)) {
              this.fechaIngreso=fechaIngreso;
          }else{
              throw  new Exception("El formato fecha a seguir es dd-MM-yyyy");
          }
 
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
