package com.techelevator;

public class RomanNumeral {
 /**********************************************************************************************************
 * This class will store a Roman Numeral equivalent of a given Decimal Value
 * 
 *  Decimal values to Roman Numeral 
 *        1 = I, 5 = V, 10 = X, 50 = L, 100 = C, 500 = D, 1000 = M
 ************************************************************************************************************/	
/************************************************************************************************************
 *  member data
 ************************************************************************************************************/ 
    private String romanNumeral;
	private int    decimalValue;
	
	public RomanNumeral(int decimalValue) {
	   	this.decimalValue = decimalValue;
	    romanNumeral = determineRomanNumeral();
	}
/************************************************************************************************************
 *  member functions
 ************************************************************************************************************/ 
    private String determineRomanNumeral(){
        
        // TODO - return Roman Numeral for decimal value given when instantiating the class

            return null;
    }

/************************************************************************************************************
 *  getter / setters
 ************************************************************************************************************/ 

     public String getRomanNumeral() {
			return romanNumeral;
		}
		public void setRomanNumeral(String romanNumeral) {
			this.romanNumeral = romanNumeral;
		}
		public int getDecimalValue() {
			return decimalValue;
		}
		
    }
/************************************************************************************************************
 *  End of Roman Numeral Csass
 ************************************************************************************************************/ 

