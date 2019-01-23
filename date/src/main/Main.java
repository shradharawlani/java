package main;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class Main {
	public static void main(String[] args) {
		//Date d1=new Date();
		//Date d1=new Date(2015,11,12);
		//LocalDateTime current=LocalDateTime.now();
		//System.out.println(d1.getDay());
		/*String date="July 25, 2017";
		DateTimeFormatter form=DateTimeFormatter.ofPattern("MMMM d, yyyy", Locale.ENGLISH);
		LocalDate d1=LocalDate.parse(date, form);
		System.out.println(d1);*/
		/*LocalDateTime current=LocalDateTime.now();
		DateTimeFormatter form=DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);
		String d1=current.format(form);
		System.out.println(d1);*/
		/*Calendar c1=Calendar.getInstance();
		Calendar c2=Calendar.getInstance();
		Calendar cTotal=(Calendar)c1.clone();
		cTotal.add(Calendar.YEAR, c2.get(Calendar.YEAR));
        cTotal.add(Calendar.MONTH, c2.get(Calendar.MONTH) ); // Zero-based months
        cTotal.add(Calendar.DATE, c2.get(Calendar.DATE));
        cTotal.add(Calendar.HOUR_OF_DAY, c2.get(Calendar.HOUR_OF_DAY));
        cTotal.add(Calendar.MINUTE, c2.get(Calendar.MINUTE));
        cTotal.add(Calendar.SECOND, c2.get(Calendar.SECOND));
        cTotal.add(Calendar.MILLISECOND, c2.get(Calendar.MILLISECOND));

        System.out.format("%s + %s = %s", c1.getTime(), c2.getTime(), cTotal.getTime());
	}*/

		String str="1996, 04, 21";
		
	/*	LocalDate l1=LocalDate.of(1996, 04, 21);
		LocalDate l2=LocalDate.of(1990, 04, 21);
		System.out.println(l1.equals(l2));
		*/
		LocalTime t1=LocalTime.of(4, 40,59);
		LocalTime t2=LocalTime.of(5, 50,40);
		long bet=ChronoUnit.MINUTES.between(t1, t2);
		
		System.out.println(t1);
		System.out.println(t2);
		System.out.println(bet);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
}
}