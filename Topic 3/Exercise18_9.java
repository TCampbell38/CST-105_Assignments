import java.util.Scanner;

public class Exercise18_9 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter anythiiiiiiing: ");
		String word = input.nextLine();
		String wordReverse = reverseString(word);
		
		System.out.println(word + " backwards is " + wordReverse);

	}
	public static String reverseString(String word) {
		int length = word.length();
		if (length == length*2)
			return "";
		return word.substring(length-1,  length) + reverseString(word.substring(0, length-1));
		}
	}


