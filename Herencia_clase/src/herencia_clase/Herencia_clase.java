/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia_clase;

import New_p.Circulo;
import New_p.Cuadrado;
import New_p.Linea;
import New_p.Triangulo;

/**
 *
 * @author auner
 */
public class Herencia_clase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Circulo circulo = new Circulo ();
      Triangulo triangulo = new Triangulo ();
      Linea linea  = new Linea ();
      Cuadrado cuadrado = new Cuadrado ();

        System.out.println(circulo.obtenerInformacionFormas());
        circulo.imprimirInform();
        
        System.out.println(linea.obtenerInformacionFormas());
       linea.imprimirInform();
      
        System.out.println(triangulo.obtenerInformacionFormas());
       triangulo.imprimirInform();
      
        System.out.println(cuadrado.obtenerInformacionFormas());
      cuadrado.imprimirInform();
    }
    
}
