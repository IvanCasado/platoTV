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
         
         
        try{
            ProdAudio p1 = new ProdAudio(1, null, null);
        }
        
        catch (Exception e){
            System.out.println(e.toString());
        
        }
       // Trabajador t1 = new TrabajadorDiseñador(null, null, null, null, null, 'v', true, null);
        
    }
    
}
