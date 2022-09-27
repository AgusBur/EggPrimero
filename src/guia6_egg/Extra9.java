/*
 Simular la división usando solamente restas. Dados dos números enteros mayores que
uno, realizar un algoritmo que calcule el cociente y el residuo usando sólo restas. Método:
Restar el dividendo del divisor hasta obtener un resultado menor que el divisor, este
resultado es el residuo, y el número de restas realizadas es el cociente.
 */
package guia6_egg;

import java.util.Scanner;

public class Extra9 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num1, num2, resta=0,cont=0;
        
        System.out.println("Ingrese dos n° mayores a 1:");
        num1=leer.nextInt();
        num2=leer.nextInt();
        
        System.out.println("Se hará división con restas con n° "+num1+" / "+num2);
        resta=num1-num2;
        cont=1;
        
        while (resta>num2) {            
            resta=resta-num2; 
            cont+=1;
        }
        
        System.out.println("------------Resultados:------------");
        System.out.println("El cociente es: "+cont);
        System.out.println("El residuo es: "+resta);
    }
    
}
