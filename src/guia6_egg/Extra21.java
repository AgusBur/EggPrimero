/*
Los profesores del curso de programación de Egg necesitan llevar un registro de las notas
adquiridas por sus 10 alumnos para luego obtener una cantidad de aprobados y
desaprobados. Durante el periodo de cursado cada alumno obtiene 4 notas, 2 por trabajos
prácticos evaluativos y 2 por parciales. Las ponderaciones de cada nota son:
Primer trabajo práctico evaluativo 10%
Segundo trabajo práctico evaluativo 15%
Primer Integrador 25%
Segundo integrador 50%
Una vez cargadas las notas, se calcula el promedio y se guarda en el arreglo. Al final del
programa los profesores necesitan obtener por pantalla la cantidad de aprobados y
desaprobados, teniendo en cuenta que solo aprueban los alumnos con promedio mayor o
igual al 7 de sus notas del curso.
 */
package guia6_egg;

import java.util.Scanner;

public class Extra21 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int alumnos=3;
        int primerTp=0, segundoTp=0, primerInt=0, segundoInt=0;
        cargarNotas(alumnos, primerTp, segundoTp, primerInt, segundoInt);
        
    }
    
    
    public static void cargarNotas(int alumnos, int primerTp, int segundoTp,
            int primerInt, int segundoInt) {
        
        Scanner leer = new Scanner(System.in);
        double promedio;
        double [] vectorProm;
        vectorProm = new double [alumnos];
        
        for (int i = 0; i <alumnos; i++) {
            promedio=0;
            System.out.println("Ingrese nota de primer Tp del alumno: "+(i+1));
            primerTp = leer.nextInt();
            System.out.println("Ingrese nota del segundo Tp del alumno: "+(i+1));
            segundoTp = leer.nextInt();
            System.out.println("Ingrese nota de primer Integrador del alumno: "+(i+1));
            primerInt = leer.nextInt();
            System.out.println("Ingrese nota del segundo Integrador del alumno: "+(i+1));
            segundoInt = leer.nextInt();
            
            promedio = ((primerTp)+(segundoTp)+(primerInt)+(segundoInt))/4;
            vectorProm[i] = promedio;
        }
        aprobados(vectorProm, alumnos);
    }
    
    public static void aprobados(double [] vector, int alumnos) {
        
        for (int i = 0; i <alumnos; i++) {
            
            if (vector[i]>=7) {
                System.out.println("Alumno "+(i+1)+" APROBADO");
                System.out.println("Promedio: "+vector[i]);
            } else {
              System.out.println("Alumno "+(i+1)+" DESAPROBADO");
              System.out.println("Promedio: "+vector[i]);  
            }
        }
    }
}
