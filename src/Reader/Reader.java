/**
 * 
 */
package Reader;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author Marek Pierscieniak
 *
 */
public class Reader {

	public BufferedReader br;
	
	public Reader() {
		try {
			br = new BufferedReader(new FileReader("C:/Users/Marek/workspace/Java Test/src/Plik z danymi.txt"));
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} 
	}
	
	public void readFromFile() {
		try {
		    int beginIndex = -1, endIndex = -1;

		    String line = br.readLine();
		    while (line != null) {
		    	beginIndex = line.indexOf("@amount:");
		    	endIndex = line.indexOf("PLN");
		        
		    	if(beginIndex>=0) {
		    		System.out.println(line.substring(beginIndex, endIndex));
		    	}
		    	
		        line = br.readLine();
		    }
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void closeReader() {
		try {
			if(br != null) br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
