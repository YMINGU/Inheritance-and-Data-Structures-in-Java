import java.util.ArrayList;
import java.util.Scanner;

/**
 * In this assignment, you will build an information parser.  
 * The program will read and parse text from a file, process and extract the information needed, 
 * request new information from the user, and then write all of the information to a new file. 
 * 
 * The Main class will drive the entire program, and the “main” method calls have been provided for you.  
 * Nothing needs to be completed in the main method.
 */
public class Main {
	
	/**
	 * Main method to drive the program.
	 * @param args
	 */
	public static void main(String[] args) {
		
		/*
		 * Create new instance of file reader which reads the file "info.txt"
		 */
		MyFileReader fr = new MyFileReader("info.txt");

		/*
		 * Create new instance of file writer which writes to the file "personal_info.txt" 
		 */
		MyFileWriter fw = new MyFileWriter("personal_info.txt");
		
		/*
		 * Clean lines of text passed from the file reader
		 */
		ArrayList<String> lines = fr.getCleanContent();
		
		/*
		 * Create lines to write to a new file
		 */
		ArrayList<String> linesToWrite = new ArrayList<>();

		/*
		 * Create new instance of InfoProcessor
		 */
		InfoProcessor ip = new InfoProcessor(lines);

		/*
		 * Get the course name
		 */
		String courseName = ip.getCourseName();

		/*
		 * Get the course id
		 */
		int courseID = ip.getCourseId();

		/*
		 * Get the student id
		 */
		int studentID = ip.getStudentId();
		
		/*
		 * Format the lines to be written
		 */
		String line_1 = "CourseName: " + courseName;
		String line_2 = "CourseID: " + Integer.toString(courseID);
		String line_3 = "StudentID: " + Integer.toString(studentID);

		/*
		 * Add the Strings which will be written to the file to the ArrayList linesToWrite 
		 */
		linesToWrite.add(line_1);
		linesToWrite.add(line_2);
		linesToWrite.add(line_3);

		/*
		 * Create scanner to request new information from user
		 */
		Scanner sc = new Scanner(System.in);

		// Ask the user to choose whether they want to input their personal info
		System.out.print("Do you want to add your personal information to the course information for CIT590?");
		String option = sc.next();
		
		// If not, just write the lines read from info.txt and exit the program
		if (option.equals("n") || option.equals("N")) {
			
			// Write the lines to new file "personal_info.txt"
			fw.writeToFile(linesToWrite); 
			
			// Print thank you information
			System.out.print("Thank you, the course information has been exported to a file. ");
			
			// Exit the program
			System.exit(0); 
		}

		// If user does want to input their personal info
		// Ask user to input their name
		System.out.print("Please input your name (no spaces). ");
		String name = sc.next();
		
		// Add to lines to write to file
		linesToWrite.add("Name: " + name);

		// Ask user to input their favorite color
		System.out.print("Please input your favorite color (no spaces). ");
		String color = sc.next();
		
		// Add to lines to write to file
		linesToWrite.add("FavoriteColor: " + color);

		// Ask user to input their favorite number
		System.out.print("Please input your favorite number (no spaces). ");
		String number = sc.next();
		
		// Add to lines to write to file
		linesToWrite.add("FavoriteNumber: " + number);

		// Print status
		System.out.println("Thank you! We're writing your info to the file... ");

		// Close the scanner
		sc.close();

		// Write the lines to new file "personal_info.txt"
		// (Reference "example_output.txt" for a sample output)
		fw.writeToFile(linesToWrite);
		
		// Print thank you message
		System.out.print("Thank you for waiting! The course information and your personal information has been exported to a file. ");
	}
}