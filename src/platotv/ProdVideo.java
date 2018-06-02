/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package platotv;

import java.util.Calendar;
import java.util.logging.Logger;

/**
 *
 * @author Iván
 */
public class ProdVideo extends Produccion {

    /**
     * Clase hereda de Produccion
     *
     * @param numeroSerie es el numero de serie de la produccion espera un
     * numero de serie con un int
     * @param fechaComienzo es la fecha en la que el productor comienza a
     * trabajar espera una fecha con el formato dd-MM-yyyy
     * @param fechaFinalizacion es la fecha en la que ha finalizado el trabajo
     * del productor espera una fecha con el formato dd-MM-yyyy
     * @throws java.lang.Exception
     */
    //Constructores
    public ProdVideo(int numeroSerie, String fechaComienzo, String fechaFinalizacion) throws Exception {
        super(numeroSerie, fechaComienzo, fechaFinalizacion);
    }

    public ProdVideo(int numeroSerie, Calendar fechaComienzo, Calendar fechaFinalizacion, int idTrabajo, int supervisor1, int supervisor2, String descripcion) throws Exception {
        super(numeroSerie, fechaComienzo, fechaFinalizacion, idTrabajo, supervisor1, supervisor2, descripcion);
    }

    /**
     * METODOS GETTER SETTER
     *
     * @return
     */
    @Override
    public int getNumeroSerie() {
        return numeroSerie;
    }

    @Override
    public void setNumeroSerie(int numeroSerie) {
        this.numeroSerie = numeroSerie;
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

    @Override
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

    /**
     * Metodo tostring
     *
     * @return
     */
    @Override
    public String toString() {
        return super.toString();
    }

}
