
package guia6_egg;

import java.util.Scanner;

public class Extra3 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese una letra:");
        String letra = leer.next();
        
        if (letra.equalsIgnoreCase("a")||letra.equalsIgnoreCase("e")||
                letra.equalsIgnoreCase("i")|| letra.equalsIgnoreCase("o")
                || letra.equalsIgnoreCase("u")) {
            System.out.println("La letra ingresada es una vocal");
        } else {
            System.out.println("La letra ingresada no es una vocal");
        }
    }
    
}
