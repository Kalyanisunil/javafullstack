package basics;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Date_Time {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LocalDate dt= LocalDate.now();
		System.out.println( "Today is " + dt);
		LocalTime t= LocalTime.now();
		System.out.println( "Today is " + t);
		
		LocalDateTime ldt= LocalDateTime.now();
		System.out.println( "Today is " + ldt);
		DateTimeFormatter formatting= DateTimeFormatter.ofPattern("dd-mm-yyyy HH:mm:ss");
		String formattedDate=ldt.format(formatting);
		
		System.out.println( "Today is " + formattedDate);
		
	}

}
