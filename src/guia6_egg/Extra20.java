/*
 Crear una función rellene un vector con números aleatorios, pasándole un arreglo por
parámetro. Después haremos otra función o procedimiento que imprima el vector.
 */
package guia6_egg;

import java.util.Scanner;

public class Extra20 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int vector [];
        int largo;
        System.out.println("Ingrese tamaño del vector:");
        largo = leer.nextInt();
        vector = new int [largo];
        cargarVector(vector);
        mostrarVector(vector);
    }
    
    public static void cargarVector(int [] vector) {
        
        for (int i = 0; i <vector.length; i++) {
            vector[i]=(int) (Math.random()*9+1);
        }
    }
    
    public static void mostrarVector(int [] vector) {
       
        System.out.println("El vector cargado quedaría:");
        for (int i = 0; i <vector.length; i++) {
            System.out.print(vector[i]+"-");
        }
        System.out.println("");
        System.out.println("---------------------");
    }
}
