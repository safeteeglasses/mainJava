package com.techelevator;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class ginzUtilities {
	/**
	 * Returns a String presentation of the double value passed (1st argument) with the total number of digits (2nd argurment)  
	 *         and the number of decimal places requested (3rd argument)
	 * The value will be rounded to the number of decimal places passed when creating the return value
	 *
	 * @param   value   the double value to be formatted into a String
	 * @param   minLen  the minimum length of the return string; if a length that exceeds this value is required the result with the length required by the result
	 * @param   decPlaces the number of decimal places requested in the result
	 * @return  the string representation of the double value with the number of digits and decimal places requested; 
	 *           value in result will be rounded to the number of decimal places requested.
	 * @throws IllegalArgumentException if (1) minLen parameter is less than 1 or (2) decPlaces parameter is less than 0
	 * <pre>{@code
     * Examples:
     * 
     *      ginzDecFormat(12.3456,5,3) returns "12.346"
     *      ginzDecFormat(12.3456,5,2) returns "12.35"
     *      ginzDecFormat(12.3456,5,1) returns " 12.3"
     *      ginzDecFormat(12.3456,1,1) returns "12.3"
     *      ginzDecFormat(12.3456,5,0) returns "   12"
     *      ginzDecFormat(12.3456,1,0) returns "12"
     *      ginzDecFormat(12.3456,5,5) returns "12.34560"
     *      ginzDecFormat(12.9876,5,0) returns "   13"
     *      ginzDecFormat(12.3456,5,6) returns "12.345600"
     * }</pre>
     **/
	
	
	public static String ginzDecFormat(double value, int minLen, int decPlaces) {
	    if ((decPlaces < 0)||(minLen<1) ) throw new IllegalArgumentException();
	    
	    String format = "%"+minLen+"."+decPlaces+"f";
	   
	    return String.format(format, value);
	}
	
	public static double ginzRound(double value, int decPlaces) {
	    if (decPlaces < 0) throw new IllegalArgumentException();

	    BigDecimal decValue = new BigDecimal(value);
	    decValue = decValue.setScale(decPlaces, RoundingMode.HALF_UP);
	    return decValue.doubleValue();
	}

	public static double ginzRound(double value, int decPlaces, String roundMode) {
		
		/* Rounding Modes:	

		CEILING - round towards next higher value.
		DOWN    -  round towards zero.
		FLOOR -  round towards next lower integer value
		HALF_DOWN - round towards "nearest neighbor" unless both neighbors are equidistant, in which case round down.
		HALF_UP   - round towards "nearest neighbor" unless both neighbors are equidistant, in which case round up.
		UP - round toward next higher value.
		
	*/	
	    if (decPlaces < 0) throw new IllegalArgumentException();

	    BigDecimal decValue = new BigDecimal(value);
	    decValue = decValue.setScale(decPlaces, RoundingMode.valueOf(roundMode));
	    return decValue.doubleValue();
	}
	
public static void ginzUtilitiesExamples() {
		
		System.out.println("ginzDecFormat(12.3456,5,3) returns \"" +  ginzUtilities.ginzDecFormat(12.3456,5,3) + '\"');
		System.out.println("ginzDecFormat(12.3456,5,2) returns \"" +  ginzUtilities.ginzDecFormat(12.3456,5,2) + '\"');
		System.out.println("ginzDecFormat(12.3456,5,1) returns \"" +  ginzUtilities.ginzDecFormat(12.3456,5,1) + '\"');
		System.out.println("ginzDecFormat(12.3456,1,1) returns \"" +  ginzUtilities.ginzDecFormat(12.3456,1,1) + '\"');
		System.out.println("ginzDecFormat(12.3456,5,0) returns \"" +  ginzUtilities.ginzDecFormat(12.3456,5,0) + '\"');
		System.out.println("ginzDecFormat(12.3456,1,0) returns \"" +  ginzUtilities.ginzDecFormat(12.3456,1,0) + '\"');
		System.out.println("ginzDecFormat(12.3456,5,5) returns \"" +  ginzUtilities.ginzDecFormat(12.3456,5,5) + '\"');
		System.out.println("ginzDecFormat(12.9876,5,0) returns \"" +  ginzUtilities.ginzDecFormat(12.9876,5,0) + '\"');
		System.out.println("ginzDecFormat(12.3456,5,6) returns \"" +  ginzUtilities.ginzDecFormat(12.3456,5,6) + '\"');
		
		System.out.println("------------------------------------------------");
		System.out.println("Rounding 3.12345678 to 4 decimal places using   CEILING: " + ginzUtilities.ginzRound(3.12345678, 4, "CEILING"));
		System.out.println("Rounding 3.12345678 to 4 decimal places using     FLOOR: " + ginzUtilities.ginzRound(3.12345678, 4, "FLOOR"));
		System.out.println("Rounding 3.12345678 to 4 decimal places using        UP: " + ginzUtilities.ginzRound(3.12345678, 4, "UP"));
		System.out.println("Rounding 3.12345678 to 4 decimal places using      DOWN: " + ginzUtilities.ginzRound(3.12345678, 4, "DOWN"));
		System.out.println("Rounding 3.12345678 to 4 decimal places using   HALF_UP: " + ginzUtilities.ginzRound(3.12345678, 4, "HALF_UP"));
		System.out.println("Rounding 3.12345678 to 4 decimal places using HALF_DOWN: " + ginzUtilities.ginzRound(3.12345678, 4, "HALF_DOWN"));

	}
	
}
