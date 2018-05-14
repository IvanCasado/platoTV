/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package platotv;

import java.util.Calendar;

/**
 *
 * @author Iván
 */
public class TrabajadorVideo extends Trabajador {

    /**
     * Clase hereda de Trabajador
     */
    public TrabajadorVideo() {
    }

    public TrabajadorVideo(String NIF, String nombre, String apellidos, char genero, boolean senior, Calendar fechaIngreso) {
        super(NIF, nombre, apellidos, genero, senior, fechaIngreso);
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
