
package guia6_egg;

import java.util.Scanner;

public class Ejercicio16 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        int vector [];
        System.out.println("Ingrese el tamaño del vector:");
        int largo = leer.nextInt();
        vector = new int [largo];
        
        for (int i = 0; i <largo; i++) {
            
            int num = (int) (Math.random()*10+1);
            vector[i] = num;
        }
        
        for (int i = 0; i <largo; i++) {
            
            System.out.print(" [ "+ vector[i] + " ] ");
        }
        
        System.out.println();
        System.out.println("Elija un número:");
        int num2 = leer.nextInt();
        int contador = 0;
        
        for (int i = 0; i <largo; i++) {
            
            if (vector[i] == num2) {
                contador+=1;
                System.out.println("El número está en posición: " + i );
            } 
        }
        
        if (contador==0){
            System.out.println("No está en el vector");
        } else {
            System.out.println("Está " + contador + " veces repetido");
        }
    }
    
}
