import java.util.Scanner;

public class Exercise6_3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter an integer: ");
		int number = reverse(input.nextInt());

	}
	public static int reverse(int number) {
		int palindrome = number;
		System.out.println("Is integer a palindrome? " + isPalindrome(number));
		
		
		return palindrome;
	}
	
	public static boolean isPalindrome(int number) {
		boolean isPalindrome;
		if (number / 100 != number % 10)
			isPalindrome = false;
		else
			isPalindrome = true;
		return isPalindrome;
	}
}
