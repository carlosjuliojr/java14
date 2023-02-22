import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DatesJava {
    public static void main(String[] args) {
        Date date = new Date();

        System.out.println("date = " + date);

        /**
         * format
         */

        SimpleDateFormat df = new SimpleDateFormat("dd-MM-YYYY");
        String dateStr = df.format(date);
        System.out.println("dateStr = " + dateStr);
        /**
         * get time
         */

        System.out.println("date.getTime() = " + date.getTime());

        /**
         * Calendar
         */

        Calendar calendar = Calendar.getInstance();
        System.out.println("calendar.getTime() = " + calendar.getTime());
        calendar.set(2020,12,1);
        System.out.println("calendar.getTime() = " + calendar.getTime());
        System.out.println(Calendar.YEAR);

        /**
         * convert string to date
         */

        try {
            Date date2 = df.parse("15-12-2021");
            System.out.println("date2 = " + date2);
            System.out.println("df.format(date2) = " + df.format(date2));
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }


    }
}
