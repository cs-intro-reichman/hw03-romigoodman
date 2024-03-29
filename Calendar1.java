/** 
 * Prints the calendars of all the years in the 20th century.
 */
public class Calendar1 {	
    // Starting the calendar on 1/1/1900
	static int dayOfMonth = 1;   
	static int month = 1;
	static int year = 1900;
	static int dayOfWeek = 2;     // 1.1.1900 was a Monday
	static int nDaysInMonth = 31; // Number of days in January
	
	/** 
	 * Prints the calendars of all the years in the 20th century. Also prints the  
	 * number of Sundays that occured on the first day of the month during this period.
	 */
	public static void main(String args[]) {
		// Advances the date and the day-of-the-week from 1/1/1900 till 31/12/1999, inclusive.
	    // Prints each date dd/mm/yyyy in a separate line. If the day is a Sunday, prints "Sunday".
	    // The following variable, used for debugging purposes, counts how many days were advanced so far.
	    int debugDaysCounter = 0; 
	    //// Write the necessary initialization code, and replace the condition
	    //// of the while loop with the necessary condition 
	 	while (year <= 1999) {
	 		
	 		if (dayOfWeek==7){
	 			System.out.println(dayOfMonth + "/" + month + "/" + year + " sunday");
	 		}		
	 		else {
	 			System.out.println(dayOfMonth + "/" + month + "/" + year);
	 		}
	 		advance();
	 		debugDaysCounter++;
	 		System.out.println();
	 		//// If you want to stop the loop after n days, replace the condition of the
	 		//// if statement with the condition (debugDaysCounter == n)
	 		if (debugDaysCounter==36500) { 
	 			break;
	 		}

        }
		System.out.println("During the 20th century, " + countSundays() + " Sundays fell on the first day of the month.");	 }
	
	 // Advances the date (day, month, year) and the day-of-the-week.
	 // If the month changes, sets the number of days in this month.
	 // Side effects: changes the static variables dayOfMonth, month, year, dayOfWeek, nDaysInMonth.
	 private static void advance() {
	int daysInMonth = nDaysInMonth(month, year);
	dayOfMonth++;
	if (dayOfMonth>daysInMonth){
		dayOfMonth=1;
		month++;
	  
	 if (month>12){
	 	month=1;
	 	year++;
	 }
	}
	dayOfWeek=(dayOfWeek%7)+1;
}
		 
	   private static int countSundays() {
        int sundayCount = 0;

        // Reset the date counters
        dayOfMonth = 1;
        month = 1;
        year = 1900;
        dayOfWeek = 2;

        // Iterate through each year in the 20th century
        while (year <= 1999) {
            // Check if the current day is a Sunday and the first day of the month
            if (dayOfWeek == 7 && dayOfMonth == 1) {
                sundayCount++;
            }

            // Move to the next day
            advance();
        }

        return sundayCount;
    }

	private static boolean isLeapYear(int year) {
	  boolean isLeapYear;
		isLeapYear = ((year % 400) == 0);
		isLeapYear = isLeapYear || (((year % 4) == 0) && ((year % 100) != 0));
		return isLeapYear;
	}
	 
	
	private static int nDaysInMonth(int month, int year) {
		int daysInMonth;
	if (month == 4 || month == 6 || month == 9 || month == 11) 
	{
    daysInMonth = 30;
    }
     else if (month == 2) 
     {
     	if (isLeapYear(year)==true)
     	{
    	daysInMonth = 29;
     	}
     	else
     	{
		daysInMonth= 28;
     	}
     }	
	else
	{ 
	daysInMonth = 31;
	}
	return daysInMonth;
	}
}