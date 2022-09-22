
package guia6_egg;

import java.util.Scanner;

public class Ejercicio6 {

    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
       double num;
       System.out.println("Ingrese un número:");
       num = leer.nextDouble();
       if (num%2 == 0) {
           System.out.println("El número es par");
       }else{
           System.out.println("El número es impar");
       }
    }
    
}
