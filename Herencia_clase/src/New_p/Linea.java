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

public class Linea extends Formas {

    public Linea (){
        establecerNombre("Linea");
        establecerCodigo("CaLcular una linea M a FT");
        establecerAritmetica("M*3.28/1M == FT");
        
    }

    @Override
     public String obtenerInformacionFormas() {
       return "*Largo*";
    }
    
}
