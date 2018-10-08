package com.capgemini.calender;
import java.util.Calendar;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.YearMonth;
import java.time.temporal.TemporalAdjusters;


public class SalaryDay {

	


	public int calculatePayDay(int month, int year) {
		if(month>0&&year>0&&month<=12) {
	        Calendar calendar = Calendar.getInstance();
			  String[] monthName = { "January", "February", "March", "April", "May", "June", "July",
				        "August", "September", "October", "November", "December" };
			    DayOfWeek lastDayOfMonth= LocalDate.of(year,month,1).with(TemporalAdjusters.lastDayOfMonth()).getDayOfWeek();
			    int lastDayOfMonthDay=lastDayOfMonth.getValue();
			    System.out.println(lastDayOfMonthDay);
			    YearMonth yearMonthObject = YearMonth.of(year,month);
			    int daysInMonth = yearMonthObject.lengthOfMonth(); //28        
		        if(lastDayOfMonthDay==7)
		        	daysInMonth-=2;
		        if(lastDayOfMonthDay==6)
		        	daysInMonth-=1;
		        return daysInMonth;
		        //System.out.println("Salary for current month" + monthName[LocalDate.now().getMonthValue()] + "come on"+monthMaxDays);
		}
		return -1;
		}
		    
		    
		    



		
	}

