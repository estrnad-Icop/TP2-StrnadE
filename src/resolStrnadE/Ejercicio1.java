package resolStrnadE;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Ejercicio1 {

        public static void ejecutar() {

        Scanner sc = new Scanner (System.in);
        
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        System.out.println("Ingrese la primera fecha (dd/MM/yyyy HH:mm): ");
        String f1 = sc.nextLine();

        System.out.println("Ingrese la segunda fecha (dd/MM/yyyy HH:mm): ");
        String f2 = sc.nextLine();

        LocalDateTime fecha = LocalDateTime.parse(f1,formato); 

        LocalDateTime fecha2 = LocalDateTime.parse(f2,formato);  

        if (fecha.isAfter(fecha2)){
            System.out.println("La primera fecha es mayor");

        }else if(fecha.isBefore(fecha2)){
            System.out.println("La segunda fecha es mayor");
        }else{
            System.out.println("Las dos fechas son iguales");
        } 

        sc.close();

    }

}
