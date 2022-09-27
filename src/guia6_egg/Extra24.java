/*
 Realizar un programa que complete un vector con los N primeros números de la sucesión
de Fibonacci. Recordar que la sucesión de Fibonacci es la sucesión de los siguientes
números:
1, 1, 2, 3, 5, 8, 13, 21, 34, ...
 */
package guia6_egg;

import java.util.Scanner;

public class Extra24 {

    public static void main(String[] args) {
       Scanner leer = new Scanner (System.in);
       
        int num;
        int a,b,c;
        System.out.println("Ingrese un término:");
        num = leer.nextInt();
        
        fibonacci(num); 
    }
    
    public static void fibonacci(int num) {
        int a=1;
        int b=1;
        int c=0;
        int [] vectorFibo = new int [num];
        
        for (int i = 0; i <num; i++) {
            System.out.println(a);
            vectorFibo[i]=a;
            c=a+b;
            a=b;
            b=c;
        }
        mostrarVector(vectorFibo, num);
    }
    
    public static void mostrarVector(int [] vectorFibo,int num) {
        
        System.out.println("--------------------------");
        System.out.println("El vector cargado quedaría:");
        for (int i = 0; i <num; i++) {
            System.out.print("[ "+vectorFibo[i]+" ]");
        }
        
        System.out.println("");
        System.out.println("---------------------------");
    }
    
}
