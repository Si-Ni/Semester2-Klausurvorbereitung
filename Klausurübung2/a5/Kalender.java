import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Kalender {
    public static void main(String[] args) throws ParseException {
        Calendar c = Calendar.getInstance();
        System.out.println(c.get(Calendar.WEEK_OF_MONTH));
        System.out.println(c.get(Calendar.WEEK_OF_YEAR));
        c.add(Calendar.WEEK_OF_MONTH, 1);
        System.out.println(c.get(Calendar.WEEK_OF_MONTH));
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        System.out.println(sdf.format(c.getTime()));
    }
}