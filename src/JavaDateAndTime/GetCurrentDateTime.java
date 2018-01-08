package JavaDateAndTime;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class GetCurrentDateTime {

	private static final DateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
	private static final DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");

	public static void main(String[] args) {
		System.out.println("3.Java – How to get current date time");
		System.out.println("1)For java.util.Date, just create a new Date()");
		Date date = new Date();
		System.out.println(sdf.format(date));
		System.out.println();

		System.out.println("2)For java.util.Calendar, uses Calendar.getInstance()");
		Calendar cal = Calendar.getInstance();
		System.out.println(sdf.format(cal.getTime()));
		System.out.println();

		System.out.println("3)For java.time.LocalDateTime, uses LocalDateTime.now()");
		LocalDateTime now = LocalDateTime.now();
		System.out.println(dtf.format(now));
		System.out.println();

		System.out.println("4)For java.time.LocalDate, uses LocalDate.now()");
		LocalDate localDate = LocalDate.now();
		System.out.println(DateTimeFormatter.ofPattern("yyy/MM/dd").format(localDate));
		System.out.println();
		
	}

}
