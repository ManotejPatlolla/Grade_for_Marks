package Userinput_codes;

import java.util.Scanner;
public class Grade_marks {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the marks :");
		int score = sc.nextInt();
		String grade = null;
		
		switch(score/10) {
		    
		case 10:
			grade = "O";
			break;
		case 9:
			grade = "A";
			break;
		case 8:
			grade = "B";
			break;
		case 7:
			grade = "C";
			break;
		case 6:
			grade = "D";
			break;
		case 5:
			grade = "E";
			break;
	    default :
	    	grade = "F";
	    	break;
		}
		
              System.out.println("your grade is " + grade);
	}

}
