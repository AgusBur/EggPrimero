
package guia6_egg;

import java.util.Scanner;

public class Ejercicio12 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
  
        int conC=0;
        int conI=0;
        String cadena, primera, ultima;
        
        System.out.println("Ingrese una cadena:");
        cadena = leer.next();
        
        while (cadena.equals("&&&&&") == false) {  
           int longi=cadena.length();
            String cadenaN = cadena.toLowerCase();
            
          if ((longi <= 5) && (cadenaN.substring(0,1).equals("x")==true) &&
                  (cadenaN.substring(longi-1).equals("o")==true)) {
            conC+=1;
        } else {
              conI+=1;
        } 
          System.out.println("Ingrese otra cadena:");
        cadena = leer.next();
        }
        System.out.println("La cantidad de cadenas correctas: " + conC );
        System.out.println("Y la cantidad de incorrectas: " + conI );
    }
    
}
