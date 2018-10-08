package com.capgemini.calendertest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.capgemini.calender.SalaryDay;

class CalenderTest {

	@Test
	void testSalary() {
		SalaryDay salary=new SalaryDay();
		assertEquals(30,salary.calculatePayDay(11,2018));
		
	}

}
