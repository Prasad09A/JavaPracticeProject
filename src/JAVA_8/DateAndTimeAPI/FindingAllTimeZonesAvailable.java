package JAVA_8.DateAndTimeAPI;
import java.time.*;

public class FindingAllTimeZonesAvailable {
    public static void main(String[] args) {
        ZoneId.getAvailableZoneIds().forEach(ZoneId->System.out.println(ZoneId));

    }
}
