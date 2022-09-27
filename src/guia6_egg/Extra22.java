/*
 Realizar un programa que rellene una matriz de tamaño NxM con valores aleatorios y
muestre la suma de sus elementos.
 */
package guia6_egg;

import java.util.Scanner;

public class Extra22 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        int [][] matriz;
        int n,m;
        System.out.println("Ingrese tamaño de filas:");
        n = leer.nextInt();
        System.out.println("Ingrese tamaño de columnas:");
        m = leer.nextInt();
        matriz = new int [n][m];
        rellenoMatriz(matriz, n, m);
        mostrarMatriz(matriz, n, m);
        sumaMatriz(matriz, n, m);
        
    }
    
    public static void rellenoMatriz(int [][] matriz, int n, int m) {
        
        for (int i = 0; i <n; i++) {
            for (int j = 0; j <m; j++) {
                matriz[i][j] = (int)(Math.random()*9+1);
            }
        }
    }
    
    
    public static void mostrarMatriz(int [][] matriz, int n, int m) {
        for (int i = 0; i <n; i++) {
            for (int j = 0; j <m; j++) {
                System.out.print(" [ "+matriz[i][j]+" ] ");
            }
            System.out.println("");
        }
    }
    
    public static void sumaMatriz(int [][] matriz, int n, int m) {
        int suma=0;
        for (int i = 0; i <n; i++) {
            for (int j = 0; j <m; j++) {
                suma+=matriz[i][j];
            }
        }
        System.out.println("La suma de todos sus elementos es de: "+suma);   
    }
}
