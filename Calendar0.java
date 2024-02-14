/*
 * Checks if a given year is a leap year or a common year,
 * and computes the number of days in a given month and a given year. 
 */
public class Calendar0 {	
	
	// Gets a year (command-line argument), and tests the functions isLeapYear and nDaysInMonth.
	public static void main(String args[]) {
		int year = Integer.parseInt(args[0]);
		isLeapYearTest(year);
		nDaysInMonthTest(year);
	}
		 
	// Tests the isLeapYear function.
	private static void isLeapYearTest(int year) {
		String commonOrLeap = "common";
		if (isLeapYear(year)) {
			commonOrLeap = "leap";
		}
		System.out.println(year + " is a " + commonOrLeap + " year");  
	}

	// Tests the nDaysInMonth function.
	private static void nDaysInMonthTest(int year) {
		for (int month = 1; month <= 12; month++) {
            System.out.println("Month " + month + " has " + nDaysInMonth(month, year) + " days" );
        }
		// Replace this comment with your code
	}

	// Returns true if the given year is a leap year, false otherwise.
	public static boolean isLeapYear(int year) {
	    return ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0));
	}
	 
	// Returns the number of days in the given month and year.
	// April, June, September, and November have 30 days each.
	// February has 28 days in a common year, and 29 days in a leap year.
	// All the other months have 31 days.
	public static int nDaysInMonth(int month, int year) {
		switch (month) {
		    case 1: month = 1;
			        return 31;
			case 2: month = 2;
				    return isLeapYear(year) ? 29 : 28;
			case 3: month = 3;
				    return 31;
			case 4: month = 4;
				    return 30;
			case 5: month = 5;
				    return 31;
			case 6: month = 6;
				    return 30;
			case 7: month = 7;
				    return 31;
			case 8: month = 8;
				    return 31;
			case 9: month = 9;
				    return 30;
			case 10: month = 10;
				    return 31;
			case 11: month = 11;
				    return 30;
			case 12: month = 12;
				    return 31;
		}  
		return 0;
	}
}
