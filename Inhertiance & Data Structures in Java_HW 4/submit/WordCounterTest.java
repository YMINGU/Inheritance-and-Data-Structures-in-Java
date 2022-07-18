import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class WordCounterTest {

	MyFileReader fr1;
	MyFileReader fr2;

	@BeforeEach
	void setUp() throws Exception {

		// original war_and_peace.txt file
		fr1 = new MyFileReader("war_and_peace.txt");

		// test file containing some text from war_and_peace.txt, with different characters and info
		fr2 = new MyFileReader("test1.txt");
	}

	@Test
	void testWordCounter() {

		// Get clean lines from test1.txt
		ArrayList<String> linesSol = fr2.getCleanContent();

		// Create new Word Counter
		WordCounter wc = new WordCounter(linesSol);

		// Get map of words and counts 
		Map<String, Integer> counters = wc.getWordCounter();

		// Test the count of different words in map
		assertEquals(1, (int) counters.get("Gutenberg"));
		assertEquals(3, (int) counters.get("and"));


		// Get clean lines from war_and_peace.txt
		linesSol = fr1.getCleanContent();

		// Create new Word Counter
		wc = new WordCounter(linesSol);

		// Get map of words and counts 
		counters = wc.getWordCounter();

		// Test the count of different words in map
		int atCount = counters.get("at");
		System.out.println("atCount: " + atCount);
		assertTrue(atCount >= 3700 & atCount <= 4700);

		int inCount = counters.get("in");
		System.out.println("inCount: " + inCount);
		assertTrue(inCount >= 7700 & inCount <= 8700);

		assertEquals((int) counters.getOrDefault("adasdada", 0), 0);
		assertEquals((int) counters.getOrDefault(" ", 0), 0);


		linesSol = fr2.getCleanContent();
		wc = new WordCounter(linesSol);
		counters = wc.getWordCounter();
		assertEquals(1, (int) counters.get("Genoa"));

		linesSol = fr2.getCleanContent();
		wc = new WordCounter(linesSol);
		counters = wc.getWordCounter();
		assertEquals(2, (int) counters.get("Leo"));

		linesSol = fr1.getCleanContent();
		wc = new WordCounter(linesSol);
		counters = wc.getWordCounter();
		assertEquals(1, (int) counters.get("Title:"));
	}

	@Test
	void testGetWordsOccuringMoreThan() {

		// Create new FileReader
		MyFileReader fr = new MyFileReader("war_and_peace.txt");

		// Get clean lines from the File
		ArrayList<String> linesSol = fr.getCleanContent();

		// Create new Word Counter
		WordCounter wc = new WordCounter(linesSol);

		// Get words occurring more than 0 times
		ArrayList<String> ls1 = wc.getWordsOccuringMoreThan(0);
		System.out.println("ls1: " + ls1.size());
		assertTrue(ls1.size() >= 41400 & ls1.size() <= 42400);

		// Get words occurring more than 1000 times
		ArrayList<String> ls2 = wc.getWordsOccuringMoreThan(1000);
		System.out.println("ls2: " + ls2.size());
		assertTrue(ls2.size() >= 50 & ls2.size() <= 60);

		// Get words occurring more than 10000 times
		ArrayList<String> ls3 = wc.getWordsOccuringMoreThan(10000);
		System.out.println("ls3: " + ls3.size());
		assertTrue(ls3.size() >= 4 & ls3.size() <= 6);
		assertEquals(ls3.get(0), "a");
		assertEquals(ls3.get(1), "of");


		// Get words occurring more than 0 times
		ArrayList<String> ls4 = wc.getWordsOccuringMoreThan(0);
		System.out.println("ls4: " + ls4.size());
		assertTrue(ls4.size() >= 41400 & ls4.size() <= 42400);

		// Get words occurring more than 1000 times
		ArrayList<String> ls5 = wc.getWordsOccuringMoreThan(1000);
		System.out.println("ls5: " + ls5.size());
		assertTrue(ls5.size() >= 50 & ls5.size() <= 60);

		// Get words occurring more than 10000 times
		ArrayList<String> ls6 = wc.getWordsOccuringMoreThan(10000);
		System.out.println("ls6: " + ls6.size());
		assertTrue(ls6.size() >= 4 & ls6.size() <= 6);
		assertEquals(ls6.get(0), "a");
		assertEquals(ls6.get(1), "of");
	}

	@Test
	void testGenerateWordCounts() {
		// lines to count words
		ArrayList<String> lines = new ArrayList<String>();
		lines.add("war and the");
		lines.add("war the peace peace");
		lines.add("the war the");

		Map<String, Integer> expectedCounts = new HashMap<String, Integer>();
		expectedCounts.put("war", 3);
		expectedCounts.put("and", 1);
		expectedCounts.put("the", 4);
		expectedCounts.put("peace", 2);

		// Create new Word Counter
		WordCounter wc = new WordCounter(lines);

		// Get and test map of words and counts
		assertEquals(expectedCounts, wc.getWordCounter());

		ArrayList<String> lines2 = new ArrayList<String>();
		lines2.add("war and the");
		lines2.add("war the peace peace");
		lines2.add("the war the the");

		Map<String, Integer> expectedCounts2 = new HashMap<String, Integer>();
		expectedCounts2.put("war", 3);
		expectedCounts2.put("and", 1);
		expectedCounts2.put("the", 5);
		expectedCounts2.put("peace", 2);

		// Create new Word Counter
		WordCounter wc2= new WordCounter(lines2);

		// Get and test map of words and counts
		assertEquals(expectedCounts2, wc2.getWordCounter());



		ArrayList<String> lines3 = new ArrayList<String>();
		lines3.add("war and the");
		lines3.add("war war war the peace peace");
		lines3.add("the war the the");

		Map<String, Integer> expectedCounts3 = new HashMap<String, Integer>();
		expectedCounts3.put("war", 5);
		expectedCounts3.put("and", 1);
		expectedCounts3.put("the", 5);
		expectedCounts3.put("peace", 2);

		// Create new Word Counter
		WordCounter wc3= new WordCounter(lines3);

		// Get and test map of words and counts
		assertEquals(expectedCounts3, wc3.getWordCounter());


		ArrayList<String> lines4 = new ArrayList<String>();
		lines4.add("war");
		lines4.add("the peace");
		lines4.add("and");

		Map<String, Integer> expectedCounts4 = new HashMap<String, Integer>();
		expectedCounts4.put("war", 1);
		expectedCounts4.put("and", 1);
		expectedCounts4.put("the", 1);
		expectedCounts4.put("peace", 1);

		// Create new Word Counter
		WordCounter wc4= new WordCounter(lines4);

		// Get and test map of words and counts
		assertEquals(expectedCounts4, wc4.getWordCounter());	
	}

}
