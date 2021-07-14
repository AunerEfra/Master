/*
Aplicando encapsulamiento y abstracción
 */
package c_principal;

import herpers.Ajax;
import herpers.Barcelona;
import herpers.PSG;
import herpes.futbolista;

/**
 *
 * @author auner
 */
public class C_Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       System.out.println("Encapsulamiento");
        
        //instaciar futbolista 
        futbolista Futbolista = new futbolista("Auner castillo","Barcelona");
         
        Futbolista.imprimirEquipo();
        //Establecer los valores de edad 
        
        Futbolista.establecerEdad(21);
   
        //imprimir edad 
        System.out.println(Futbolista.ObtenerEdad());
        

        Barcelona FCB = new Barcelona ();
        PSG Paris = new PSG ();
        Ajax AFC =new Ajax();
        
        
         //imprimir Equipos y Presidentes de cada Equipo
         System.out.println("Abstraccion ");
        
        System.out.println(FCB.getEquipo());
        System.out.println(FCB.getCapitan());
        
        System.out.println(Paris.getEquipo());
        System.out.println(Paris.getCapitan());
        
        System.out.println(AFC.getEquipo());
        System.out.println(AFC.getCapitan());  
        
        
        
        
        
    }
    
}
