package JAVA_8.DateAndTimeAPI;
import java.time.*;

public class UseOfDateAndTimeAPI {
    public static void main(String[] args) {
        LocalDate localdate= LocalDate.of(2025,10,5);
        LocalTime localtime= LocalTime.of(10,20,45);

        ZoneId zoneid= ZoneId.of("Asia/Kolkata");
        ZonedDateTime zoneddatetime= ZonedDateTime.of(localdate,localtime,zoneid);

        System.out.println("Date: "+localdate);
        System.out.println("Time: "+localtime);
        System.out.println("Zone:"+zoneddatetime);
    }
}
