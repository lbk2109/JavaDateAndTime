package JavaDateAndTime;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class CompareDates {
	public static void main(String[] args) throws Exception {
		System.out.println("2.Java – How to compare dates");
		TestDate1();
		TestDate2();
		TestDate3();
		TestDate4();
	}

	static void TestDate1() throws Exception {
		System.out.println("1. Date.compareTo()");
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date date1 = sdf.parse("2009-12-31");
		Date date2 = sdf.parse("2010-01-31");
		System.out.println("date1 : " + sdf.format(date1));
		System.out.println("date2 : " + sdf.format(date2));

		if (date1.compareTo(date2) > 0) {
			System.out.println("Date1 is after Date2");
		} else if (date1.compareTo(date2) < 0) {
			System.out.println("Date1 is before Date2");
		} else if (date1.compareTo(date2) == 0) {
			System.out.println("Date1 is equal to Date2");
		} else {
			System.out.println("How to get here?");
		}
		System.out.println("");
	}

	static void TestDate2() throws Exception {
		System.out.println("2. Date.before(), Date.after() and Date.equals()");
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date date1 = sdf.parse("2009-12-31");
		Date date2 = sdf.parse("2010-01-31");
		System.out.println("date1 : " + sdf.format(date1));
		System.out.println("date2 : " + sdf.format(date2));

		if (date1.after(date2)) {
			System.out.println("Date1 is after Date2");
		}
		if (date1.before(date2)) {
			System.out.println("Date1 is before Date2");
		}
		if (date1.equals(date2)) {
			System.out.println("Date1 is equal Date2");
		}
		System.out.println("");
	}

	static void TestDate3() throws Exception {
		System.out.println("3. Calender.before(), Calender.after() and Calender.equals()");
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date date1 = sdf.parse("2009-12-31");
		Date date2 = sdf.parse("2010-01-31");
		System.out.println("date1 : " + sdf.format(date1));
		System.out.println("date2 : " + sdf.format(date2));

		Calendar cal1 = Calendar.getInstance();
		Calendar cal2 = Calendar.getInstance();
		cal1.setTime(date1);
		cal2.setTime(date2);
		if (cal1.after(cal2)) {
			System.out.println("Date1 is after Date2");
		}
		if (cal1.before(cal2)) {
			System.out.println("Date1 is before Date2");
		}
		if (cal1.equals(cal2)) {
			System.out.println("Date1 is equal Date2");
		}
		System.out.println("");
	}

	static void TestDate4() {
		System.out.println("4. Java 8");
		System.out.println("you can use the new isBefore(), isAfter(), isEqual() and compareTo()");
		System.out.println("to compare LocalDate, LocalTime and LocalDateTime.");
		DateTimeFormatter sdf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		LocalDate date1 = LocalDate.of(2009, 12, 31);
		LocalDate date2 = LocalDate.of(2010, 01, 31);
		System.out.println("date1 : " + sdf.format(date1));
		System.out.println("date2 : " + sdf.format(date2));

		System.out.println("Is...");
		if (date1.isAfter(date2)) {
			System.out.println("Date1 is after Date2");
		}
		if (date1.isBefore(date2)) {
			System.out.println("Date1 is before Date2");
		}
		if (date1.isEqual(date2)) {
			System.out.println("Date1 is equal Date2");
		}

		System.out.println("CompareTo...");
		if (date1.compareTo(date2) > 0) {
			System.out.println("Date1 is after Date2");
		} else if (date1.compareTo(date2) < 0) {
			System.out.println("Date1 is before Date2");

		} else if (date1.compareTo(date2) == 0) {
			System.out.println("Date1 is equal to Date2");
		} else {
			System.out.println("How to get here?");
		}
		System.out.println("");
	}
}
