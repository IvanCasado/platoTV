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
     * Clase encargada de gestionar los trabajos y de indicar quienes son sus 2
     * supervisores
     *
     *
     */
    /**
     * VARIABLES
     */
    int idTrabajo, supervisor1, supervisor2;
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
     *
     * @param idTrabajo No puede ser menor que cero
     * @param supervisor1 tiene que ser un entero y no puede ser menor que 0 y
     * no puede ser igual que supervisor2
     * @param supervisor2 tiene que ser un entero y no puede ser menor que 0 y
     * no puede ser igual que supervisor2
     * @param descripcion La descripcion no puede sobrepasar los 140
     * @throws Exception
     */
    public Trabajo(int idTrabajo, int supervisor1, int supervisor2, String descripcion) throws Exception {
        this.idTrabajo = idTrabajo;
        this.supervisor1 = supervisor1;
        this.supervisor2 = supervisor2;
        this.descripcion = descripcion;

        if (idTrabajo < 0) {
            throw new Exception("la id de trabajo no puede ser menor de 0");
        } else {
            System.out.println("id correcto");
        }
        if (supervisor1 < 0) {
            throw new Exception("el supervisor1 no puede ser menor de 0");
        } else {
            System.out.println("supervisor1 correcto");
        }
        if (supervisor2 < 0) {
            throw new Exception("el supervisor2 no puede ser menor de 0");
        } else {
            System.out.println("supervisor2 correcto");
        }
        if (supervisor1 == supervisor2) {
            throw new Exception("no pueden ser el mismo supervisor");
        } else {
            System.out.println("supervisor correcto por ser distintos");

        }
        if ((descripcion == null) || (descripcion == "") || (descripcion.length() < 140)) {
            throw new Exception("descripcion no valida");
        } else {
            System.out.println("descripcion valida");
        }
    }

    /**
     *
     */
    /**
     * Metodos getter y setter
     *
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
     *
     * @return
     */
    @Override
    public String toString() {
        return "idTrabajo=" + idTrabajo + "\nsupervisor1=" + supervisor1 + "\nsupervisor2=" + supervisor2 + "\ndescripcion=" + descripcion;
    }

}
