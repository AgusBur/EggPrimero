
package guia6_egg;

import java.util.Scanner;
public class Ejercicio3 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String frase,fraseM,frasem;
        System.out.println("Ingrese una frase:");
        frase = leer.nextLine();
        fraseM = frase.toUpperCase();
        System.out.println("La frase en mayúsculas es:" + fraseM);
        frasem = frase.toLowerCase();
        System.out.println("La frase en minúsculas es:" + frasem);
    }
    
}
