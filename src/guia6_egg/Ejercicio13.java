
package guia6_egg;

import java.util.Scanner;

public class Ejercicio13 {

    public static void main(String[] args) {

        Scanner leer = new Scanner (System.in);
        System.out.println("Ingrese el tamaño que desea el cuadrado:");
        int tamano = leer.nextInt();
        
        for (int i = 0; i <tamano; i++) {
            for (int j = 0; j <tamano; j++) {
                if ((i==0 || i==tamano-1) || (j==tamano-1 || j==0)) {
                    System.out.print(" *");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
      
    }
    
}
