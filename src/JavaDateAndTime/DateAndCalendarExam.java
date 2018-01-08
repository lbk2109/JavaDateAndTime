package JavaDateAndTime;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class DateAndCalendarExam {
	public static void main(String[] args) throws ParseException {
		System.out.println("1.Java Date and Calendar examples");

		System.out.println("1. Java Date Examples");
		System.out.println("1.1 – Convert Date to String.");
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy/dd/MM");
		String date1 = sdf1.format(new Date());
		System.out.println(date1); // 2013/15/10

		System.out.println("1.2 – Convert String to Date");
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd-MM-yyyy hh:mm:ss");
		String dateInString = "31-08-1982 10:20:56";
		Date date2 = sdf2.parse(dateInString);
		System.out.println(date2); // Tue Aug 31 10:20:56 SGT 1982

		System.out.println("1.3 – Get current date time");
		SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Date date3 = new Date();
		System.out.println(sdf3.format(date3)); // 2013/10/15 16:16:39

		System.out.println("1.4 – Convert Calendar to Date");
		Calendar calendar4 = Calendar.getInstance();
		Date date4 = calendar4.getTime();
		SimpleDateFormat sdf4 = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		String sdate4 = sdf4.format(date4);
		System.out.println(sdate4); // 2013/15/10

		System.out.println("2. Java Calendar Examples");
		System.out.println("2.1 – Get current date time");
		SimpleDateFormat sdf21 = new SimpleDateFormat("yyyy MMM dd HH:mm:ss");
		Calendar calendar21 = new GregorianCalendar(2013, 0, 31);
		System.out.println(sdf21.format(calendar21.getTime()));

		System.out.println("2.2 – Simple Calendar example");

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy MMM dd HH:mm:ss");
		Calendar calendar = new GregorianCalendar(2013, 1, 28, 13, 24, 56);

		int year = calendar.get(Calendar.YEAR);
		int month = calendar.get(Calendar.MONTH); // Jan = 0, dec = 11
		int dayOfMonth = calendar.get(Calendar.DAY_OF_MONTH);
		int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
		int weekOfYear = calendar.get(Calendar.WEEK_OF_YEAR);
		int weekOfMonth = calendar.get(Calendar.WEEK_OF_MONTH);

		int hour = calendar.get(Calendar.HOUR); // 12 hour clock
		int hourOfDay = calendar.get(Calendar.HOUR_OF_DAY); // 24 hour clock
		int minute = calendar.get(Calendar.MINUTE);
		int second = calendar.get(Calendar.SECOND);
		int millisecond = calendar.get(Calendar.MILLISECOND);

		System.out.println(sdf.format(calendar.getTime()));

		System.out.println("year \t\t: " + year);
		System.out.println("month \t\t: " + month);
		System.out.println("dayOfMonth \t: " + dayOfMonth);
		System.out.println("dayOfWeek \t: " + dayOfWeek);
		System.out.println("weekOfYear \t: " + weekOfYear);
		System.out.println("weekOfMonth \t: " + weekOfMonth);

		System.out.println("hour \t\t: " + hour);
		System.out.println("hourOfDay \t: " + hourOfDay);
		System.out.println("minute \t\t: " + minute);
		System.out.println("second \t\t: " + second);
		System.out.println("millisecond \t: " + millisecond);

		System.out.println("2.3 – Set a date manually.");
		SimpleDateFormat sdf23 = new SimpleDateFormat("yyyy MMM dd HH:mm:ss");
		Calendar calendar23 = new GregorianCalendar(2013, 1, 28, 13, 24, 56);
		System.out.println("#1. " + sdf23.format(calendar23.getTime()));
		// update a date
		calendar23.set(Calendar.YEAR, 2014);
		calendar23.set(Calendar.MONTH, 11);
		calendar23.set(Calendar.MINUTE, 33);
		System.out.println("#2. " + sdf23.format(calendar23.getTime()));

		System.out.println("2.4– Add or subtract from a date.");
		SimpleDateFormat sdf24 = new SimpleDateFormat("yyyy MMM dd");
		Calendar calendar24 = new GregorianCalendar(2013, 10, 28);
		System.out.println("Date : " + sdf24.format(calendar24.getTime()));
		// add one month
		calendar24.add(Calendar.MONTH, 1);
		System.out.println("Date : " + sdf24.format(calendar24.getTime()));
		// subtract 10 days
		calendar24.add(Calendar.DAY_OF_MONTH, -10);
		System.out.println("Date : " + sdf24.format(calendar24.getTime()));

		System.out.println("2.5– Convert Date to Calendar.");
		SimpleDateFormat sdf25 = new SimpleDateFormat("dd-MM-yyyy hh:mm:ss");
		String dateInString25 = "22-01-2015 10:20:56";
		Date date25 = sdf25.parse(dateInString25);
		Calendar calendar25 = Calendar.getInstance();
		calendar25.setTime(date25);
		System.out.println(sdf25.format(calendar25.getTime()));

	}
}
