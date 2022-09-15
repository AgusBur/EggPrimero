/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia6_egg;

import java.util.Scanner;

/**
 *
 * @author Agustina
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        int num1,num2,suma;
        
        System.out.println("Ingrese un número");
        num1 = leer.nextInt();
        System.out.println("Ingrese otro número");
        num2 = leer.nextInt();
        System.out.println("La suma de los números es de:");
        suma=num1+num2;
        System.out.println(suma);
                
    }
    
}
