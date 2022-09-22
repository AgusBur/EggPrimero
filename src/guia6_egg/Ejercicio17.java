
package guia6_egg;

import java.util.Scanner;

public class Ejercicio17 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        int vector [];
        int unD =0;
        int dosD =0;
        int tresD =0;
        int cuatD =0;
        int cincD = 0;
        System.out.println("Ingrese el tamaño del vector:");
        int largo = leer.nextInt();
        vector = new int[largo];

        for (int i = 0; i < largo; i++) {

            System.out.println("Ingrese un número");
            vector[i] = leer.nextInt();
        }
        for (int i = 0; i < largo; i++) {

            System.out.print(" [ " + (vector[i]) + " ] ");
        }

        for (int i = 0; i < largo; i++) {

            if (vector[i] <= 9) {
                unD+=1;
            } else if ((vector[i] > 9) && (vector[i]<=99)){
                dosD+=1;
            } else if ((vector[i]>99) && (vector[i]<=999)){
                tresD+=1;
            } else if ((vector[i]>999) && (vector[i]<=9999)){
                cuatD+=1;
            } else if ((vector[i]>9999) && (vector[i]<=99999)){
                cincD+=1;
            }
        }
        System.out.println();
        System.out.println("Hay: " + unD + " números de un dígito");
        System.out.println("Hay: " + dosD + " números de dos dígitos");
        System.out.println("Hay: " + tresD + " números de tres dígitos");
        System.out.println("Hay: " + cuatD + " números de cuatro dígitos");
        System.out.println("Hay: " + cincD + " números de cinco dígitos");
    }
    
}
