package CoreJava.CollectionFramework.SetInterface;
import java.util.*;

enum Day{
    Monday, Tuesday, Wednesday, Thursday,Friday, Saturday,Sunday;
}

public class EnumSetExample {
    public static void main(String[] args) {
    EnumSet<Day> WeekDays= EnumSet.range(Day.Monday,Day.Friday);
    EnumSet<Day> Weekends= EnumSet.of(Day.Saturday,Day.Sunday);
    EnumSet<Day> HoliDays= EnumSet.noneOf(Day.class);

    System.out.println("Weekdays for office are: "+ WeekDays);
    System.out.println("Weekends for office are: "+Weekends);
    System.out.println("Holidays for office are: "+HoliDays);

    }
}
