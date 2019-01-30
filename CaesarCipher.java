
import java.util.Scanner;

/**
 * This class enables a user to enter messages to be either encrypted or
 * decrypted by a known key value.
 * 
 * @author jamescampbell
 *
 */
public class CaesarCipher {

	/**
	 * main method which gets user input and calls encryption/decryption methods
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Do you want to encrypt or decrypt a message:");
		String option = input.nextLine();

		if (option.equalsIgnoreCase("encrypt")) {
			System.out.println("Enter your message:");
			String message = input.nextLine();
			System.out.println("What is the encryption key: ");
			int key = input.nextInt();
			encrypt(message, key);
		} else if (option.equalsIgnoreCase("decrypt")) {
			System.out.println("Enter your message:");
			String message = input.nextLine();
			System.out.println("What is the decryption key: ");
			int key = input.nextInt();
			decrypt(message, key);
		}
		input.close();
	}

	/**
	 * method to encrypt a string using a known key
	 * 
	 * @param original
	 * @param key
	 */
	public static void encrypt(String original, int key) {

		System.out.println("Output:");

		for (int loop = 0; loop < original.length(); loop++) {
			char print = original.charAt(loop);
			print = (char) (print + key);
			System.out.print(print);

		}
		System.out.println("\n");
	
	}

	/**
	 * method to decrypt a string using a known key
	 * 
	 * @param original
	 * @param key
	 */
	public static void decrypt(String original, int key) {

		System.out.println("Output:");

		for (int loop = 0; loop < original.length(); loop++) {
			char print = original.charAt(loop);
			print = (char) (print - key);
			System.out.print(print);

		}
		System.out.println("\n");
		
	}

}
