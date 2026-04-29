package resolStrnadE;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Period;

public class Ejercicio5 {

    static void ejecutar (){

  LocalDateTime fecha_parcial = LocalDateTime.parse("2026-06-25T19:20");
        LocalDateTime hoy = LocalDateTime.now();

        Period periodo = Period.between(hoy.toLocalDate(), fecha_parcial.toLocalDate()); 
        
        Duration tiempo = Duration.between(hoy, fecha_parcial); 

        long horas = tiempo.toHours() % 24; 
        long minutos = tiempo.toMinutes() % 60; 

        System.out.println("Faltan:");
        System.out.println(periodo.getMonths() + " meses, " + periodo.getDays() + " días, "+horas+ " horas, " + minutos + " minutos"  
    );
         

    }
}
