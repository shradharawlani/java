package main;
import java.util.Calendar;
import java.util.Date;
public class Calenders {
	public static void main(String[] args) {
		Calendar cal=Calendar.getInstance();
		System.out.println(cal.getTime());
	    cal.add(Calendar.DATE,15);
		System.out.println(cal.get(Calendar.YEAR));
	}

}
