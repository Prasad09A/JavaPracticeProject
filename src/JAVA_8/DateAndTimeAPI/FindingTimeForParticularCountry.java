package JAVA_8.DateAndTimeAPI;
import java.time.*;
import java.time.format.DateTimeFormatter;

public class FindingTimeForParticularCountry {
    public static void main(String[] args) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MM yyyy hh:mm:ss");

        ZoneId zoneid = ZoneId.of("Asia/Kolkata");
        ZonedDateTime DelhiTime = ZonedDateTime.now(zoneid);
        System.out.println("Current time at delhi is: " + formatter.format(DelhiTime));


        ZoneId zoneid1 = ZoneId.of("Europe/London");
        ZonedDateTime LondonTime = ZonedDateTime.now(zoneid1);
        System.out.println("Current time at  London is: " + formatter.format(LondonTime));

        ZoneId zoneid2= ZoneId.of("Asia/Singapore");
        ZonedDateTime SingaporeTime= ZonedDateTime.now(zoneid2);
        System.out.println("CurrentTime at Singapore is: "+formatter.format(SingaporeTime));

        ZoneId zoneid3= ZoneId.of("America/New_York");
        ZonedDateTime NewyorkTime= ZonedDateTime.now(zoneid3);
        System.out.println("Current time at New York is: "+formatter.format(NewyorkTime));
    }
}