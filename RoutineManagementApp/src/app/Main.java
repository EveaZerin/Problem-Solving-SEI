package app;
import service.*;
import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {

	public static void main(String[] args) throws java.lang.Exception {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String newRoutine = "";
		while (true) {
			System.out.println("Enter your required option:");
			System.out.println("A. Create Routine\nB. Show Routine\nC. List Courses with Teachers Name");
			String input = scan.nextLine();
			Output out = new Output();
			if (input.equals("A")) {
				out.listCourses();
				System.out.println("Please provide the required dayIndex(0 - 4) hourIndex(0 - 3) courseIndex in four lines");
				String secondInput = "";
				int count = 1;
				while (count <= 4) {
					count++;
					secondInput = secondInput +  scan.nextLine()+"\n" ;
				}
				newRoutine= out.routineGenerator(secondInput);
			} else if (input.equals("B")) {
				
				if (newRoutine.equals("")) {
					System.out.println("No routine! Go to option A.");
				} else {
					System.out.println("The full class plan is:");
					System.out.println(newRoutine);
				}
				break;
			} else if (input.equals("C")) {
				out.listDetails();
				break;
			}

		}
		
	}

}
