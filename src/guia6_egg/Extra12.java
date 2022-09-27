/*
 Necesitamos mostrar un contador con 3 dígitos (X-X-X), que muestre los números del 0-0-
0 al 9-9-9, con la particularidad que cada vez que aparezca un 3 lo sustituya por una E.
 */
package guia6_egg;

import java.util.Scanner;

public class Extra12 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        String [] vector;
        vector = new String [1000];
        
        for (int i = 0; i <1000; i++) {
            vector[i]=Integer.toString(i).replace("3", "E");
        }
        
        for (int i = 0; i <1000; i++) {
            System.out.println(vector[i]);
        }
        
    }
    
}
