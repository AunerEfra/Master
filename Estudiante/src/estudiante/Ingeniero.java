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
class Ingeniero {
     private String nombre;
    private String identidad;
    
 //contructor por defecto
 public Ingeniero(){

 }
//contructor personalizado
 public Ingeniero( String identidad, String nombre){
 this.setIdentidad(identidad);
 this.setNombre(nombre);
//metodo para obtener informacion del Ing.
 }
 public String getidentidad(){
 return identidad;
 }

 public String getNombre(){
 return nombre;

 }
//metodo para establecer datos
 void setIdentidad(String _identidad){
 this.identidad = _identidad;
 }
 void setNombre(String _nombre){
 this.nombre = _nombre;
 }
}
//realizado por Auner Castillo