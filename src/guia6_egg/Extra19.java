/*
Escriba un programa que averigüe si dos vectores de N enteros son iguales (la
comparación deberá detenerse en cuanto se detecte alguna diferencia entre los
elementos).
 */
package guia6_egg;

import java.util.Scanner;

public class Extra19 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        int vectorUno [];
        int vectorDos [];
        int largo;
        System.out.println("Ingrese tamaño de vectores:");
        largo = leer.nextInt();
        vectorDos= new int [largo];
        vectorUno= new int [largo];
        cargarVectores(vectorUno, vectorDos);
        compararVectores(vectorUno, vectorDos);
        
    }
    public static void cargarVectores(int [] vectorUno, int [] vectorDos) {
        Scanner leer = new Scanner(System.in);
        //Cargar vector 1:
        for (int i = 0; i <vectorUno.length; i++) {
            System.out.println("Ingrese valor "+(i+1)+" para el vector 1:");
            vectorUno[i] = leer.nextInt();   
        }
        //Cargar vector 2:
        for (int i = 0; i <vectorUno.length; i++) {
            System.out.println("Ingrese valor "+(i+1)+" para el vector 2:");
            vectorDos[i] = leer.nextInt();   
        }
    }
    
    public static void compararVectores(int [] vectorUno, int [] vectorDos) {
        
        boolean bandera = false;
        for (int i = 0; i <vectorDos.length; i++) {
            if (vectorUno[i]!=vectorDos[i]) {
                bandera = true;
                break;
            } 
        }
        if (bandera == false) {
            System.out.println("Ambos vectores son iguales");
        } else {
            System.out.println("No son iguales los vectores");
        }
    }
}
