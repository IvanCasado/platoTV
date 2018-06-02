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

    /**
     *
     * @param NIF pide el nif del trabajador se espera un string con formato de
     * nif
     * @param nombre pide el nombre del trabajador espera un string
     * @param apellidos pide el apellido del trabajador espera un string
     * @param genero pregunta el genero del trabajador se espera 'v' o 'm'
     * @param senior pide comprobar si es senior o no es senior
     * @param fechaIngreso contiene la fecha de ingerso de un trabajse espera
     * formato dd-MM-yyyy
     * @throws Exception
     */
    public TrabajadorVideo(String NIF, String nombre, String apellidos, char genero, boolean senior, String fechaIngreso) throws Exception {
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
