/*
Futbolista en el que se declaren y protejan sus métodos y 
propiedades utilizando encapsulamiento, desde la clase que contiene el método principal, 
establecer y obtener su edad, nombre y equipoActual.
 */
package herpes;

/**
 *
 * @author auner
 */
public class futbolista {
    
 // nombre delo futbolista 
    public String nombre;
    private  String equipo ;
    private int edad;
    
    public futbolista (String nombre, String equipo){
        this.nombre =nombre;
        this.equipo=equipo;
        
    }
    public void imprimirEquipo(){
        System.out.println(equipo);
    }
    public void establecerEdad(int _edad){
        this.edad= _edad;
        
    }
    public int ObtenerEdad(){
        return edad;
 
    }
    
    
    //Auner Castillo
}
