package resolStrnadE;

import java.util.Scanner;
public class Ejercicio8 {

    static void ejecutar (){
        Scanner sc = new Scanner(System.in);    
    
        System.out.println("Ingrese la cantidad de litros ");
   
        float litros = sc.nextFloat(); 

        float normal= normal(litros);

        float desigual=desigual(litros);

        System.out.println("En carretera normales recorrerias: " + normal);
        System.out.println("En carreteras desiguales recorrerias: " + desigual);
        
        sc.close();
        
    }
    public static float  normal(float a){

        float distancia = (a*100)/8;

        return distancia;

    }

    public static float  desigual(float a){

        float distancia = (a*100)/9.2f;

        return distancia;

    }


}
    
