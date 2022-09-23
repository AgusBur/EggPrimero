/*Declarar cuatro variables de tipo entero A, B, C y D y asignarle un valor diferente a cada
una. A continuación, realizar las instrucciones necesarias para que: B tome el valor de C, C
tome el valor de A, A tome el valor de D y D tome el valor de B. Mostrar los valores
iniciales y los valores finales de cada variable. Utilizar sólo una variable auxiliar.*/
package guia6_egg;

import java.util.Scanner;

public class Extra2 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int aux=0,a=0,b=0,c=0,d=0;
        
        System.out.println("Ingrese 4 números:");
        System.out.println("A");
        a = leer.nextInt();
        System.out.println("B");
        b = leer.nextInt();
        System.out.println("C");
        c = leer.nextInt();
        System.out.println("D");
        d = leer.nextInt();
        
        System.out.println("Cambiando de lugar....");
        aux=c;
        c=a;
        a=d;
        d=b;
        b=aux;
        
        System.out.println("Ahora la A vale D:" + a );
        System.out.println("Ahora la B vale C:" + b );
        System.out.println("Ahora la C vale A:" + c );
        System.out.println("Ahora la D vale B:" + d );
    }
    
}
