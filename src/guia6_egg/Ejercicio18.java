
package guia6_egg;

import java.util.Scanner;

public class Ejercicio18 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int matriz [][];
        System.out.println("Ingrese dimensión para matriz cuadrada");
        int largo = leer.nextInt();
        matriz = new int [largo][largo];
        
        for (int i = 0; i <largo; i++) {
            for (int j = 0; j <largo; j++) {
                matriz[i][j] = (int) (Math.random()*10);
            }        
        }
        for (int i = 0; i <largo; i++) {
            for (int j = 0; j <largo; j++) {
                System.out.print("[ " + matriz[i][j]+ " ]");
            } 
            System.out.println("");
        }
        System.out.println("-------------------------");
        System.out.println("La matriz traspuesta es:");
        System.out.println("--------------------------");
        for (int i = 0; i <largo; i++) {
            for (int j = 0; j <largo; j++) {
                System.out.print("[ " + matriz[j][i]+ " ]");
            }   
            System.out.println("");
        }
    }
    
}
