import java.util.ArrayList;
import java.util.Map;

/**
 * Main class to control the flow of the program.
 */
public class Main {

	public static void main(String[] args) {
		
		// Create new File Reader
		MyFileReader fr = new MyFileReader("war_and_peace.txt");
		
		// Create new File Writer
		MyFileWriter fw = new MyFileWriter("output.txt");
		
		// Get clean lines from the file
		ArrayList<String> lines = fr.getCleanContent();

		// Create new Word Counter with the clean lines
		WordCounter wc = new WordCounter(lines);
		
		// Get word count map
		Map<String, Integer> counters = wc.getWordCounter();
				
		// Get and print the counts of some words
		System.out.println(counters.get("Still"));
		System.out.println(counters.get("still"));
		System.out.println(counters.get("in"));
		
		// Get the words repeated 5000 times or more 
		ArrayList<String> words = wc.getWordsOccuringMoreThan(5000);
		
		// Write the words to a file
		fw.writeToFile(words);
		
	}

}
