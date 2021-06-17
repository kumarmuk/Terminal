package com.nyota.terminal.config;

import java.time.LocalDateTime;
import java.time.ZoneOffset;

/**
 * This class will generate data for reporting purposes
 * 
 * @author mukul 24 hours report sent every 10 mins number of terminals
 * 
 * 
 */
public class TerminalReportGenerator {

	public void generateLoop(int numOfHours, int numOfTerminals) {
		long currentTime = LocalDateTime.now().toEpochSecond(ZoneOffset.UTC);
		System.out.println(currentTime);
		// substract 24 hours from currenttime
		long startTime = currentTime - (24 * 3600);
		//System.out.println(timeToReport);
		//LocalDateTime reportingDate = LocalDateTime.ofEpochSecond(timeToReport, 0, ZoneOffset.UTC);
		//System.out.println(reportingDate);
		// run the loop for 24 hrs
		for (int hour = 0; hour < 24; hour++) {
			long timeToReport = startTime + (hour * 3600);
			
			System.out.println(LocalDateTime.ofEpochSecond(timeToReport, 0, ZoneOffset.UTC));
		}
	}

	public String createTimeStamp(int hourCounter) {

		// dd-mm-yyyy:hh:mm:ss

		// select randon minutes between 01 - 10
		// select any seconds from 01 - 60

		return null;
	}

	public static void main(String args[]) {
		long currentTime = LocalDateTime.now().toEpochSecond(ZoneOffset.UTC);
		System.out.println(currentTime);
		// substract 24 hours from currenttime
		long startTime = currentTime - (24 * 3600);
		//System.out.println(timeToReport);
		//LocalDateTime reportingDate = LocalDateTime.ofEpochSecond(timeToReport, 0, ZoneOffset.UTC);
		//System.out.println(reportingDate);
		// run the loop for 24 hrs
		for (int hour = 0; hour < 24; hour++) {
			long timeToReport = startTime + (hour * 3600);
			
			System.out.println(LocalDateTime.ofEpochSecond(timeToReport, 0, ZoneOffset.UTC));
		}
	}

}
