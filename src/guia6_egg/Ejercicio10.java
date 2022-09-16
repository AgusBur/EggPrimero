
package guia6_egg;

import java.util.Scanner;

public class Ejercicio10 {

    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
       double limite,suma,num;
       suma = 0;
        System.out.println("Ingrese un número límite positivo:");
        limite = leer.nextDouble();
       do{
           System.out.println("Ingrese un número");
           num = leer.nextDouble();
           suma += num;
       } while (suma < limite);
        System.out.println("Se superó el límite " + suma);
    }        
}
