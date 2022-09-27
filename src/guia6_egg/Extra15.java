/*
Crea una aplicación que le pida dos números al usuario y este pueda elegir entre sumar,
restar, multiplicar y dividir. La aplicación debe tener una función para cada operación
matemática y deben devolver sus resultados para imprimirlos en el main.
 */
package guia6_egg;

import java.util.Scanner;

public class Extra15 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        int num1,num2,opc;
        
        System.out.println("Ingrese un número: ");
        num1=leer.nextInt();
        System.out.println("Ingrese otro número:");
        num2=leer.nextInt();
        
        System.out.println("Que operación desea hacer?");
        System.out.println("1: Suma, 2: Resta, 3: Multiplicación, 4: División");
        opc = leer.nextInt();
        
        switch (opc){
            case 1: System.out.println(suma(num1,num2));;
            break;
            case 2: System.out.println(resta(num1,num2));
            break;
            case 3: System.out.println(multi(num1,num2));
            break;
            case 4: System.out.println(divi(num1,num2));
            break;
            default: System.out.println("Opción inválida");
            break;      
        }
    }
    public static double suma (int num1, int num2) {
        return num1+num2;
    }
    
    public static double resta(int num1, int num2) {
        return num1-num2; 
    }
    
    public static double multi(int num1,int num2) {
        return num1*num2;
    }
    
    public static double divi(int num1, int num2) {
        return num1/num2;    
    }
}
