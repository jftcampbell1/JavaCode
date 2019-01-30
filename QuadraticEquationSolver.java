import java.util.Scanner;

public class QuadraticEquationSolver {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println(

				"Enter the quadratic equation variables you wish to solve.\n"
						+ "It should be in the form ax^2 + bX + c = 0\n" + "Where a, b and c are all number values.\n"
						+ "Enter is the value of a?");
		double a = input.nextDouble();
		System.out.println("What is the value of b?");
		double b = input.nextDouble();
		System.out.println("What is the value of c?");
		double c = input.nextDouble();

		System.out.printf("So the equation you want to solve is:\n\n" + "%.2fx^2 + %.2fx + %.2f = 0\n", a, b, c);
		quadraticSolver(a, b, c);

		input.close();

	}

	public static void quadraticSolver(double a, double b, double c) {
		double answer1 = (-b + Math.sqrt((Math.pow(b, 2) - 4 * a * c))) / (2 * a);
		double answer2 = (-b - Math.sqrt((Math.pow(b, 2) - 4 * a * c))) / (2 * a);
		System.out.printf("\nThis would give x = %.3f or x = %.3f\n", answer1, answer2);
	}
}
