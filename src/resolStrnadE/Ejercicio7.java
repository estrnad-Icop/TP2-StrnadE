package resolStrnadE;

import java.util.Scanner;

public class Ejercicio7 {

    static void ejecutar(){

       Scanner sc = new Scanner(System.in); 

        System.out.println("Ingrese un numero entero: "); 

        int n = sc.nextInt(); 

        int contador=1;


        if (n>0) {

            for(int i=0; i<n;i++){
                for(int m=0;m<contador;m++){
                    System.out.print("*");
                    
                }
                System.out.println("\n");
                contador++;
            }
            
        }else{

            System.out.println("Ingrese un nuemero mayor a 0");

        } 
        
        sc.close();


    }
}
