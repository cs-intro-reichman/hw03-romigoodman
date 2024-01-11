/** 
 * Prints the calendar of a given year
 */
public class Calendar {	
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
		int chosenYear = Integer.parseInt(args[0]);
		int sundayCount=0;
		while (year<chosenYear-1){
			advance();
	 		}
	 		while (year==chosenYear){
	 			System.out.print(dayOfMonth + "/" + month + "/" + year);
	 			if (dayOfWeek==7){
	 				System.out.print("sunday");
	 			}
	 			advance();
	 			System.out.println();
	 		}
		}
	
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