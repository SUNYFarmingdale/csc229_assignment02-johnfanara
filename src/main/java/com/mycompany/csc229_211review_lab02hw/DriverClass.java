package com.mycompany.csc229_211review_lab02hw;
import java.util.Scanner;
/**
 *
 * @author MoaathAlrajab
 */
public class DriverClass {
	
	public static void main(String[] args) {
		// ToDo 5: Fix the error
		
		// ToDo 6: Fix the constructor of Student class
		
		// ToDo 7: Add a toString method for Student class
		
		Student std1= new Student("John", (short) 24);
		
		// ToDo 8: Set the gpa of the student using the scanner and user
		// 			input and then print the output.
                
                System.out.print("Enter GPA: " + "\n");
                //gets and sets user input
                Scanner gpa = new Scanner(System.in);
                std1.setGPA(gpa.nextDouble());
                //sets address
                std1.setAddress("42 Wallaby Way");
                //prints student info
		System.out.println(std1);
		
		// ToDo 9: add comments and explain your code
		
		// ToDo 10: submit using a pull request.
	}

}