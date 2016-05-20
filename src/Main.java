import Reader.Reader;

/**
 * 
 * @author Marek Pierscieniak
 *
 */
public class Main {

	public static void main(String[] args) {
		double returnedSum = -1;
		
		Reader theReader = new Reader();
		theReader.readValuesFromFile();
		theReader.closeBufferedReader();
		returnedSum = theReader.getSumOfValues();
		
		System.out.printf("Sum of entries: %f", returnedSum);
		
	}

}
