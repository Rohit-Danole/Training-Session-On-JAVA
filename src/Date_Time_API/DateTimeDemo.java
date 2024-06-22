package Date_Time_API;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class DateTimeDemo
{
    public static void main(String[] args)
    {
        //java code for local date and local time
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);

        //Current Date
        LocalTime localTime = LocalTime.now();
        System.out.println(localTime);

        //Current Date and Time
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("Local Date And Time Is " +localDateTime);

        //print in format
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ISO_LOCAL_DATE;

        //String Format Local Time
        System.out.println(dateTimeFormatter);

        //Print Month days and Seconds
        Month month = localDate.getMonth();
        System.out.println(month);

    }
}
