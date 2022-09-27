/*
 Realice un programa para que el usuario adivine el resultado de una multiplicación entre
dos números generados aleatoriamente entre 0 y 10. El programa debe indicar al usuario
si su respuesta es o no correcta. En caso que la respuesta sea incorrecta se debe permitir
al usuario ingresar su respuesta nuevamente. Para realizar este ejercicio investigue como
utilizar la función Math.random() de Java.
 */
package guia6_egg;

import java.util.Scanner;

public class Extra10 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        int num1, num2,resultado=0,correcto=0;
        
        System.out.println("Generando 2 números aleatorios...:");
        num1=(int)(Math.random()*10+0);
        num2=(int)(Math.random()*10+0);
        correcto=num1*num2;
        
        System.out.println("Adivine el resultado de la multiplicación de 2 n° ocultos "
                + "entre el 0 y 10");
        System.out.println("Ingrese resultado:");
            resultado=leer.nextInt();
        
        while (resultado!=correcto) { 
            System.out.println("Oops ese no es el resultado correcto:");
            if (resultado<correcto) {
                System.out.println("El resultado es mayor!");
            } else {
                System.out.println("El resultado es menor!");
            }
            System.out.println("Ingrese nuevamente otro resultado...");
            resultado=leer.nextInt();  
        }
        
        System.out.println("Adivinaste!!!!");
        System.out.println("Los números al azar multiplicados eran: "+num1+" y "+num2);
    }
}
