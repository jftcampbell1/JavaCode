
import java.util.Scanner;

/**
 * Class which will give the fizzbuzz status of a certain number or will print
 * out all fizzbuzz values for the numbers 1-100
 * 
 * @author jamescampbell
 *
 */
public class FizzBuzz {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Hello welcome to fizzbuzz generator.");

		System.out.println("Please choose one of the following options by pressing the relevant number:\n"
				+ "1. You want to know the status of a number.\n"
				+ "2. You want the numbers 1 to a certain value printed.");
		int value = input.nextInt();

		// while loop to ensure valid input
		while (value != 1 && value != 2) {
			System.out.println(
					"Sorry invalid option.\nPlease choose one of the following options by pressing the relevant number:\n"
							+ "1. You want to know the status of a number.\n"
							+ "2. You want the numbers 1-100 printed.");
			value = input.nextInt();
		}
		// option 1: get value to be checked by the user
		if (value == 1) {
			System.out.println("What number would you like to check?");
			int number = input.nextInt();
			if (number % 15 == 0) {
				System.out.println("Fizzbuzz");
			} else if (number % 5 == 0) {
				System.out.println("Buzz");
			} else if (number % 3 == 0) {
				System.out.println("Fizz");
			} else {
				System.out.println("This is not a FizzBuzz number.");
			}
		}
		// option 2: get upper limit of numbers from user
		if (value == 2) {
			System.out.println("Please enter an upper limit for the fizzbuzz generator: ");
			int limit = input.nextInt();
			for (int loop = 1; loop <= limit; loop++) {
				if (loop % 15 == 0) {
					System.out.println("Fizzbuzz");
				} else if (loop % 5 == 0) {
					System.out.println("Buzz");
				} else if (loop % 3 == 0) {
					System.out.println("Fizz" + "");
				} else {
					System.out.println(loop);
				}

			}

		}

		input.close();

	}

}