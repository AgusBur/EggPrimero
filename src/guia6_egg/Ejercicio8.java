
package guia6_egg;

import java.util.Scanner;


public class Ejercicio8 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int largo;
        String frase;
        System.out.println("Ingrese una palabra:");
        frase = leer.nextLine();
        largo = frase.length();
        if (largo == 8) {
            System.out.println("Correcto");
        }else{
            System.out.println("Incorrecto. La palabra tiene " + largo + " caracteres");
        }
        
        
        
    }
    
}
