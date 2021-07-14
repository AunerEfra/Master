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

    public class Triangulo extends Formas {

     public Triangulo (){
        establecerNombre("Triangulo");
        establecerCodigo("calcular area");
        establecerAritmetica("A= B*H/2");
    }

    @Override
    public String obtenerInformacionFormas() {
        return "*Agulo*";
    }
    
    
    
}

    

