/*
 Escribir un programa que lea un número entero y devuelva el número de dígitos que
componen ese número. Por ejemplo, si introducimos el número 12345, el programa
deberá devolver 5. Calcular la cantidad de dígitos matemáticamente utilizando el operador
de división. Nota: recordar que las variables de tipo entero truncan los números o
resultados.
 */
package guia6_egg;

import java.util.Scanner;

public class Extra11 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        int num,divisor,aux=0, contador=0;
        System.out.println("Ingrese un número:");
        num = leer.nextInt();
        aux=num;
        divisor=10;
        
        while (num!=0) {  
            if (contador==0) {
                num=aux/divisor;
            } else {
                num=num/divisor;
            }
            contador+=1;
        }
        
        System.out.println("El número elegido tiene: "+contador+" dígitos");
    }
    
}
