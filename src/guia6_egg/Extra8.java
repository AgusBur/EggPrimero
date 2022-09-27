/*
Escriba un programa que lea números enteros. Si el número es múltiplo de cinco debe
detener la lectura y mostrar la cantidad de números leídos, la cantidad de números pares y
la cantidad de números impares. Al igual que en el ejercicio anterior los números
negativos no deben sumarse. Nota: recordar el uso de la sentencia break.
 */
package guia6_egg;

import java.util.Scanner;

public class Extra8 {
    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num, cantPar=0,cantImpar=0,total=0;
        
        System.out.println("Ingrese un n°");
        num=leer.nextInt();
        
        while (num%5!=0) {            
            if (num>0) {
                total+=1;
                if (num%2==0) {
                    cantPar+=1;
                } else{
                    cantImpar+=1;
                }
            } 
            System.out.println("Ingrese un n°");
            num=leer.nextInt();
        }
        
        System.out.println("Cantidad de n° > 0 ingresados= "+total);
        System.out.println("Cantidad de n° pares > 0 = "+cantPar);
        System.out.println("Cantidad de n° impares > 0 = "+cantImpar);
    }
    
}
