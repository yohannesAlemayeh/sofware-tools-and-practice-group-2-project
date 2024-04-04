package tools;

import java.util.Scanner;
 

public class GradeCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in);
		System.out.println("enter  mark");
		double mark=sc.nextDouble();
		
		// getGrade(mark);
		
		 System.out.println(getGrade(mark));
		 }
	 public static String getGrade(double mark) {
	        if(mark >= 90) {
	            return "A+";
	        }else if(mark < 90 && mark >= 85) {
	            return "A";
	        }else if(mark < 85 && mark >= 80) {
	            return "A-";
	        }else if(mark < 80 && mark >= 75) {
	            return "B+";
	        }else if(mark < 75 && mark >= 70) {
	            return "B";
	        }else if(mark < 70 && mark >= 65) {
	            return "B-";
	        }else if(mark < 65 && mark >= 60) {
	            return "C+";
	        }else if(mark < 60 && mark >= 50) {
	            return "C";
	        }else if(mark < 50 && mark >= 45) {
	            return "C-";
	        }else if(mark < 45 && mark >= 40) {
	            return "D";
	        }else if(mark < 40 && mark >= 0) {
	            return "F";
	        }else {
	            return "Invalid mark!!";

}
	}
}
	

