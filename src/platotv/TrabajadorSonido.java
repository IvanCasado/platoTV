/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package platotv;

import java.util.ArrayList;
import java.util.Calendar;

/**
 *
 * @author Iván
 */
public class TrabajadorSonido extends Trabajador {

    /**
     * Clase hereda de Trabajador
     */
    
    
    
    
    /**
     * Constructo sin parametros
     */
     
    
    public TrabajadorSonido() {
    }
//constructor con parametros

    public TrabajadorSonido(String NIF, String nombre, String apellidos, char genero, boolean senior, Calendar fechaIngreso) {
        super(NIF, nombre, apellidos, genero, senior, fechaIngreso);
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
