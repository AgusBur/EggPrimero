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
public class Ejercicio6 {

    /**
     * @param args the command line arguments
     */
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
