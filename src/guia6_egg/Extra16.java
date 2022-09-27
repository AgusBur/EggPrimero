/*
Diseñe una función que pida el nombre y la edad de N personas e imprima los datos de
las personas ingresadas por teclado e indique si son mayores o menores de edad.
Después de cada persona, el programa debe preguntarle al usuario si quiere seguir
mostrando personas y frenar cuando el usuario ingrese la palabra “No”.
 */
package guia6_egg;

import java.util.Scanner;

public class Extra16 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String[] vectorNombre = null;
        String nombre="", opc="";
        int[] vectorEdad = null;
        int total=0, edad=0;
        ingreso(vectorNombre, vectorEdad, total, nombre, edad, opc);

    }

    public static void ingreso(String[] vectorNombre, int[] vectorEdad, int total, String nombre,
            int edad, String opc) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese número total de personas a evaluar:");
        total = leer.nextInt();
        vectorEdad = new int[total];
        vectorNombre = new String[total];

        for (int i = 0; i < total; i++) {
            System.out.println("Ingrese nombre de persona :" + (i + 1));
            nombre = leer.next();
            vectorNombre[i] = nombre;
            System.out.println("Ingrese su edad:");
            edad = leer.nextInt();
            vectorEdad[i] = edad;
        }
        System.out.println("-----------------------------------");
        System.out.println("Resultados:");

        for (int i = 0; i <total; i++) {
            System.out.println("Persona: " + (i + 1));
            if (vectorEdad[i] >= 18) {
                System.out.println(vectorNombre[i] + " es mayor de edad, tiene "
                        + vectorEdad[i] + " años");
            } else {
                System.out.println(vectorNombre[i] + " es menor de edad, tiene "
                        + vectorEdad[i] + " años");
            }
            System.out.println("Quiere continuar viendo más personas? si/no");
            opc = leer.next();
            if (opc.equalsIgnoreCase("no")) {
                break;
            }
        }
    }
}
