import java.util.Scanner;

/**
 * @author jamescampbell
 *
 */
public class FibonacciSeries {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// Declare vars
		int num1, num2, sum, term;
		num1 = 0;
		num2 = 1;
		
		//Set up scanner to obtain user input
		Scanner scanner;
		scanner =new Scanner(System.in);
		System.out.println("How many terms of the Fibonacci Series would you like?");
		term = scanner.nextInt();
		
		//eliminate negative values and ask for user input again
		while (term <= 0) {
			System.out.println("Sorry invalid value. Please try again:");
			term = scanner.nextInt();
		}
		
		//adjust for special cases: 1 or 2 terms
		if (term == 1) {
			System.out.print(num1);
		}else if (term == 2) {
			System.out.print(num1+", ");
			System.out.print(num2);
			
		//any request other than for 1 or 2 terms
		}else {
		
		System.out.print(num1+", ");
		System.out.print(num2+", ");
		//set up loop for 3 or more terms
		for(int i = 3; i <= term; i++) {
			sum = num1 + num2;
			//if and else statement for formatting
			if(i < term) {
			System.out.print(sum+", ");
			}else {
				System.out.print(sum);
			}
			num1 = num2;
			num2 = sum;
		}//end of for loop
		}//end of else
		scanner.close();
		System.out.println();

	}

}
