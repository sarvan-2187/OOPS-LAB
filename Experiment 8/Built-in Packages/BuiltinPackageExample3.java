import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class BuiltinPackageExample3 {
    public static void main(String[] args) {
        LocalDate currentDate = LocalDate.now();
        System.out.println("Current Date: " + currentDate);
        
        LocalTime currentTime = LocalTime.now();
        System.out.println("Current Time: " + currentTime);
        
        LocalDateTime currentDateTime = LocalDateTime.now();
        System.out.println("Current Date and Time: " + currentDateTime);
        
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEEE, MMMM dd, yyyy HH:mm:ss");
        String formattedDateTime = currentDateTime.format(formatter);
        System.out.println("\nFormatted Date and Time: " + formattedDateTime);
        
        LocalDate futureDate = currentDate.plusDays(100);
        LocalDate pastDate = currentDate.minusMonths(3);
        
        System.out.println("\nDate after 100 days: " + futureDate);
        System.out.println("Date 3 months ago: " + pastDate);
        
        long daysBetween = ChronoUnit.DAYS.between(pastDate, futureDate);
        System.out.println("Days between " + pastDate + " and " + futureDate + ": " + daysBetween);
        
        ZonedDateTime nyTime = ZonedDateTime.now(ZoneId.of("America/New_York"));
        ZonedDateTime tokyoTime = ZonedDateTime.now(ZoneId.of("Asia/Tokyo"));
        ZonedDateTime londonTime = ZonedDateTime.now(ZoneId.of("Europe/London"));
        
        System.out.println("\nCurrent time in different zones:");
        System.out.println("New York: " + nyTime.format(DateTimeFormatter.ofPattern("HH:mm:ss")));
        System.out.println("Tokyo: " + tokyoTime.format(DateTimeFormatter.ofPattern("HH:mm:ss")));
        System.out.println("London: " + londonTime.format(DateTimeFormatter.ofPattern("HH:mm:ss")));
    }
}
