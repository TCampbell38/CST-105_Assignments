import java.util.Scanner;

public class Exercise3_12 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter your 3-digit integer: ");
		int number = input.nextInt();
		
		int digit1 = number / 100;
		int digit3 = number % 10;
		
		if (digit1 == digit3)
			System.out.println(number + " is a palindrome.");
		else
			System.out.println(number + " is not a palindrome.");

	}

}
