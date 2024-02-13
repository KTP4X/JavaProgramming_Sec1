import java.util.*;
import java.io.*;
public class SentenceText {

	public static void main(String[] args) throws Exception {
		PrintStream writeFile = new PrintStream((new File("d://textFile//sentence.txt")));

		Scanner input = new Scanner(System.in);
	    int i = 1;	
				while(true) {
					System.out.print("Sentence: ");
					String word = input.next();
					if(word.equalsIgnoreCase("stop")) {
						break;
					}
					writeFile.println(word);
					i++;
				}
				System.out.println("File is save!!");
				writeFile.close();
	}

}
