/**
 * INSTRUCTIONS.
 * 
 * Problem Set 2 will test your knowledge and understanding of arithmetic
 * operators and String concatenation. You'll be asked use the Scanner to
 * read user input from the keyboard, and use this input later to compute
 * and print certain required values to the console. All of this is explained
 * (and demonstrated, when appropriate) in the README file.
 */

import java.util.Scanner;
public class ProblemSet2 {
	
	/**
	 * You need not modify the main method.
	 */
	
	public static void main (String[] args) {
		ProblemSet2 ps2 = new ProblemSet2();
		
		ps2.sayHello();
		ps2.gradeMe();
		ps2.groupUs();
		ps2.info();
		ps2.initials();
	}
	
	public void sayHello() {
		System.out.println("What's your first name?");
		Scanner in = new Scanner(System.in);
		String text = in.nextLine();
		System.out.println("What's your last name?");
		String text2 = in.nextLine();
		System.out.println("Hello, " + text + " " + text2 + "!\n");
		//in.close();
	}
	
	public void gradeMe() {
		System.out.println("What's your first homework score?");
		Scanner in = new Scanner(System.in);
		double homework1 = in.nextDouble();
		System.out.println("What's your second homework score?");
		double homework2 = in.nextDouble();
		System.out.println("What's your third homework score?");
		double homework3 = in.nextDouble();
		System.out.println("What's your first quiz score?");
		double quiz1 = in.nextDouble();
		System.out.println("What's your second quiz score?");
		double quiz2 = in.nextDouble();
		System.out.println("What's your third quiz score?");
		double quiz3 = in.nextDouble();
		System.out.println("What's your first test score?");
		double test1 = in.nextDouble();
		System.out.println("What's your second test score?");
		double test2 = in.nextDouble();
		System.out.println("What's your third test score?");
		double test3 = in.nextDouble();
		//in.close();
		homework1 *= 0.15;
		homework2 *= 0.15;
		homework3 *= 0.15;
		quiz1 *= 0.3;
		quiz2 *= 0.3;
		quiz3 *= 0.3;
		test1 *= 0.55;
		test2 *= 0.55;
		test3 *= 0.55;
		Double total = homework1 + homework2 + homework3 + quiz1 + quiz2 + quiz3 + test1 + test2 + test3;
		System.out.println("Your final grade is " + total + "%\n");
	} 
	
	public void groupUs() {
		System.out.println("How many students are there?");
		Scanner in = new Scanner(System.in);
		int students = in.nextInt();
		System.out.println("How many teachers are there?");
		int teachers = in.nextInt();
		//in.close();
		int total = students + teachers;
		int buses = total / 47;
		System.out.println("The number of buses needed is: " + (buses + 1));
		int leftover = total % 47;
		System.out.println("There will be " + (buses) + " buses full with 47 people. There will be one bus with " + leftover + " people.\n");
	} 
	
	public void info() {
		System.out.println("What's your first name?");
		Scanner in = new Scanner(System.in);
		String first = in.nextLine();
		System.out.println("What's your last name?");
		String last = in.nextLine();
		System.out.println("What's your grade?");
		String grade = in.nextLine();
		System.out.println("What's your age?");
		String age = in.nextLine();
		System.out.println("What's your hometown?");
		String home = in.nextLine();
		//in.close();
		System.out.println("NAME\t: " + first + " " + last);
		System.out.println("GRADE\t: " + grade);
		System.out.println("AGE\t: " + age);
		System.out.println("HOMETOWN: " + home + "\n"); 
	} 
	
	public void initials() {
		System.out.print("Please enter your first name: ");
		Scanner in = new Scanner(System.in);
		char first = in.nextLine().charAt(0);
		System.out.print("Please enter your middle name: ");
		char middle = in.nextLine().charAt(0);
		System.out.print("Please enter your last name: ");
		char last = in.nextLine().charAt(0);
		System.out.println("\nYour initials are " + first + middle + last + ".");
		in.close();
	}
}