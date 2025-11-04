package JAVA_8.DateAndTimeAPI;
import java.time.*;
import java.time.format.DateTimeFormatter;

public class FindDateUsingBeforeAndAfterMethods {
    public static void main(String[] args) {
    DateTimeFormatter formatter= DateTimeFormatter.ofPattern("dd MM yyyy");

    LocalDate today= LocalDate.now();
    System.out.println("Today's date is: "+formatter.format(today));

    LocalDate BeforeWeek= today.minusWeeks(1);
    System.out.println("Before one week from todays date is: "+formatter.format(BeforeWeek));

    LocalDate BeforeMonth= today.minusMonths(1);
    System.out.println("Before one month from todays date is: "+formatter.format(BeforeMonth));

    LocalDate BeforeYear= today.minusYears(1);
    System.out.println("Before one year form today's date is: "+formatter.format(BeforeYear));

    LocalDate AfterWeek= today.plusWeeks(1);
    System.out.println("After one week from today's date: "+formatter.format(AfterWeek));

    LocalDate AfterMonth= today.plusMonths(1);
    System.out.println("After one months from today's date: "+formatter.format(AfterMonth));

    LocalDate AfterYear= today.plusYears(1);
    System.out.println("After one years from today's date:"+ formatter.format(AfterYear));
    }
}
