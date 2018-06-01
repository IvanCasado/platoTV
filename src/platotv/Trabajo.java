/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package platotv;

import java.util.Scanner;

/**
 *
 * @author Iván
 */
public class Trabajo {

  
    
    /**
     * Clase encargada de gestionar los trabajos y de indicar quienes son sus 2 supervisores
     * 
     * 
     */
     
    /**
     * VARIABLES
     */
    int idTrabajo,supervisor1,supervisor2;
    String descripcion;
    
    /**
     * Costructor por defecto que nois pide los atributos por teclado
     */
      public Trabajo() {
       /*   
          Scanner sc = new Scanner(System.in);
          
          System.out.println("Introduzca ID del trabajo");
          this.idTrabajo = sc.nextInt();
          
          System.out.println("Introduzca descripcion");
          this.descripcion= sc.nextLine();
          
          System.out.println("Introduzca ID supervisor 1");
          this.supervisor1 = sc.nextInt();
          
          System.out.println("Introduzca ID supervisor 2");
          this.supervisor2 = sc.nextInt();*/
    }

      /**
       * Constructor que recibe los parametros
       * @param idTrabajo
       * @param supervisor1
       * @param supervisor2
       * @param descripcion 
       */
    public Trabajo(int idTrabajo, int supervisor1, int supervisor2, String descripcion) {
        this.idTrabajo = idTrabajo;
        this.supervisor1 = supervisor1;
        this.supervisor2 = supervisor2;
        this.descripcion = descripcion;
    }
    
    /**
     * 
     */
    
    /**
     * Metodos getter y setter
     * @return 
     */
    
    public int getIdTrabajo() {
        return idTrabajo;
    }

    public void setIdTrabajo(int idTrabajo) {
        this.idTrabajo = idTrabajo;
    }

    public int getSupervisor1() {
        return supervisor1;
    }

    public void setSupervisor1(int supervisor1) {
        this.supervisor1 = supervisor1;
    }

    public int getSupervisor2() {
        return supervisor2;
    }
/**
 * 
 * @param supervisor2 
 */
    public void setSupervisor2(int supervisor2) {
        this.supervisor2 = supervisor2;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * Metodo tostring
     * @return 
     */
    
    @Override
    public String toString() {
        return "idTrabajo=" + idTrabajo + "\nsupervisor1=" + supervisor1 + "\nsupervisor2=" + supervisor2 + "\ndescripcion=" + descripcion;
    }

    
    
    
    
    
}
