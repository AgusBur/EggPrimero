
package guia6_egg;

import java.util.Scanner;

public class Ejercicio19 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        int matriz [][];
        System.out.println("Ingrese dimensión de matriz cuadrada:");
        int m = leer.nextInt();
        int num;
        int valor=1;
        boolean logico=true;
        matriz = new int [m][m];
        
        //Cargar matriz
        for (int i = 0; i <m; i++) {
            for (int j = 0; j <m; j++) {
                do {                    
                    System.out.println("Ingrese núm para matriz (-1) al (+9)");
                    num = leer.nextInt();
                } while (num>10);
                System.out.println("Cargado valor: "+valor);
                matriz[i][j]=num;
                valor+=1;
            }    
        }
        
        //Mostrar matriz normal:
        System.out.println("La matriz cargada quedaría:");
        for (int i = 0; i <m; i++) {
            for (int j = 0; j <m; j++) {
               
                System.out.print(" ["+matriz[i][j]+("] "));
            }  
            System.out.println("");
        }
        
        //Mostrar traspuesta:
        System.out.println("Su matriz traspuesta es:");
        System.out.println("------------------------");
         for (int i = 0; i <m; i++) {
            for (int j = 0; j <m; j++) {
               
                System.out.print(" ["+matriz[j][i]+("] "));
            }  
            System.out.println("");
        }
         
         //Verificar si es antisimétrica:
         //para ello comparo un valor de una x posición con el valor de la 
         //posición traspuesta y signo (-)
         System.out.println("Verificando si es antisimétrica...");
         System.out.println("-----------------------------------");
         
         for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                logico = matriz[i][j] == -matriz[j][i];
                if (logico == false) {
                    break;
                }
            }
            if (logico == false) {
                break;
            }
        }
         //Dar resultado:
         if (logico==true) {
             System.out.println("Es una matriz antisimétrica!");
        } else {
             System.out.println("No es una matriz antisimétrica");
        }
         
    }
    
}
