import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class LocalDateAndTime {


    public static void main(String[] args) throws Exception {

//        LocalDate a = LocalDate.of(1992, 8, 17);
//        LocalDate b = LocalDate.of(1996, 1, 26);
//        LocalDate c = b.plusMonths(35);
//        System.out.println(c);

        LocalDateTime firstScheduledDate = LocalDateTime.of(1992, 1, 31, 11, 59);
        LocalDateTime lastScheduledDate = LocalDateTime.of(1996, 1, 28, 11, 59);
        System.out.println(ChronoUnit.MONTHS.between(firstScheduledDate, lastScheduledDate));

        System.out.println(getNextPaymentDate(firstScheduledDate, lastScheduledDate, IntervalType.MONTH));

//        System.out.println("================== LocalDateTime ===================");
//        LocalDateTime dt1 = LocalDateTime.of(1992, Month.AUGUST, 31, 8, 0);
//        System.out.println(dt1);
//        LocalDateTime dt2 = dt1.plusMonths(3);
//
//        for (int i = 1; i <= 12; i++){
//            System.out.println(dt1.plusMonths(i));
//        }
//
//        System.out.println("================= Date Comparison ==================");
//
//        LocalDateTime d1 = LocalDateTime.of(1992, 8, 17, 0, 0, 0);
//        LocalDateTime d2 = LocalDateTime.of(1996, 1, 26, 0, 0, 0);
//        System.out.printf("Months between %s and %s = %s months%n", d1, d2, ChronoUnit.MONTHS.between(d1, d2));
//        System.out.printf("Weeks between %s and %s = %s weeks%n", d1, d2, ChronoUnit.WEEKS.between(d1, d2));
//        System.out.printf("Days between %s and %s = %s days%n", d1, d2, ChronoUnit.DAYS.between(d1, d2));
//        System.out.printf("Hours between %s and %s = %s hours%n", d1, d2, ChronoUnit.HOURS.between(d1, d2));
//        System.out.printf("Minutes between %s and %s = %s minutes%n", d1, d2, ChronoUnit.MINUTES.between(d1, d2));
//        System.out.printf("Seconds between %s and %s = %s seconds%n", d1, d2, ChronoUnit.SECONDS.between(d1, d2));




    }


    public static LocalDateTime getNextPaymentDate(LocalDateTime firstSD, LocalDateTime lastSD, IntervalType intervalType){
        if(intervalType == IntervalType.MONTH) {
            long monthInterval = ChronoUnit.MONTHS.between(LocalDate.of(firstSD.getYear(), firstSD.getMonth(), 1), LocalDate.of(lastSD.getYear(), lastSD.getMonth(), 1));
            return firstSD.plusMonths(monthInterval+1);
        }
        return LocalDateTime.now();
    }

}

