/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package platotv;

import java.util.ArrayList;

/**
 *
 * @author Clase
 */
public class PlatoTv {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here

        ArrayList<Produccion> producciones;

        // ArrayList<Trabajador> trabajadores;
        //pruebas Produccion VIDEO
        try {
            System.out.println("");
            System.out.println("PRUEBAS DE PRODUCCIONES DE VIDEO");
            System.out.println("");
            //prod VIDEO con todo ok
            System.out.println("\npv1 se introducen todos los datos correctos");
            ProdVideo pV1 = new ProdVideo(1, "2018-03-12", "2018-04-12");

            System.out.println("\npv2 se introducen ID Mal");
            //prod VIDEO con todo ok
            ProdVideo pV2 = new ProdVideo(-1, "2018-03-12", "2018-04-12");

            System.out.println("\npv3 se introducen fechas Mal");
            //prod audio con fecha final menos de fechacomienzo
            ProdVideo pv3 = new ProdVideo(-11, "2018-03-12", "2018-02-12");
        } catch (Exception e) {
            System.out.println(e.toString());

        }

        //pruebas Produccion audio
        try {
            System.out.println("");
            System.out.println("PRUEBAS DE PRODUCCIONES DE AUDIO");
            System.out.println("");
            //prod audio con todo ok
            System.out.println("\npa1 se introducen todo bien");
            ProdAudio pa1 = new ProdAudio(1, "20-1-2018", "20-2-2018");
        } catch (Exception e) {
            System.out.println(e.toString());
        }
        try {
            System.out.println("\npa2 se introducen ID Mal");
            //prod audio con id menos de 0
            ProdAudio pa2 = new ProdAudio(-11, "20-1-2018", "20-2-2018");
        } catch (Exception e) {
            System.out.println(e.toString());
        }
        try {
            System.out.println("\npa3 se introducen  con fecha final menos de fechacomienzo");
            //prod audio con fecha final menos de fechacomienzo
            ProdAudio pa3 = new ProdAudio(-11, "20-3-2018", "20-2-2018");
        } catch (Exception e) {
            System.out.println(e.toString());
        }

        System.out.println("");
        System.out.println("PRUEBAS TRABAJADOR");
        System.out.println("");

        try {
            System.out.println("t1 con todos los datos bien");
            Trabajador t1 = new Trabajador("72141582N", "IVAN", "CASADO", 'V', true, "20/01/1986");

        } catch (Exception e) {
            System.out.println(e.toString());
        }

        try {
            System.out.println("\nt2 con el dni mal");
            Trabajador t2 = new Trabajador("721s1582N", "ivan", "casado", 'M', true, "20/01/1986");
        } catch (Exception e) {
            System.out.println(e.toString());
        }

        try {
            System.out.println("\nt3 con nombre  mal");
            Trabajador t3 = new Trabajador("72141582N", "iv2n", "casado", 'M', true, "20/01/1986");
        } catch (Exception e) {
            System.out.println(e.toString());
        }
        try {
            System.out.println("\nt4 con el genero mal");
            Trabajador t4 = new Trabajador("72141582N", "ivan", "casado", 'L', true, "20/01/1986");
        } catch (Exception e) {
            System.out.println(e.toString());
        }
        
        

        // Trabajador t1 = new TrabajadorDiseñador(null, null, null, null, null, 'v', true, null);
    }

}
