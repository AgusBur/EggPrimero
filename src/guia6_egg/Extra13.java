/*
 Crear un programa que dibuje una escalera de números, donde cada línea de números
comience en uno y termine en el número de la línea. Solicitar la altura de la escalera al
usuario al comenzar. Ejemplo: si se ingresa el número 3:
1
12
123
 */
package guia6_egg;

import java.util.Scanner;

public class Extra13 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        int num, cont = 1;
        System.out.println("Ingrese un número:");
        num = leer.nextInt();

        for (int i = 1; i <= num; i++) {
            System.out.print(" " + i);
            if (cont == i) {
                System.out.println("");
                cont++;
                i = 0;
            }
            if (cont == num + 1) {
                break;
            }
        }
    }
}
    
