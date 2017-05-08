package exercisesChapter2;

import java.util.Scanner;

public class Exercise5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the subtotal and a gratuity rate: ");
		double subtotal = input.nextDouble();
		double gratuityRate = input.nextDouble();
		double gratuity = (subtotal * (.01 * gratuityRate));
		double total = (subtotal + gratuity);
		System.out.println("The total is $" + total + " and the gratuity is $" + gratuity + ".");

	}

}
