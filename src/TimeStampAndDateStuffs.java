import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeStampAndDateStuffs {
    public static void main(String[] args) {
        System.out.println("Hello World");
//        Timestamp mytime = Timestamp.valueOf("2019-05-09 11:31:43.682");
        Date date = new Date();
        Timestamp mytime = new Timestamp(date.getTime());
        String timeStampThen = new SimpleDateFormat("yyyyMMddHHmmss").format(mytime);
        String timeStampNow = new SimpleDateFormat("yyyyMMddHHmmss").format(new Date());
        System.out.println(timeStampThen);
        System.out.println(timeStampNow);
    }
}
