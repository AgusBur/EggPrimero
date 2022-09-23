
package guia6_egg;

import java.util.Scanner;

public class Extra1 {

    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
       double minutos,resto;
       long dias=0,horas=0;
        System.out.println("Ingrese cantidad de minutos:");
        minutos=leer.nextInt();
       
        if (minutos==1440) {
            dias=1;       
        } else if (minutos>1440){
            dias= Math.round(1600/1440);
            horas=Math.round((minutos-1440)/60);
        }
        
        System.out.println("La cantidad en minutos serían:");
        System.out.println(dias+" día/s");
        System.out.println(horas+" hora/s");
    }
    
}
