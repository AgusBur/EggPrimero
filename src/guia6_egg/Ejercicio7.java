
package guia6_egg;

import java.util.Scanner;

public class Ejercicio7 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String frase,frase2;
        System.out.println("Ingrese una frase:");
        frase = leer.nextLine();
        frase2=frase.toLowerCase();
        if (frase2.equals("eureka")){
            System.out.println("Correcto");
        }else{
            System.out.println("Incorrecto");
        }
    }
    
}
