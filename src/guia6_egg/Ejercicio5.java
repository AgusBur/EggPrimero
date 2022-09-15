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
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        double num,doble,triple,raiz;
        System.out.println("Ingrese un número");
        num = leer.nextInt();
        doble = num*num;
        System.out.println("El doble del número es:"+doble);
        triple = num*num*num;
        System.out.println("El triple del número es:"+triple);
        raiz = Math.sqrt(num); 
        System.out.println("La raíz cuadrada es:" +raiz);
    }
    
}
