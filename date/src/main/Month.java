package main;

import java.time.LocalDate;
import java.time.MonthDay;
import java.time.OffsetDateTime;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;

public class Month {
	public static void main(String[] args) {
		MonthDay mon=MonthDay.now();
		//LocalDate d1=mon.atYear(1997);
		//System.out.println(mon.get(ChronoField.MONTH_OF_YEAR));
		OffsetDateTime of=OffsetDateTime.now();
		System.out.println(of.getDayOfWeek());
	}

}
