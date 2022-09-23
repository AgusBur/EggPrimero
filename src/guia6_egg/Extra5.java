package guia6_egg;

import java.util.Scanner;

public class Extra5 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String opc, opcMinuscula;
        int costo = 3000;
        double pagar = 0;

        System.out.println("Ingrese clase de socio: A/B/C");
        opc = leer.next();
        opcMinuscula = opc.toLowerCase();
        System.out.println("El costo del tratamiento es: " + costo);

        switch (opcMinuscula) {
            case "a":
                pagar = (3000 * 0.5);
                System.out.println("Clase A debe pagar= " + pagar);
                break;
            case "b":
                pagar = (3000 * 0.35);
                System.out.println("Clase B debe pagar= " + pagar);
                break;
            case "c":
                pagar = costo;
                System.out.println("Clase A debe pagar= " + pagar);
                break;
            default:
                System.out.println("Ingreso de clase inválida");
                break;
        }

    }

}
