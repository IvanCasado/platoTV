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
   
        
        ArrayList<Produccion> producciones ;
        
        // ArrayList<Trabajador> trabajadores;
         
        
           //pruebas Produccion VIDEO
        try{
            System.out.println("");
            System.out.println("PRUEBAS DE PRODUCCIONES DE VIDEO");
            System.out.println("");
            //prod VIDEO con todo ok
            ProdVideo pV1 = new ProdVideo(1, "2018-03-12", "2018-04-12");
            
            pV1.getFechaFinalizacion();
            System.out.println("fecha" +pV1.getFechaFinalizacion());
            
             //prod VIDEO con todo ok
            ProdVideo pV2 = new ProdVideo(-1, "2018-03-12", "2018-04-12");
            
            //prod audio con fecha final menos de fechacomienzo
            ProdVideo pv3 = new ProdVideo(-11, "2018-03-12", "2018-02-12");
        }
        
        catch (Exception e){
            System.out.println(e.toString());
        
        }
        
        
        
        
        
         
        //pruebas Produccion audio
        try{
            System.out.println("");
            System.out.println("PRUEBAS DE PRODUCCIONES DE AUDIO");
            System.out.println("");
            //prod audio con todo ok
            ProdAudio pa1 = new ProdAudio(1, "20-1-2018", "20-2-2018");
            
            //prod audio con id menos de 0
            ProdAudio pa2 = new ProdAudio(-11, "20-1-2018", "20-2-2018");
            
            //prod audio con fecha final menos de fechacomienzo
            ProdAudio pa3 = new ProdAudio(-11, "20-3-2018", "20-2-2018");
        }
        
        catch (Exception e){
            System.out.println(e.toString());
        
        }
       // Trabajador t1 = new TrabajadorDiseñador(null, null, null, null, null, 'v', true, null);
        
    }
    
}
