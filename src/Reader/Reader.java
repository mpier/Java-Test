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

	private BufferedReader br;
	private String beginClause = "@amount:";
	private String endClause = "PLN";
	
	private double sumOfValues = 0;
	
	public Reader(String path) {
		try {
			br = new BufferedReader(new FileReader(path));
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} 
	}
	
	public void readValuesFromFile() {
		try {
		    int beginIndex = -1, endIndex = -1;

		    String line = br.readLine();
		    while (line != null) {
		    	beginIndex = line.indexOf(beginClause);
		    	endIndex = line.indexOf(endClause);
		        
		    	if(beginIndex>=0) {
		    		beginIndex += beginClause.length();
		    		String cutString = line.substring(beginIndex, endIndex);
		    		cutString = cutString.replace(",", ".");
		    		double tempValue = Double.parseDouble(cutString);
		    		
		    		sumOfValues += tempValue;
		    	}
		    	
		        line = br.readLine();
		    }
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public double getSumOfValues() {
		return sumOfValues;
	}
	
	public void closeBufferedReader() {
		try {
			if(br != null) br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
