package com.ubs.opsit.interviews;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BerlinClockMain {

	public static void main(String[] args) {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String clock = null;
		String aTime = null;
		BerlinClockImpl berlinClock = new BerlinClockImpl();
		
		System.out.println("Welcome to Berlin Clock !!");
		
		try {
				System.out.println("Enter the Time in HH:MM:SS format");
				aTime = br.readLine();
					
				clock = berlinClock.convertTime(aTime);
					
				System.out.println("------Berlin Clock-------");
				System.out.println(clock);
					
			br.close();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}

}
