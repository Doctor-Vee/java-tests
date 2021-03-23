import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class DateTimeFormat {


    public static void main(String[] args) throws Exception {


        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        System.out.println(timestamp);
        System.out.println(timestamp.toLocalDateTime().format(DateTimeFormatter.ISO_DATE_TIME));
        String chequeDate = "12/05/1992";
        Timestamp dateOfCheque = getTimestamp(chequeDate, "dd/MM/yyyy");
        System.out.println(dateOfCheque);
        System.out.println(dateOfCheque.toLocalDateTime().format(DateTimeFormatter.ISO_DATE_TIME));
        LocalDateTime theTimeNow = LocalDateTime.now();
        System.out.println(theTimeNow);
        String theFormattedTime = timestamp.toLocalDateTime().format(DateTimeFormatter.ISO_DATE_TIME);
        System.out.println(theTimeNow.format(DateTimeFormatter.ISO_DATE_TIME));
        System.out.println("The formatted timestamp is: " + theFormattedTime);
        System.out.println("The unformatted Local Date Time is: " + theTimeNow);
    }


    public static Timestamp getTimestamp(String dateString, String dateFormat){
        SimpleDateFormat formatter = new SimpleDateFormat(dateFormat);
        Date date = new Date();
        try {
            date = formatter.parse(dateString);
        } catch (Exception e) {
        }
        return new Timestamp(date.getTime());
    }
}

