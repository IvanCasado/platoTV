/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package platotv;

import java.util.Calendar;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Iván
 */
public class Produccion extends Trabajo {

    ArrayList<Produccion> producciones;

    SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
    int numeroSerie;
    private Calendar fechaComienzo, fechaFinalizacion;

    /**
     *
     * @param numeroSerie es el numero de serie de la produccion espera un
     * numero de serie con un int
     * @param fechaComienzo es la fecha en la que el productor comienza a
     * trabajar espera una fecha con el formato dd-MM-yyyy
     * @param fechaFinalizacion es la fecha en la que ha finalizado el trabajo
     * del productor espera una fecha con el formato dd-MM-yyyy
     * @throws Exception
     */
    public Produccion(int numeroSerie, String fechaComienzo, String fechaFinalizacion) throws Exception {
        this.numeroSerie = numeroSerie;
        //estos metodos hacen que no puedas dar una fecha incorrecta sin sentidoF
        try {
            this.fechaComienzo.setLenient(false);
            this.fechaFinalizacion.setLenient(false);

            this.fechaComienzo.setTime(sdf.parse(fechaComienzo));
            this.fechaFinalizacion.setTime(sdf.parse(fechaFinalizacion));
        } catch (Exception e) {
            System.out.println("el formato de las fechas es dd-MM-yyyy");
        }
        if (numeroSerie < 0) {
            throw new Exception("no puede ser menor de 0");
        } else {
            System.out.println("id correcto");
        }
    }

    public Produccion(int numeroSerie, Calendar fechaComienzo, Calendar fechaFinalizacion, int idTrabajo, int supervisor1, int supervisor2, String descripcion) throws Exception {
        super(idTrabajo, supervisor1, supervisor2, descripcion);
        this.numeroSerie = numeroSerie;
        this.fechaComienzo = fechaComienzo;
        this.fechaFinalizacion = fechaFinalizacion;
    }

    public int getNumeroSerie() {
        return numeroSerie;
    }

    public void setNumeroSerie(int numeroSerie) {
        this.numeroSerie = numeroSerie;
    }

    public Calendar getFechaComienzo() {
        return fechaComienzo;
    }

    public void setFechaComienzo(Calendar fechaComienzo) {
        this.fechaComienzo = fechaComienzo;
    }

    public Calendar getFechaFinalizacion() {
        return fechaFinalizacion;
    }

    public void setFechaFinalizacion(Calendar fechaFinalizacion) {
        this.fechaFinalizacion = fechaFinalizacion;
    }

    @Override
    public int getIdTrabajo() {
        return idTrabajo;
    }

    @Override
    public void setIdTrabajo(int idTrabajo) {
        this.idTrabajo = idTrabajo;
    }

    @Override
    public int getSupervisor1() {
        return supervisor1;
    }

    public void setSupervisor1(int supervisor1) {
        this.supervisor1 = supervisor1;
    }

    @Override
    public int getSupervisor2() {
        return supervisor2;
    }

    @Override
    public void setSupervisor2(int supervisor2) {
        this.supervisor2 = supervisor2;
    }

    @Override
    public String getDescripcion() {
        return descripcion;
    }

    @Override
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void trabaja() {

    }

    public void modificarProduccion() {

        //variables del metodo
        int numSerie;
        boolean encontrado = false;

        //instancia scanner
        Scanner sc = new Scanner(System.in);
        //pedimos datos
        System.out.println("Introduzca ID de la produccion a modificar");
        numSerie = sc.nextInt();

        //recorremos el array buscando el ID
        for (Produccion p : producciones) {

            //hacemos casting para comprobar que no sea una produccion de video
            if (p instanceof ProdAudio) {
                ProdAudio producionauxiliar = (ProdAudio) p;

                if (producionauxiliar.getNumeroSerie() == numSerie) {
                    encontrado = true;//ponemos como encontrado
                    System.out.println("Introduzca nuevos datos");
                }
            }
        }
        // si no lo encuentra printa mensaje
        if (encontrado == false) {
            System.out.println("No existe ese numero de serie");
        }

    }

    /**
     * Metodo tostring
     *
     * @return
     */
    @Override
    public String toString() {

        return super.toString() + "\nnumero de serie=" + numeroSerie + "\nFecha comienzo=" + fechaComienzo + "\nfecha finalizacion=" + fechaFinalizacion;
    }
}
