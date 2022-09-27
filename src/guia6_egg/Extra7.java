/*
Realice un programa que calcule y visualice el valor máximo, el valor mínimo y el promedio
de n números (n>0). El valor de n se solicitará al principio del programa y los números
serán introducidos por el usuario. Realice dos versiones del programa, una usando el
bucle “while” y otra con el bucle “do - while
 */
package guia6_egg;

import java.util.Scanner;

public class Extra7 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int numTotal,num=0, aux=1, minimo=0,maximo=0,prom=0,suma=0;
        
        System.out.println("Ingrese cantidad total de n° que ingresará:");
        numTotal = leer.nextInt();
        
        
        while (aux<=numTotal) { 
            System.out.println("Ingrese n°"+aux);
            num=leer.nextInt();
            if (num>0) {
              suma+=num;
            } 
            if (aux==1) {
                minimo=num;
                maximo=num;
            }else if (num<minimo){
                minimo=num;
            }else if (num>maximo) {
                maximo=num;
            }
            aux+=1;  
        }
        
        prom=suma/numTotal;
        
        System.out.println("El menor n° ingresado fue: " + minimo);
        System.out.println("El mayor n° ingresado fue: "+ maximo);
        System.out.println("El promedio gral de todos es: "+prom);
        
        
    }   
}

//version con do while:
     /* 
        do {            
            System.out.println("Ingrese n°:" +aux);
            num=leer.nextInt();
            if (num>0) {
              suma+=num;
            } 
            if (aux==1) {
                minimo=num;
                maximo=num;
            }else if (num<minimo){
                minimo=num;
            }else if (num>maximo) {
                maximo=num;
            }
            aux+=1;
            
        } while (aux<=numTotal);*/