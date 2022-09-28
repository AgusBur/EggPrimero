/*
Construya un programa que lea 5 palabras de mínimo 3 y hasta 5 caracteres y, a medida
que el usuario las va ingresando, construya una “sopa de letras para niños” de tamaño de
20 x 20 caracteres. Las palabras se ubicarán todas en orden horizontal en una fila que
será seleccionada de manera aleatoria. Una vez concluida la ubicación de las palabras,
rellene los espacios no utilizados con un número aleatorio del 0 al 9. Finalmente imprima
por pantalla la sopa de letras creada.
Nota: Para resolver el ejercicio deberá investigar cómo se utilizan las siguientes funciones
de Java substring(), Length() y Math.random().
 */
package guia6_egg;

import java.util.Scanner;

public class Extra23 {

    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
       
       String palabra;
       String buscar="";
       int contador=0;
       String [] [] matrizSopa = new String [20][20];
       
        //Cargo a la sopa previamente con "-" para que no me salte error:
        for (int i = 0; i <20; i++) {
            for (int j = 0; j <20; j++) {
                
                matrizSopa[i][j] = "-";
            }     
        }
       
       System.out.println("Ingrese 5 palabras para la sopa de letras");
        do {            
            System.out.println("Ingrese palabra para la sopa de letras"); 
            palabra = leer.next();
            if (verificarPalabra(palabra)) {
                buscar += palabra+"-";
                filaAleatoria(matrizSopa,palabra);
                completarSopa(matrizSopa);
                System.out.println("Bien!Palabra "+(contador+1)+" cargada");
                System.out.println("-------------------------------------");
                contador+=1;
            }
        } while (contador<5);

        System.out.println("Sopa cargada!!");
        mostrarSopa(matrizSopa,buscar);
  
       
    }
    
    public static boolean verificarPalabra(String palabra) {
        
        int largo;
        largo = palabra.length();
        return largo>=3 && largo<=5;
    }
    
    public static void filaAleatoria(String [][] matrizSopa, String palabra) {
        
        int filax=0;
        int contador = 0;
        int [] vectorFila = new int [5];
        boolean bandera=false;
        
        //Inicializo el vector de filas para no tener errores:
        for (int i = 0; i <5; i++) {
            vectorFila[i]=30;
        }
        
        for (int i = 0; i <5; i++) {
                filax = (int)(Math.random()*20+0);
                if (i==0) {
                    vectorFila[i]=filax;
                    contador+=1;
                } else if (i!=0 && contador<5) {
                    do {                        
                        for (int j = 0; j < 5; j++) {
                            if ((vectorFila[j])==filax) {
                                bandera=true;
                                break;
                            } else {
                                bandera=false;
                            }
                        }
                        if (bandera) {
                            filax = (int)(Math.random()*20+0); 
                        }
                    } while (bandera==true);
                
                    if (!bandera) {
                        vectorFila[i]=filax;
                        contador+=1;
                    }
                }
            }
        agregarAsopa(matrizSopa, palabra, filax);
    }
    
    public static void agregarAsopa(String [] [] matrizSopa,
            String palabra, int filax) {
        
        int k=0;
        int m;
        m = (int)(Math.random()*15+0);
        for (int i = 0; i <palabra.length(); i++) {
            matrizSopa [filax][m] = ""+palabra.charAt(k);
            k+=1;
            m+=1;
        }    
    }
    
    
    public static void completarSopa(String[][] matrizSopa) {
        
        int num;
        String numTexto;
        
        for (int i = 0; i <20; i++) {
            for (int j = 0; j <20; j++) {
                
                num = (int)(Math.random()*9+0);
                numTexto=Integer.toString(num);
                if (matrizSopa[i][j].equalsIgnoreCase("-")) {
                    matrizSopa[i][j] = numTexto;
                }
            }    
        }
    }
    
    public static void mostrarSopa(String[][]matrizSopa, String buscar) {
        
        System.out.println("Buscar:");
        System.out.print(buscar);
        System.out.println("");
        System.out.println("----------------------------");
        for (int i = 0; i <20; i++) {
            for (int j = 0; j <20; j++) {
                System.out.print("["+matrizSopa[i][j]+"]");
            }
            System.out.println(" ");
        }
    }
}
