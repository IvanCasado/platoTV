/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package platotv;

import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 *
 * @author Iván
 */
public class ProdAudio extends Produccion {

    /**
     * Clase QUE hereda de Produccion
     * @param numeroSerie
     * @param fechaComienzo
     * @param fechaFinalizacion
     */
    public ProdAudio(int numeroSerie, Calendar fechaComienzo, Calendar fechaFinalizacion) throws Exception {
        super(numeroSerie, fechaComienzo, fechaFinalizacion);
    }

    public ProdAudio(int numeroSerie, Calendar fechaComienzo, Calendar fechaFinalizacion, int idTrabajo, int supervisor1, int supervisor2, String descripcion) {
        super(numeroSerie, fechaComienzo, fechaFinalizacion, idTrabajo, supervisor1, supervisor2, descripcion);
    }

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
