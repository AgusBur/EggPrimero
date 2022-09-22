
package guia6_egg;

import java.util.Scanner;

public class Ejercicio11 {

    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
    int num1,num2;
        System.out.println("Ingrese 2 números:");
        num1 = leer.nextInt();
        num2 = leer.nextInt();
        int opcion,fin;
        String op2;
        fin=1;
       while (fin == 1) {
           System.out.println("Menú");
           System.out.println("Elegir una ocpión:");
           System.out.println("1: Sumar");
           System.out.println("2: Restar");
           System.out.println("3: Multiplicar");
           System.out.println("4: Dividir");
           System.out.println("5: Salir");
           opcion = leer.nextInt();
           switch (opcion){
               case 1:
                   System.out.println("La suma es: " + (num1+num2));
                   break;
               case 2:
                   System.out.println("La resta es: "+ (num1-num2));
                   break;
               case 3:
                   System.out.println("La multiplicación es: "+ (num1*num2));
                   break;
               case 4: 
                   System.out.println("La división es: "+ (num1/num2));
                   break;
               case 5: 
                   System.out.println("Desea salir? s/n");
                   op2=leer.next();
                   String op2nueva = op2.toLowerCase();
                   if (op2nueva.equals("s")) {
                       fin=0;
                       break;
                   }         
           }
       }
        System.out.println("Gracias por usar el programa. Saliendo");
    }
}
