/*Crea una aplicación que a través de una función nos convierta una cantidad de euros
introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o libras. La
función tendrá como parámetros, la cantidad de euros y la moneda a converir que será
una cadena, este no devolverá ningún valor y mostrará un mensaje indicando el cambio
(void).*/

package guia6_egg;

import java.util.Scanner;

public class Ejercicio14 {

    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de euros a convertir:");
        double euros = leer.nextDouble();
        String moneda;
        boolean bandera;
        do {            
            System.out.println("A que moneda quiere cambiar: dolares, yenes o libras");
            moneda = leer.next();
        if (bandera = moneda.equalsIgnoreCase("dolares")||moneda.equalsIgnoreCase("yenes")|| 
                    moneda.equalsIgnoreCase("libras")){
         }else{
                System.out.println("Incorrecto");
            }
        } while (bandera==false);
        cambioEuro(euros, moneda);
    }
    
    public static void cambioEuro(double euros,String moneda){
       
        if (moneda.equalsIgnoreCase("dolares")) {
            System.out.println("Tendrás "+(euros*1.28)+" dólares");
        } else if (moneda.equalsIgnoreCase("yenes")) {
            System.out.println("Tendrás "+(euros*129.852)+" yenes");
        } else if (moneda.equalsIgnoreCase("libras")){
            System.out.println("Tendrás "+(euros*0.86)+" libras");
        }
    }
}
