
package guia6_egg;

import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        double num,doble,triple,raiz;
        System.out.println("Ingrese un número");
        num = leer.nextInt();
        doble = num*2;
        System.out.println("El doble del número es:"+doble);
        triple = num*3;
        System.out.println("El triple del número es:"+triple);
        raiz = Math.sqrt(num); 
        System.out.println("La raíz cuadrada es:" +raiz);
    }
    
}
