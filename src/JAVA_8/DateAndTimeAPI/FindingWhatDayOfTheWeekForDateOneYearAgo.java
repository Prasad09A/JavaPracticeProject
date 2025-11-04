package JAVA_8.DateAndTimeAPI;
import java.time.*;

public class FindingWhatDayOfTheWeekForDateOneYearAgo {
    public static void main(String[] args) {

    System.out.println(LocalDate.now().minusYears(1).getDayOfWeek());
    }
}
