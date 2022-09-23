
package guia6_egg;

import java.util.Scanner;

public class Ejercicio20 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int m =3, valor=1, num, k, diagoDer, diagoIzq, suma;
        int matriz [][] = new int [m][m];
        int vectorFilas [], vectorColumnas[];
        vectorFilas = new int [m];
        vectorColumnas = new int [m];
        boolean bandera = true;
        
        
        //Cargar matriz comprobando números
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                do {                    
                    System.out.println("Ingrese números del 1-9 para cargar matriz:");
                    num = leer.nextInt();
                } while (num < 1 || num >10);
                System.out.println("Valor: "+valor+" cargado!");
                matriz [i][j] = num;
                valor+=1;
            }
        }
        // Mostrar matriz
        
        System.out.println("La matriz cargada quedaría:");
        System.out.println("---------------------------");
        for (int i = 0; i <m; i++) {
            for (int j = 0; j <m; j++) {
                System.out.print(" [" + matriz [i][j]+ "] ");       
            }
            System.out.println(" ");
        }
        
        //Calcular sumas:
        
        //Filas, calculo una fila y la guardo en vector:
        k=0;
        for (int i = 0; i <m; i++) {
            suma=0;
            for (int j = 0; j <m; j++) { 
                suma += matriz[i][j];
            }
            vectorFilas[i]=suma;
            System.out.println("La suma de fila n° "+(k+1)+" es: "+suma);
            k+=1;
        }
        
        //columnas: calculo 1 columna y la guardo en vector:
        k=0;
        for (int j = 0; j <m; j++) {
            suma=0;
            for (int i = 0; i <m; i++) {
             suma += matriz [i][j];   
            }
            vectorColumnas[j]=suma;
            System.out.println("La suma de columna n° "+(k+1)+" es: "+suma);
            k+=1;
        }
        
        //Diagonal Izq (Principal)
        diagoIzq=0;
        for (int i = 0; i <m; i++) {
                diagoIzq += matriz[i][i];
                //diagonalIzq=diagonzalIzq+matriz
        }
        System.out.println("La suma de diagonzal izq es: "+diagoIzq);
        
        //Diagonal Der (Difícil)
        diagoDer=0;
        k=3;
        for (int i = 0; i <m; i++) {
            diagoDer += matriz[i][k-1];
            k--;
        }
        System.out.println("La suma de diagonal der es: "+diagoDer);
        
        //Comprobar si es mágica:
        
        for (int i = 0; i <m; i++) {
            if (vectorColumnas[i] == vectorFilas[i]) {
                bandera = true;
            } else {
                bandera = false;
                i=m;
            }
        }
        
        if (bandera==true) {
            for (int i = 0; i <m; i++) {
                bandera = ((vectorColumnas[i] == diagoDer) && (vectorColumnas[i]== diagoIzq));
            }           
        } 
        if (bandera == true) {
                    System.out.println("Es una matriz mágica!"); 
                    System.out.println("Todas sus sumas son: "+diagoDer);
                } else {
                    System.out.println("No es una matriz mágica");
                }
    }  
}

//Para sacar las diagonales:
//Tomo la matriz magica de ejemplo para encontrar alguna coincidencia:
//	2 7 6
//	9 5 1
//	4 3 8
//La diagonal IZQUIERDA, posiciones:
//       i,j
//   2 = 0,0
//   5 = 1.1
//   8 = 2,2
//Conclusión: la diagonal IZQUIERDA se puede calcular aumentando 1 en 1 
//en x y en i A LA VEZ.
//La diagonal DERECHA, posiciones:
//       i,j
//   6 = 0,2
//   5 = 1,1
//   4 = 2,0
//Conculsión: la diagonal DERECHA se puede calcular: 
//1) aumentando en 1 a x. (x comenzaría en 0)
//2) restando en 1 a i . (i comenzaría en el largo-1)