import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.io.File;
import java.io.PrintWriter;
/**
 * Class to write a list of words to a file.
 */
public class MyFileWriter {
	
	/**
	 * Name of file being written to.
	 */
	private String filename;
	
	/**
	 * Creates MyFileWriter with given filename to write to.
	 * @param filename to write to
	 */
	public MyFileWriter(String filename) {
		this.filename = filename;
	}
	
	/**
	 * Opens the file specified by filename and writes each word in the given list of words to the file.
	 * Each word is written to a new line in the file.
	 *
	 * Example(s):
	 * - If the given list of words contains: "a", "he", "in", "of", "to"
	 * Calling writeToFile(ArrayList<String> words) will open the file, then write each word in the 
	 * given list of words to the file, in the following format:
	 * a
	 * he
	 * in
	 * of
	 * to
	 * 
	 * @param list of words to write to the file
	 */
	public void writeToFile(ArrayList<String> words) {
		
		//TODO Implement method
          try{
            File file= new File(filename);
            FileWriter wr= new FileWriter(file);
            PrintWriter pr= new PrintWriter(wr);
            for( String s:words){
                pr.println(s);
            }
            pr.flush();
            pr.close();
        }catch(Exception e){}

	}
}
