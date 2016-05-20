import Reader.Reader;

/**
 * 
 * @author Marek Pierscieniak
 *
 */
public class Main {

	public static void main(String[] args) {
		double returnedSum = -1;
		
		if(args.length==1) {
			Reader theReader = new Reader(args[0]);
			theReader.readValuesFromFile();
			theReader.closeBufferedReader();
			returnedSum = theReader.getSumOfValues();

			System.out.println("Readed data from file: "+args[0]);
			System.out.printf("Sum of entries: %f", returnedSum);
		} else {
			System.out.println("Provide one correct path to file as argument");
		}
	}

}
