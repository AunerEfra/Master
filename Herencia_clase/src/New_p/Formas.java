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
public abstract class Formas {
            //Atributo
    
    
       private String nombre;
    
      private String codigo;
      
      private String aritmetica;
      
    
   
    
    //Establecer y obtener 
    public void establecerNombre (String nombre){
        this.nombre = nombre;
        
    }
     public String obtenerNombre(){
         return this.nombre ;
         
     }
     
      public void establecerCodigo(String codigo){
          this.codigo = codigo;
 
     }
      public String obtenerCodigo(){
          return this.codigo;
      }
      
      public void establecerAritmetica(String aritmetica){
          this.aritmetica = aritmetica ;
      }
        
      public String obteneraeitmetica(){
          return this.aritmetica;
      }
 
      public void imprimirInform(){
       System.out.println("" + nombre);   
        System.out.println("" + codigo); 
         System.out.println("" + aritmetica); 
      }
      abstract String obtenerInformacionFormas();

}
