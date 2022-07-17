

import static org.junit.Assert.assertEquals;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class MyFileWriterTest {
	
	MyFileWriter myFileWriter1; 
	MyFileWriter myFileWriter2;
	MyFileWriter myFileWriter3;
	MyFileWriter myFileWriter4;
	
	@BeforeEach
	void setUp() {
		this.myFileWriter1 = new MyFileWriter("test1_fw.txt");  // file with multiple words per line
		this.myFileWriter2 = new MyFileWriter("test2_fw.txt");  // similar to info.txt file
		this.myFileWriter3 = new MyFileWriter("test3_fw.txt");  // similar to info.txt file but with personal info added
		this.myFileWriter4 = new MyFileWriter("test4_fw.txt");  // similar to info.txt file but with different info and personal info added
	}
	
	@Test
	public void testWriteToFile() {
		ArrayList<String> actualLines = new ArrayList<String>();
		
		// Test file with multiple words per line
		actualLines.add("hello world");
		actualLines.add("Course Name and ID");
		actualLines.add("The quick brown fox jumps over the lazy dog.");
		
		// Write to file
		myFileWriter1.writeToFile(actualLines);
		
		// Read the written file to test its contents
		ArrayList<String> expectedLines = readWrittenFile("test1_fw.txt");
		assertEquals(expectedLines, actualLines);
		
		// Test original info.txt file
		actualLines.removeAll(actualLines);
		actualLines.add("Course: MCIT_590");
		actualLines.add("CourseID: 590");
		actualLines.add("StudentID: 101");
		
		// Write to file
		myFileWriter2.writeToFile(actualLines);
		
		// Read the written file to test its contents
		expectedLines = readWrittenFile("test2_fw.txt");
		assertEquals(expectedLines, actualLines);
		

		// TODO write at least 2 additional test cases using different MyFileWriters
		// Recommended: A test similar to info.txt file but with personal info added
		// Recommended: A test similar to info.txt file but with different info and personal info added
		
	}
	
	/**
	 * Helper method for reading in the written file to check its contents.
	 * @param writtenFilename to read
	 * @return an ArrayList of the lines from the written file
	 */
	private ArrayList<String> readWrittenFile(String writtenFilename) {
		ArrayList<String> expectedLines = new ArrayList<String>();
		try {
			BufferedReader file = new BufferedReader(new FileReader(writtenFilename));
			String line = file.readLine();
			while (line != null) {
				expectedLines.add(line);
				line = file.readLine();
			}
			file.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		
		return expectedLines;
	}
}
