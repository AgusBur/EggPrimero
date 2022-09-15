/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia6_egg;

import java.util.Scanner;

/**
 *
 * @author Agustina
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
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
