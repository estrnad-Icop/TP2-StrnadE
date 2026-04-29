package resolStrnadE;

import java.time.Duration;
import java.time.LocalTime;

public class Ejercicio3 {

    public static void ejecutar(){

    LocalTime hora = LocalTime.of(20,23); 

    LocalTime hora2= LocalTime.of(22,20);

    Long minutos = Duration.between(hora, hora2).toMinutes();
    
    System.out.println("Los minutos entre las 20:23 y las 22:20 son: " + minutos);


    }

}
