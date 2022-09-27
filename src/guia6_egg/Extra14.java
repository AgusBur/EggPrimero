/*
 Se dispone de un conjunto de N familias, cada una de las cuales tiene una M cantidad de
hijos. Escriba un programa que pida la cantidad de familias y para cada familia la cantidad
de hijos para averiguar la media de edad de los hijos de todas las familias.
 */
package guia6_egg;

import java.util.Scanner;

public class Extra14 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        int familias,media,suma=0,edad=0,m=0;
        int vectorH [];
        int vectorEdad [];
        
        System.out.println("Ingrese cantidad de familias:");
        familias=leer.nextInt();
        vectorH = new int [familias];
        
        
        for (int i = 0; i <familias; i++) {
            System.out.println("Ingrese cantidad de hijos de familia: "+(i+1));
            m = leer.nextInt();
            vectorH[i]=m;
            suma=0;
            for (int j = 0; j <m; j++) {
                System.out.println("Ingrese edad de hijo n°: "+(j+1));
                edad = leer.nextInt();
                suma+=edad;
            }
            media=suma/m;
            System.out.println("La media de edad de hijos de flia n°: "+(i+1));
            System.out.println(media);
        }
    }
    
}
