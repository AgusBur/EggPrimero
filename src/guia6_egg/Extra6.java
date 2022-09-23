
package guia6_egg;

import java.util.Scanner;

public class Extra6 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        double altura, personas, promChico=0, promGral=0;
        int contador=1, contChico=1;
        
        System.out.println("Ingrese núm de personas:");
        personas=leer.nextInt();
        
        while (contador<=personas) {     
            System.out.println("Ingrese altura(m) de persona: "+contador);
            altura=leer.nextDouble();
            if (altura<=1.60) {
                promChico+=altura;
                contChico++;
            }
            promGral+=altura;
            contador++;
        }
        
        System.out.println("Altura promedio de personas <1,60 m:");
        System.out.println(promChico+" ingresaste "+contChico+" persona/s");
        System.out.println("Altura promedio de las"+personas+" es: "+promGral);
        
    }
    
}
