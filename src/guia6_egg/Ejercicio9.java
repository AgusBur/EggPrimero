
package guia6_egg;

import java.util.Scanner;

public class Ejercicio9 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String frase;
        System.out.println("Ingrese una palabra:");
        frase = leer.nextLine();
        if (frase.substring(0,1).equals("A")){
            System.out.println("correcto");
        }else{
            System.out.println("incorrecto");
        }
    }
    
}
