
import java.util.GregorianCalendar;
public class Calendar {
    public static void main(String[] args) {
        GregorianCalendar CalendarOb = new GregorianCalendar();
        System.out.println("Current year, month, date, and day of week");
        System.out.println("Year is "+ CalendarOb.get(GregorianCalendar.YEAR));
        System.out.println("Month is "+ CalendarOb.get(GregorianCalendar.MONTH));
        System.out.println("Date is "+ CalendarOb.get(GregorianCalendar.DATE));
        System.out.println("Day of week is "+ CalendarOb.get(GregorianCalendar.DAY_OF_WEEK));
        System.out.println("---------------------------------");
        CalendarOb.add(CalendarOb.DATE, 1);
        System.out.println("After specified the elapsed time of one day after current day");
        System.out.println("Current year, month, date, and day of week");
        System.out.println("Year is "+ CalendarOb.get(GregorianCalendar.YEAR));
        System.out.println("Month is "+ CalendarOb.get(GregorianCalendar.MONTH));
        System.out.println("Date is "+ CalendarOb.get(GregorianCalendar.DATE));
        System.out.println("Day of week is "+ CalendarOb.get(GregorianCalendar.DAY_OF_WEEK));
        System.out.print(CalendarOb.getTime());
    }
}
