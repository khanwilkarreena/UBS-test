package com.ubs.opsit.interviews;

import static org.junit.Assert.*;

import org.junit.Test;

public class BerlinClockTest {
	
	BerlinClockImpl clock = new BerlinClockImpl();
	
	@Test
	public void testfirst(){
		String time  = "00:00:00";
		String berlinClock = clock.convertTime(time);
		String expectedOutput = "Y" + "\r\n"+
				"OOOO" + "\r\n"+
				"OOOO" + "\r\n"+
				"OOOOOOOOOOO" + "\r\n"+
				"OOOO";
		assertEquals(berlinClock, expectedOutput);
	}
	
	@Test
	public void testrandom(){
		String time  = "13:17:01";
		String berlinClock = clock.convertTime(time);
		String expectedOutput = 
				"O"+ "\r\n"+
				"RROO"+ "\r\n"+
				"RRRO"+ "\r\n"+
				"YYROOOOOOOO"+ "\r\n"+
				"YYOO";
		assertEquals(berlinClock, expectedOutput);
	}
	
	@Test
	public void testmidnight(){
		String time  = "23:59:59";
		String berlinClock = clock.convertTime(time);
		String expectedOutput = "O"+ "\r\n"+
				"RRRR"+ "\r\n"+
				"RRRO"+ "\r\n"+
				"YYRYYRYYRYY"+ "\r\n"+
				"YYYY";
		assertEquals(berlinClock, expectedOutput);
	}
	
	@Test (expected = IllegalArgumentException.class)
	public void testmidnightwithException(){
		String time  = "24:59:59";
		String berlinClock = clock.convertTime(time);
		throw new IllegalArgumentException(Constants.HOUR_ERROR);
	}
	
	@Test (expected = IllegalArgumentException.class)
	public void testMinuteswithException(){
		String time  = "23:60:59";
		String berlinClock = clock.convertTime(time);
		throw new IllegalArgumentException(Constants.MIN_ERROR);
	}
	
	@Test (expected = IllegalArgumentException.class)
	public void testSecondswithException(){
		String time  = "23:59:60";
		String berlinClock = clock.convertTime(time);
		throw new IllegalArgumentException(Constants.SEC_ERROR);
	}

}
