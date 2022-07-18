import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Counts words in a given list of lines from a file.
 */
public class WordCounter {

	/**
	 * List of lines of words to count.
	 */
	private ArrayList<String> lines;
	
	/**
	 * Map storing the count of each word in the list of lines.
	 * Each word will be a key, and the associated counts of each word will be the values.
	 */
	private Map<String, Integer> wordCount;

	/**
	 * Creates WordCounter based on the given list of lines.
	 * Starts the process of generating the count of each word in the list.
	 * @param lines of words to count
	 */
	public WordCounter(ArrayList<String> lines) {

		this.lines = lines;
		this.wordCount = new HashMap<String, Integer>();
		this.generateWordCounts();
	}

	/**
	 * Calculates the count of each word in the list of lines.
	 * Traverses the list of lines, and keeps track of the count of each word.
	 * Stores each word as a key and its associated count as a value in the HashMap<String, Integer> wordCount.
	 * 
	 * Note, the words (keys) are case-sensitive.  
	 * e.g. "Hello" is considered a different word (key) than "hello".  
	 * e.g. "UFO" is considered the same word as "UFO". 
	 * 
	 * Hint(s):
	 * - Traverse the list of lines and split each one into an array of words (strings).  Use the words as keys and 
	 * the associated counts as values in the HashMap<String, Integer> wordCount.
	 * 
	 * Example(s):
	 * - If the list of lines contains:
	 * "war and the"
	 * "war the peace peace"
	 * "the war the"
	 * 
	 * Calling generateWordCounts() would populate the HashMap<String, Integer> wordCount with:
	 * ("war", 3), ("and", 1), ("the", 4), ("peace", 2)
	 * 
	 * Example(s):
	 * - If the list of lines contains:
	 * "War and the"
	 * "war the Peace peace"
	 * "thE war The"
	 * 
	 * Calling generateWordCounts() would populate the HashMap<String, Integer> wordCount with:
	 * ("War", 1), ("war", 2), ("and", 1), ("the", 2), ("The", 1), ("thE", 1), ("Peace", 1), ("peace", 1)
	 */
	private void generateWordCounts() {
		
		//TODO Implement method
	}
	
	/**
	 * Gets the HashMap<String, Integer> wordCount.
	 * @return wordCount
	 */
	public Map<String, Integer> getWordCounter() {
		return this.wordCount;
	}

	/**
	 * Gets a list of words that appear a particular number of times, indicated by the given threshold.
	 * 
	 * Hint(s):
	 * - For each word (key) in the wordCount map, check if the associated word count (value) is >= threshold.
	 * 
	 * Example(s):
	 * - If the list of lines contains:
	 * "war and the"
	 * "war the peace peace"
	 * "the war the"
	 * 
	 * Calling getWordsOccuringMoreThan(3) would return an ArrayList<String> with: "war", "the"
	 * Because "war" appears 3 times and "the" appears 4 times. 
	 * 
	 * Example(s):
	 * - If the list of lines contains:
	 * "War and the"
	 * "war the Peace peace"
	 * "thE war The"
	 * 
	 * Calling getWordsOccuringMoreThan(2) would return an ArrayList<String> with: "war", "the"
	 * Because "war" appears 2 times and "the" appears 2 times. 
	 * 
	 * Example(s):
	 * - If the list of lines contains:
	 * "War and the"
	 * "war the Peace peace"
	 * "thE war The"
	 * 
	 * Calling getWordsOccuringMoreThan(-1) would return an ArrayList<String> with: 
	 * "War", "war", "and", "the", "The", "thE", "Peace", "peace"
	 * Because all words appear more than -1 times. 
	 * 
	 * @param threshold (minimum word count) for words to include in the returned list,
	 * where each word has a word count >= threshold.
	 * @return list of words, where each has a count >= threshold
	 */
	public ArrayList<String> getWordsOccuringMoreThan(int threshold) {
		ArrayList<String> result = new ArrayList<String>();
		
		//TODO Implement method

		return result;
	}
}