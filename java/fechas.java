import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class fechas {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

       
        System.out.print("Ingresa la primera fecha (yyyy-MM-dd): ");
        String fecha1Str = scanner.next();

       
        System.out.print("Ingresa la segunda fecha (yyyy-MM-dd): ");
        String fecha2Str = scanner.next();

        
        LocalDate fecha1 = LocalDate.parse(fecha1Str, dateFormatter);
        LocalDate fecha2 = LocalDate.parse(fecha2Str, dateFormatter);

     
        long diferenciaDias = ChronoUnit.DAYS.between(fecha1, fecha2);

        
        System.out.println("La diferencia en días entre las fechas es: " + diferenciaDias + " días");

      
        scanner.close();
    }
}
