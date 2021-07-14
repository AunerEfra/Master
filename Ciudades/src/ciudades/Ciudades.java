/*
Crear un arrelo que guarde e imprima 20 nombres de ciudades
 */
package ciudades;


import java.util.Scanner;



public class Ciudades {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args ) {
     
      
        Scanner in = new Scanner(System.in);
        
        System.out.print("Cuantas ciudades va a registrar: ");
        int nElemn = in.nextInt();
        
        System.out.println("");
        
        String[] ciudades = new String[nElemn];
        
        //Limpiar el buffer
        String aux = in.nextLine();
        
        for (int i = 0; i < nElemn; i++) {
            System.out.print("Elemento "+(i+1)+": ");
            ciudades[i] = in.nextLine();
        }
        
        System.out.println("\nLas ciudades son: \n");
        
        for (int i = 0; i < nElemn; i++) {
            System.out.print("Ciudad #"+(i+1)+": "+ciudades[i]+"\n");
        }
    }  
      
    
}
//  realizado por Auner Catillo