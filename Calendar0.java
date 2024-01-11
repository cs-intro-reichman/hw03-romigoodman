/*
 * Checks if a given year is a leap year or a common year,
 * and computes the number of days in a given month and a given year. 
 */
public class Calendar0 {	
	
	// Gets a year (command-line argument), and tests the functions isLeapYear and nDaysInMonth.
	public static void main(String args[]) {
		int year = Integer.parseInt(args[0]);
		
		isLeapYearTest(year);

		for (int i =1; i<=12; i++)
		{
		System.out.println("Month " + i + " has " + nDaysInMonth(i, year) + " days"); 
		}

	}
		 
	
	private static void isLeapYearTest(int year) {
		String commonOrLeap = "common";
		if (isLeapYear(year)) {
			commonOrLeap = "leap";
		}
		System.out.println(year + " is a " + commonOrLeap + " year");  
	}

	
	private static void nDaysInMonthTest(int month, int year) {
    int numberToTest = nDaysInMonth(month,year);
	System.out.println(month + " has " + numberToTest + " days");	}

	
	public static boolean isLeapYear(int year) {    
		boolean isLeapYear;
      // Checks if the year is divisible by 400       
		isLeapYear = ((year % 400) == 0);
      // Then checks if the year is divisible by 4 but not by 100      
		isLeapYear = isLeapYear || (((year % 4) == 0) && ((year % 100) != 0));
		return isLeapYear;
	}
	 
	
	public static int nDaysInMonth(int month, int year) 
	{	
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
