package com.techelevator;

public class HomeworkAssignment {

	private int totalMarks;
	private int possibleMarks;
	private String submitterName;
	private String letterGrade;
	
	
	
	
	/**
	 * @return the totalMarks
	 */
	public int getTotalMarks() {
		return totalMarks;
	}


	/**
	 * @param totalMarks the totalMarks to set
	 */
	public void setTotalMarks(int totalMarks) {
		this.totalMarks = totalMarks;
	}


	/**
	 * @return the submitterName
	 */
	public String getSubmitterName() {
		return submitterName;
	}


	/**
	 * @param submitterName the submitterName to set
	 */
	public void setSubmitterName(String submitterName) {
		this.submitterName = submitterName;
	}


	/**
	 * @return the possibleMarks
	 */
	public int getPossibleMarks() {
		return possibleMarks;
	}


	public String getLetterGrade() {
		
		
		String letterGrade = "";
		
		
			if(totalMarks * 100/possibleMarks >= 90){
				letterGrade = "A";
			}
			else if(totalMarks * 100/possibleMarks >= 80){
				letterGrade = "B";
			}
			else if(totalMarks * 100/possibleMarks >= 70){
				letterGrade = "C";
			}
			else if(totalMarks * 100/possibleMarks >= 60){
				letterGrade = "D";
			}
			else {letterGrade = "F";
			}
			
			return letterGrade;
			
		}
		
		
		public HomeworkAssignment(int possibleMarks){
			this.possibleMarks = possibleMarks;
		
		}
		
	 
			
	
}
