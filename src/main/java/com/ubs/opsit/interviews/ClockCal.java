package com.ubs.opsit.interviews;

public class ClockCal {

	public static String calculateSec(int seconds) {

		if (seconds % 2 == 0) {
			return Constants.YELLOW_LAMP + "\r\n";
		} else {
			return Constants.NO_LAMP + "\r\n";
		}
	}

	public static String calculateMinutes(int minutes) {
		String line = "";
		String line1 = "";

		for (int i = 0; i < (minutes / 5); i++) {
			line = line + Constants.YELLOW_LAMP;
		}
		line = String.format("%1$-" + 11 + "s", line).replace(' ', 'O');
		line = line.replaceAll("YYY", "YYR") + "\r\n";

		for (int i = 0; i < (minutes % 5); i++) {
			line1 = line1 + Constants.YELLOW_LAMP;
		}
		line1 = String.format("%1$-" + 4 + "s", line1).replace(' ', 'O');
		return line + line1;
	}

	public static String calculateHours(int hours) {
		String line = "";
		String line1 = "";
		for (int i = 0; i < (hours / 5); i++) {
			line = line + Constants.RED_LAMP;
		}
		line = String.format("%1$-" + 4 + "s", line).replace(' ', 'O') + "\r\n";

		for (int i = 0; i < (hours % 5); i++) {
			line1 = line1 + Constants.RED_LAMP;
		}
		line1 = String.format("%1$-" + 4 + "s", line1).replace(' ', 'O') + "\r\n";
		return line + line1;
	}

}
