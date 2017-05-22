import java.util.Scanner;

public class Exercise18_15 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String words = input.nextLine();
		System.out.print("Enter a character: ");
		String letter = input.next();
		char a = letter.charAt(0);
		System.out.println("The character " + a + " occurs " + count(words, a) + " times.");

	}
	
	public static int count(String words, char a){
		return count(words, a, words.length());
		
	}

	
	
	public static int count(String words, char a, int high){
		int count = words.indexOf(a);
		if (words.indexOf(a) == -1)
			return 0;
		else {
			String rest = words.substring(count + 1,  words.length());
			return count(rest, a, high) + 1;
	}
}
}