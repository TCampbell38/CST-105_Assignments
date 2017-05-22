import java.util.Scanner;

public class Exercise18_17 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String words = input.nextLine();
		char[] chars = new char[words.length()];
		for (int i = 0; i < words.length(); i++){
			chars[i] = words.charAt(i);
		}
		System.out.print("Enter a character: ");
		String letter = input.next();
		char a = letter.charAt(0);
		System.out.println("The character " + a + " occurs " + count(chars, a) + " times.");

	}
	
	public static int count(char[] chars, char ch){
		return count(chars, ch, chars.length - 1);
		
	}

	
	
	public static int count(char[] chars, char ch, int high){
		if (high == -1)
			return 0;
		if (chars[high] == ch) {
			return 1 + count(chars, ch, high - 1);
	}
		return count(chars, ch, high - 1);
}
}