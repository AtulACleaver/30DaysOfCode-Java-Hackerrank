package calendarpractice;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
public class CalendarPractice {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        System.out.println();

        System.out.println(cal.getTime());

        SimpleDateFormat format1 = new SimpleDateFormat("dd MMMM, yyyy");
        String formatted = format1.format(cal.getTime());
        System.out.println("This is today's day --> " + formatted);
    }
}
