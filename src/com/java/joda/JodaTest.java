package com.java.joda;

import java.util.Calendar;

import org.joda.time.DateMidnight;
import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import org.joda.time.LocalDateTime;
import org.joda.time.LocalTime;

public class JodaTest {
	public static void main(String[] args) {
		LocalDateTime jodaTime=new LocalDateTime(1991,11,20,5,30);
		System.out.println("DOB: "+jodaTime.toString("E dd-MM-yyyy hh:mm"));
		LocalDateTime now=LocalDateTime.now();
		System.out.println("Now: "+now.toString("E dd-MM-yyyy hh:mm"));
		
		LocalDateTime then=now.plusHours(2);
		System.out.println("Then: "+then.toString("E dd-MM-yyyy hh:mm"));
		
		Calendar cal=Calendar.getInstance();
		cal.setTime(then.toDate());
		cal.add(Calendar.YEAR, 1);
		System.out.println("Then using Calendar: "+cal.get(Calendar.YEAR));
		
		DateTime dateTime=new DateTime("2015-07-10");
		System.out.println("Using String in DateTime: "+dateTime);
		
		Calendar newCalendar=Calendar.getInstance();
		DateTime dateTime1=new DateTime(newCalendar);
		System.out.println("Using calendar in DateTime"+dateTime1);
		
		DateMidnight midNight=new DateMidnight();
		System.out.println(midNight);
		
		LocalDate localDate=new LocalDate("2015-07-10");
		System.out.println(localDate);
		
		LocalDate localDate1=LocalDate.now();
		System.out.println("LocalDate.now(): "+localDate1);
		System.out.println("Modifying LocalDate: "+localDate1.monthOfYear().setCopy(11));
		
		
		LocalTime localTime=new LocalTime();
		System.out.println(localTime);
		
		LocalDate today=LocalDate.now();
		System.out.println("Calculation: "+today.minusMonths(2).dayOfMonth().getMinimumValue());
		LocalDate someOtherDay=today.monthOfYear().setCopy(11).dayOfMonth().withMinimumValue().dayOfWeek().setCopy("Monday");
		System.out.println(someOtherDay);
		
	}
}