package resolStrnadE;
import java.time.LocalDate;

public class Ejercicio4 {
    
    public static void ejecutar(String[] args) {

        LocalDate nacimiento = LocalDate.parse("2003-07-31");
        
        System.out.println("El día era " + nacimiento.getDayOfWeek());
         
    }

}
