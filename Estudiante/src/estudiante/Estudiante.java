/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estudiante;

/**
 *
 * @author auner
 */
public class Estudiante {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("Hola programadores Java 2021");
        
        Ingeniero ingeniero = new Ingeniero();
        
        ingeniero.setIdentidad("010619900116");
        ingeniero.setNombre("Auner Castillo");
        
        System.out.println("La identidad del Ing. es:"     + ingeniero.getidentidad());
        System.out.println("El nombre del Ing. es: "    + ingeniero.getNombre());
        
    }
    
}
