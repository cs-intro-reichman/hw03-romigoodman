// /** 
//  * Prints the calendar of a given year
//  */
public class Calendar {	
    // Starting the calendar on 1/1/1900
	static int dayOfMonth = 1;   
	static int month = 1;
	static int year = 1900;
	static int dayOfWeek = 2;     
	static int nDaysInMonth = 31; 

	
		public static void main(String args[]) {
		int chosenYear = Integer.parseInt(args[0]);
		while (year<=chosenYear){
			if(year == chosenYear){
				if (dayOfWeek==1) {
				System.out.println(dayOfMonth + "/" + month + "/" + year + " Sunday");
			} else { System.out.println(dayOfMonth + "/" + month + "/" + year);

			}
			}
			advance();
	 		}
	 	}

	  private static void advance() {
		if (dayOfWeek<7)
		{
		dayOfWeek++;
		}
		else
		{
		dayOfWeek =1;
		}
	  
	 if (dayOfMonth < nDaysInMonth(month, year)) {
	 	dayOfMonth++;
	 } else {
	 	month++;
	 	dayOfMonth = 1;
	 }
	 if (month>12){
	 	month=1;
	 	year++;
	 }
}

	private static boolean isLeapYear(int year) {
	boolean isLeapYear;
	isLeapYear = ((year % 400) == 0);
	isLeapYear = isLeapYear || (((year % 4) == 0) && ((year % 100) != 0));
	return isLeapYear;
	}
    
    private static int nDaysInMonth(int month, int year) {
	int daysInMonth=0;
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
	else if (month == 1 ||  month == 3 || month == 5 || month == 7 || month == 8| month == 10 || month == 12) { 
	daysInMonth = 31; }

	return daysInMonth;
}
}
