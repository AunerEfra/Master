/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package New_p;

/**
 *
 * @author auner
 */
public class Circulo extends Formas {
    
        public Circulo(){
        establecerNombre("Circuferencia");
        establecerCodigo("Calcular Radio");
         establecerAritmetica("r = C / ( 2 x Pi)");
    }

    @Override
     public String obtenerInformacionFormas() {
       
        return "*Radio*";
    }
  }

