/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package platotv;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author DAW120
 */
public class Modifica {

    ArrayList<Produccion> produccionessonido;

    /**
     * Constructor sin parametros que inicia el arraylist
     */
    public Modifica() {

        this.produccionessonido = new ArrayList<>();

    }

    /**
     * metodo que pide un numero de serie por teclado recorre un array list y
     * hace casting de los elementos para que compruebe que es una produccion de
     * audio y evitar que un trabajador de sonido pueda editar producciones de
     * video
     */
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
        for (Produccion p : produccionessonido) {

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

}
