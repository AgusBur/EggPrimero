
package guia6_egg;

import java.util.Scanner;

public class Extra4 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        int num;
        System.out.println("Ingrese un núm del 1-10");
        num=leer.nextInt();
        
        switch(num){
            case 1: System.out.println("En romano sería = I");
            break;
            case 2: System.out.println("En romano sería = II");
            break;
            case 3: System.out.println("En romano sería = III");
            break;
            case 4: System.out.println("En romano sería = IV");
            break;
            case 5: System.out.println("En romano sería = V");
            break;
            case 6: System.out.println("En romano sería = VI");
            break;
            case 7: System.out.println("En romano sería = VII");
            break;
            case 8: System.out.println("En romano sería = VIII");
            break;
            case 9: System.out.println("En romano sería = IX");
            break;
            case 10: System.out.println("En romano sería = X");
            break;
            default: System.out.println("Número ingresado fuera de rango");
            break;
        }
    }
    
}
