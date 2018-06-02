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
public class TrabajadorDiseñador extends Trabajador {

    /**
     * Clase hereda de Trabajador
     */
    String Categoria, softwareExperto;

    public TrabajadorDiseñador() {

    }

    /**
     *
     * @param Categoria es la categoría en la que trabaja se espera un String
     * @param softwareExperto es el software en el que es experto se espera un
     * String
     */
    public TrabajadorDiseñador(String Categoria, String softwareExperto) throws Exception {
        this.Categoria = Categoria;
        this.softwareExperto = softwareExperto;
        
          if ((Categoria == null) || (Categoria == "") || (softwareExperto == null) || (softwareExperto == "")) {
            throw new Exception("categoria/software no valido");
        } else {
            System.out.println("categoria/software valida");
        }

    }

    public TrabajadorDiseñador(String Categoria, String softwareExperto, String NIF, String nombre, String apellidos, char genero, boolean senior, String fechaIngreso) throws Exception {
        super(NIF, nombre, apellidos, genero, senior, fechaIngreso);
        this.Categoria = Categoria;
        this.softwareExperto = softwareExperto;
    }

    public String getCategoria() {
        return Categoria;
    }

    public void setCategoria(String Categoria) {
        this.Categoria = Categoria;
    }

    public String getSoftwareExperto() {
        return softwareExperto;
    }

    public void setSoftwareExperto(String softwareExperto) {
        this.softwareExperto = softwareExperto;
    }

    @Override
    public String getNIF() {
        return NIF;
    }

    @Override
    public void setNIF(String NIF) {
        this.NIF = NIF;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String getApellidos() {
        return apellidos;
    }

    @Override
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    @Override
    public char getGenero() {
        return genero;
    }

    @Override
    public void setGenero(char genero) {
        this.genero = genero;
    }

    @Override
    public boolean isSenior() {
        return senior;
    }

    @Override
    public void setSenior(boolean senior) {
        this.senior = senior;
    }

    /**
     * Metodo tostring
     *
     * @return
     */
    //habría que añadirle una forma de leer el software en el que es experto
    @Override
    public String toString() {
        return super.toString() + "\nCategoria=" + Categoria + "\nes experto en=" + softwareExperto;
    }
}