/*
 Realizar un algoritmo que calcule la suma de todos los elementos de un vector de tamaño
N, con los valores ingresados por el usuario.
 */
package guia6_egg;

import java.util.Scanner;

public class Extra18 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        int [] vector;
        int suma=0,largo;
        System.out.println("Ingrese tamaño del vector:");
        largo = leer.nextInt();
        vector = new int [largo];
        
        //Cargar vector y sumar mientras carga:
        for (int i = 0; i <largo; i++) {
            System.out.println("Ingrese num "+(i+1)+" para el vector:");
            vector[i]=leer.nextInt();
            suma+=vector[i];
        }
        //Mostrar vector
        for (int i = 0; i <largo; i++) {
            System.out.println("En posición: "+(i+1)+" guardado: "+vector[i]);
        }
        //Mostrar suma:
        System.out.println("La suma de todos los elementos del vector es: "+suma);
    }
    
}
