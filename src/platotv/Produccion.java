/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package platotv;

import java.util.Calendar;
import java.text.SimpleDateFormat;

/**
 *
 * @author Iván
 */
public class Produccion extends Trabajo {

    int numeroSerie;
    private Calendar fechaComienzo, fechaFinalizacion;

    public Produccion(int numeroSerie, Calendar fechaComienzo, Calendar fechaFinalizacion) {
        this.numeroSerie = numeroSerie;
        this.fechaComienzo = fechaComienzo;
        this.fechaFinalizacion = fechaFinalizacion;
    }

    public Produccion(int numeroSerie, Calendar fechaComienzo, Calendar fechaFinalizacion, int idTrabajo, int supervisor1, int supervisor2, String descripcion) {
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

    /**
     * Metodo tostring
     *
     * @return
     */
    @Override
    public String toString() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        return super.toString() + "\nnumero de serie=" + numeroSerie + "\nFecha comienzo=" + fechaComienzo + "\nfecha finalizacion=" + fechaFinalizacion;
    }
}
