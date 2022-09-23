
package guia6_egg;

import java.util.Scanner;

public class Ejercicio15 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int vector [] = new int [100];
        int cont = 1;
        
        for (int i = 0; i < 100; i++) {
            vector[i] = cont;
            cont +=1;
            System.out.println(vector[i]);
        }
        
        for (int i =99; i>(-1) ; i--) {
            System.out.println(vector[i]);
        }
    }
    
}
