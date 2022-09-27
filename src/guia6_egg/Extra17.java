/*
 Crea una aplicación que nos pida un número por teclado y con una función se lo pasamos
por parámetro para que nos indique si es o no un número primo, debe devolver true si es
primo, sino false.
 */
package guia6_egg;

import java.util.Scanner;

public class Extra17 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num;
        System.out.println("Ingrese un número:");
        num = leer.nextInt();
        if (numeroPrimo(num)==true) {
            System.out.println("El número ingresado es un número primo");
        } else {
            System.out.println("El número ingresado no es primo");
        }
    }
    
    public static boolean numeroPrimo(int num) {
        
        int contador=0;
        for (int i = 1; i <=num; i++) {
            if (num%i==0) {
                contador+=1;
            }
        }
        return contador==2;       
    }
}
