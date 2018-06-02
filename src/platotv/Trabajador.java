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
public class Trabajador {

    String NIF, nombre, apellidos;
    char genero;
    boolean senior;
    private Calendar fechaIngreso;
    SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");

    public Trabajador() {
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
    public Trabajador(String NIF, String nombre, String apellidos, char genero, boolean senior, String fechaIngreso) throws Exception {
        this.NIF = NIF;
        this.nombre = nombre;
        this.apellidos = apellidos;
        try {
            this.fechaIngreso.setLenient(false);
            this.fechaIngreso.setTime(sdf.parse(fechaIngreso));
        } catch (Exception e) {
            System.out.println("el formato de la fecha es dd-MM-yyyy");
        }
        if ((genero == 'V') || (genero == 'v') || (genero == 'M') || (genero == 'm')) {
            this.genero = genero;
        } else {
            throw new Exception("el sexo debe ser v o m");
        }
        if (senior == true || senior == false) {
            this.senior = senior;
        } else {
            throw new Exception("Senior ha de ser true o false");
        }
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        
      //  llamada a validacion
        validarDNI(NIF);
    }

    /**
     * METODOS GETTER Y SETTER
     *
     * @return
     */
    public String getFechaIngreso() {
        return sdf.format(fechaIngreso.getTime());
    }

    public void setFechaIngreso(Calendar fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public String getNIF() {
        return NIF;
    }

    public void setNIF(String NIF) {
        this.NIF = NIF;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public boolean isSenior() {
        return senior;
    }

    public void setSenior(boolean senior) {
        this.senior = senior;
    }

    /**
     * Metodo tostring
     *
     * @return
     */
    @Override
    public String toString() {
        return "NIF del trabajador=" + NIF + "\nnombre=" + nombre + "\napellidos=" + apellidos + "\ngenero=" + genero + "\ncondicion=" + senior + "FechaIngreso=" + sdf.format(fechaIngreso.getTime());
    }

    /**
     * Metodo comprobar dni que recibe un string y comprueba que la longitud sea
     * 9
     *
     * @param dni
     * @return
     */
    void validarDNI(String dni) throws Exception {

        boolean letras = false;

        //comprueba que no haya letras excepto la ultima
        for (int i = 0; i < dni.length() - 1; i++) {

            if (Character.isLetter(dni.charAt(i))) {
                letras = true;
            }
        }

        if ((dni.length() != 9 && letras == true) || (Character.isLetter(dni.charAt(8)) == false) && letras == true) {
            System.out.println("debe tener 8 numeros y una letra al final");
            throw new Exception("DNI no valido");
        } else {
            System.out.println("DNI valido");
        }
    }

}
