package resolStrnadE;

import java.time.LocalDate;
import java.util.Scanner;

public class Ejercicio2 {
public static void ejecutar() {

        Scanner sc = new Scanner (System.in);
        
        LocalDate nacimiento= LocalDate.parse("2003-07-31");
        LocalDate hoy= LocalDate.now(); 

        long días = hoy.toEpochDay() - nacimiento.toEpochDay();

        System.out.println("En días vividos es " + días);

        sc.close();

    }
    

}
