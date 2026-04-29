package resolStrnadE;

import java.util.Scanner;

public class Ejercicio10 {

    static void ejecutar(){
    
        Scanner sc = new Scanner(System.in);

        float [] notas=new float[10];

        String [] alumnos = new String[10];

        for (int i=0; i<10; i++){

            System.out.println("Ingrese 10 notas del 0 al 10");

            notas[i]= sc.nextInt();

            sc.nextLine();

            System.out.println("Ingrese nombre del alumno");

            alumnos[i]=sc.nextLine();

        }
    
        for(int m=0; m<10; m++){
            if (notas[m]>=9 && notas[m]<=10) {
                System.out.println(alumnos[m] + ": " + notas[m] + " Sobresaliente");

            }else if (notas[m]>=7 && notas[m]<=8.99f) {
                System.out.println(alumnos[m] + ": " + notas[m] + " Notable");
            }else if (notas[m]>=5 && notas[m]<=6.99f) {
                System.out.println(alumnos[m] + ": " + notas[m] + " Bien");
            }else {
                System.out.println(alumnos[m] + ": " + notas[m] + " Suspenso");
            }


        }
               
        sc.close();
    }

}
