package JAVA_8.DateAndTimeAPI;
import java.time.*;

public class FindingDayOfTheWeekFromGivenDate {
    public static void main(String[] args) {
    LocalDate localdate= LocalDate.of(2025,11,6);
    System.out.println("Day of the week for the specified date is: "+localdate.getDayOfWeek());
    }
}
