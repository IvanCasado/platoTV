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
public class ProdVideo extends Produccion{

    /**
     * Clase hereda de Produccion
     */
    
    //Constructores
    public ProdVideo(int numeroSerie, Calendar fechaComienzo, Calendar fechaFinalizacion) throws Exception {
        super(numeroSerie, fechaComienzo, fechaFinalizacion);
    }

    public ProdVideo(int numeroSerie, Calendar fechaComienzo, Calendar fechaFinalizacion, int idTrabajo, int supervisor1, int supervisor2, String descripcion) {
        super(numeroSerie, fechaComienzo, fechaFinalizacion, idTrabajo, supervisor1, supervisor2, descripcion);
    }
/**
 * METODOS GETTER SETTER
 * @return 
 */
   public int getNumeroSerie() {
        return numeroSerie;
    }

    public void setNumeroSerie(int numeroSerie) {
        this.numeroSerie = numeroSerie;
    }

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
    return super.toString();
    }

   
    
}
