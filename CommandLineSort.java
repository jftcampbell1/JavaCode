import java.util.Arrays;

/**
 * Method to sort
 * 
 * @author jamescampbell
 *
 */
public class CommandLineSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		
		//pointer needed to move placement in array and remove null values at end
		int pointer = 0;
		
		//Create integer array for correct int values

		Integer[] wrapperIntArray = new Integer[args.length];
		
		for(int loop = 0; loop< args.length; loop++) {
			//check if valid entry
			if(allowableValue(args[loop])) {
				System.out.println("Adding "+args[loop]);
				wrapperIntArray[pointer]= new Integer(args[loop]);
				//increase pointer for array size by one
				pointer++;
			}else {
				System.out.println("Sorry incorrect value: "+args[loop]);
			}
		}
		//remove any null values from end of array (0 to --pointer)
		Integer[] parsedIntArray = Arrays.copyOfRange(wrapperIntArray, 0, pointer);
		//if there has been valid input array will be sorted
		if(parsedIntArray.length>0) {
			Arrays.sort(parsedIntArray);
			System.out.println("Output sorted: "+Arrays.toString(parsedIntArray));
		}else {
			System.out.println("No valid input passed. ");
		}
		

	}


	/**
	 * Method to identify if valid value (0-9)
	 * 
	 * @param value
	 * @return
	 */
	public static boolean allowableValue(String value) {

		boolean valid = false;

		switch (value) {
		case "0":
		case "1":
		case "2":
		case "3":
		case "4":
		case "5":
		case "6":
		case "7":
		case "8":
		case "9":
			valid = true;
			break;
		default:
			valid = false;
		}
		return valid;

	}

}
