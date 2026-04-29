package resolStrnadE;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Ejercicio6 {
    
    static void ejecutar(){

            Scanner sc = new Scanner(System.in); 


        System.out.println("Ingrese la fecha de nacimiento: (yyyy-MM-dd)");

        LocalDate nacimiento = LocalDate.parse(sc.nextLine());

        LocalDate hoy = LocalDate.now();
        
        LocalDate cumple = nacimiento.withYear(hoy.getYear());

        if(cumple.isBefore(hoy) || cumple.isEqual(hoy)){
             cumple = cumple.plusYears(1);
        }

        Period falta= Period.between(hoy, cumple); 
        
        System.out.println("Faltan para tu cumpleaños: ");
        System.out.println(falta.getMonths()+" meses y " + falta.getDays() + " días");

        sc.close();

    }
}
