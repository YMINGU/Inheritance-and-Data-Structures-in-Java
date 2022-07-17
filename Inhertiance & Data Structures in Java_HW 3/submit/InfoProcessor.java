import java.util.*;

/**
 * Class to process and extract information from a list of lines.
 */
public class InfoProcessor {
	
	/**
	 * List of lines to process.
	 */
	private ArrayList<String> lines = new ArrayList<String>();

	/**
	 * Creates InfoProcessor with given list of lines.
	 * @param lines to process
	 */
	public InfoProcessor(ArrayList<String> lines) {
		this.lines = lines;
	}

	/**
	 * Gets the course name from the list of lines.
	 * First, finds the line that starts with "Course:". 
	 * Second, gets the String on the very next line, which should be the course name.
	 * Third, returns the String from the method.
	 *
	 * Hint(s):
	 * - Use the getNextStringStartsWith(String str) method to find the course name
	 * 
	 * Example(s):
	 * - If the ArrayList<String> lines contains: "Course:" and "CIT590", and we call 
	 * getCourseName(), we'll get "CIT590".
	 * 
	 * - If the ArrayList<String> lines contains: "Course:" and "CIT 593", and we call 
	 * getCourseName(), we'll get "CIT 593".
	 * 
	 * @return course name
	 */
	public String getCourseName() {
		
		// TODO Implement method

		return null;
	}
	
	/**
	 * Gets the course ID from the list of lines.
	 * First, finds the line that starts with "CourseID:". 
	 * Second, gets the String on the very next line, which should be the course ID.
	 * Third, casts the String to an int and returns it from the method.
	 * 
	 * Hint(s):
	 * - Use the getNextStringStartsWith(String str) method to find the course ID
	 * 
	 * Example(s):
	 * - If the ArrayList<String> lines contains: "CourseID:" and "590", and we call 
	 * getCourseId(), we'll get the int 590.
	 * 
	 * - If the ArrayList<String> lines contains: "CourseID" and "593", and we call 
	 * getCourseId(), we'll get the int 593.
	 * 
	 * @return course ID
	 */
	public int getCourseId() {
		
		// TODO Implement method
		
		return 0;
	}

	/**
	 * Gets the student ID from the list of lines.
	 * First, finds the line that starts with "StudentID:". 
	 * Second, gets the String on the very next line, which should be the student ID.
	 * Third, casts the String to an int and returns it from the method.
	 * 
	 * Hint(s):
	 * - Use the getNextStringStartsWith(String str) method to find the student ID
	 * 
	 * Example(s):
	 * - If the ArrayList<String> lines contains: "StudentID:" and "101", and we call 
	 * getStudentId(), we'll get the int 101.
	 * 
	 * - If the ArrayList<String> lines contains: "StudentID" and "5554", and we call 
	 * getStudentId(), we'll get the int 5554.
	 * 
	 * @return student ID
	 */
	public int getStudentId() {
		
		// TODO Implement method
		
		return 0;
	}

	/**
	 * To be used by “getCourseName”, “getCourseId”, and “getStudentId” methods.  
	 * 
	 * Gets the String that follows the line that starts with the given String. 
	 * Gets and returns the String on the very next line.
	 * If the given String doesn't exist, should return null.
	 * 
	 * Example(s):
	 * - If an ArrayList<String> lines contains: "hello" and "world", and we call 
	 * getNextStringStartsWith("hello"), we'll get the String "world".
	 * 
	 * - If an ArrayList<String> lines contains: "Course" and "CIT590", and we call 
	 * getNextStringStartsWith("Course"), we'll get the String "CIT590".
	 * 
	 * - If an ArrayList<String> lines contains: "hello" and "world", and we call 
	 * getNextStringStartsWith("goodbye"), we'll get null.
	 * 
	 * @param str to look for in lines
	 * @return String from the very next line
	 */
	String getNextStringStartsWith(String str) {
		
		// TODO Implement method

		return null;
	}
}
