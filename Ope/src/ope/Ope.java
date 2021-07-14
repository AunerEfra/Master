/*Crear un programa que imprima en consola todas las operaciones aritméticas de
4 números enteros (suma, resta, multiplicación, divición)*/
package ope;

public class Ope {

    
    public static void main(String[] args) {
        
        
     double suma;
     double  resta;
     double division=0;
     double multiplicasion;
     double num1=8;
     double num2=4;
     suma= num1 + num2;
     resta= num1 - num2;
      multiplicasion = num1 * num2;
      //no dividir entre denominador 
     if(num2 !=0){
       division = num1/num2;  
     } 
    
    //impresion de los valores 
        System.out.println("el resulatdo de la suuma es :" + suma);
        System.out.println("el resulatdo de la resta es :" + resta);
        System.out.println("el resulatdo de la division es :" + division);
        System.out.println("el resulatdo de la multipicasion es :" + multiplicasion);
        
        
        // TODO code application logic here
    }
    
}
