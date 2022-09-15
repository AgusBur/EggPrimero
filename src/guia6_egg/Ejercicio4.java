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
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        double num,num2;
        System.out.println("Ingrese cantidad de grados centígrados:");
        num = leer.nextDouble();
        num2 = 32+((9*num)/5);
         System.out.println("El número pasado a grados Fahrenheid es:"+num2);
        
        
    }
    
}
