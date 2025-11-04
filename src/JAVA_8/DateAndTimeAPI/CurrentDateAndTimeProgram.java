package JAVA_8.DateAndTimeAPI;
import java.time.*;

public class CurrentDateAndTimeProgram {
    public static void main(String[] args){
        LocalDate localdate= LocalDate.now();
        LocalTime localtime= LocalTime.now();

        ZoneId zoneid= ZoneId.of("Europe/London");
        ZonedDateTime LondonTime=ZonedDateTime.now(zoneid);

        System.out.println("Current date at London: "+localdate);
        System.out.println("Current time at london: "+localtime);
        System.out.println("Current zone at london: "+LondonTime);
    }
}
