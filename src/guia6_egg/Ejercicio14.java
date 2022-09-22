
package guia6_egg;

import java.util.Scanner;

public class Ejercicio14 {

    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de euros a convertir:");
        double euros = leer.nextDouble();

        System.out.println("A que moneda quiere cambiar:");
        System.out.println("1)Dólares - 2)Yenes - 3)Libras");
        int opc = leer.nextInt();
        
        switch (opc) {
            case 1: cambioEuro(euros,1.28,opc);
            break;
            case 2: cambioEuro(euros,129.8,opc);
            break;
            case 3: cambioEuro(euros,0.86,opc);
            break;
            default: System.out.println("Ingresó opción inválida");
            break;
        }
        
    }
    
    public static void cambioEuro(double euros,double b, int opc){
        double resultado;
        resultado = (euros * b) ; 
         switch (opc) {
            case 1: System.out.println("Tendrás: "+ resultado + " en dólares");
            break;
            case 2: System.out.println("Tendrás: "+ resultado + " en yenes");
            break;
            case 3: System.out.println("Tendrás: "+ resultado + " en libras");
            break;
        }
    }
}
