// This program is copyright VUW.
// You are granted permission to use it to construct your answer to a SWEN131 assignment.
// You may not distribute it in any other way without permission.

/* Code for SWEN131 Individual Project - if
 * Name:
 * Usercode:
 * ID:
 */

import ecs100.*;
import java.awt.Color;

/**
 * Reads a date from the user as three integers, and then checks that the date is valid
 */

public class DateValidator { /** ---------- The code below is already written for you ---------- **/
    /** Constructor: set up user interface */
	public DateValidator(){
        UI.initialise();
        UI.addButton("Clear", UI::clearText );
        UI.addButton("Validate Date Core ", this::validateDateCore);
        UI.addButton("Validate Date Completion ", this::validateDateCompletion );
        UI.addButton("Quit", UI::quit );
        UI.setDivider(1);       // Expand the text area
    }
    /**
     * Asks user for a date, then determines whether the date
     *    specified by the three integers is a valid date.
     * For the Core, you may assume that
     * - All months have 31 days, numbered 1 to 31
     * - The months run from 1 to 12
     * - Years start from 1
     */
	
    public void validateDateCore(){
        /*# YOUR CODE HERE */
    	int day=UI.askInt("Enter day");
    	int month=UI.askInt("Enter month");
    	int year=UI.askInt("Enter year");
    	if (day>0 && day<32 && month>0 & month<=12 && year>0) {
    		UI.printf("Valid day");
    	} // 
    	else {
    		UI.printf("Invalid day");
    	}
}

    /**
     * Asks user for a date, then determines whether the date
     *    specified by the three integers is a valid date.
     * For the Completion, you should also check that
     * - Months have the correct number of days
     * - On leap years February should have 29 days.
     *    A year is a leap year if:
     *       - The year can be evenly divided by 4 but not 100
     *       - The year can be evenly divided by 400
     */
    public void validateDateCompletion(){
        /*# YOUR CODE HERE */
    	int day=UI.askInt("Enter day");
    	int month=UI.askInt("Enter month");
    	int year=UI.askInt("Enter year");
    	boolean leapyear= year%4==0 && year%100!=0 || year%400==0;
    	int monthLength= 31; //what's going wrong here??
    	if (month==4 || month==6 || month==9 || month==11) {
    		monthLength=30;    	};
    	if (month==2&& !leapyear) {
    		monthLength=28;}
    	else if (month==2&& leapyear) {
    		monthLength=29;
    	}
    	if (day<1 || day>monthLength || month<1 || month>12 || year<1) {
    		UI.printf("Invalid date");
    	}
    	else {
    		UI.printf("Valid date");
    	} //need to check the method again cuz it's showing the wrong result
 }


    /**
     * For the challenge, your program should be extended to deal with the transition from the Julian to Gregorian calendar.
     * The program should look at the date, determine whether this should be a Julian or Gregorian date, and test it appropriately.
     * You will need to find the rules of the Julian calendar yourselves.
     *
     */
    public void validateDateChallenge(){
        /*# YOUR CODE HERE */

    }

    
    

    public static void main(String[] args) {
    	new DateValidator();
    }


}

