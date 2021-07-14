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
public class Cuadrado extends Formas{
    
 public Cuadrado(){
        establecerNombre("Cuadrado");
        establecerCodigo("Calcular Area");
        establecerAritmetica("  A=L1*L2 == L^2");
    }

    @Override
     public String obtenerInformacionFormas() {
        return "*Area*";
    }
}
