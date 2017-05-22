import java.util.Scanner;

public class Exercise6_12 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter two characters: ");
		String ch1 = input.next();
		String ch2 = input.next();
		System.out.print("Enter characters per line: ");
		int numberPerLine = input.nextInt();
		
		printChars(ch1.charAt(0), ch2.charAt(0), numberPerLine);

	}
	public static void printChars(char ch1, char ch2, int numberPerLine){
		int difference = (int) (ch2 - ch1);
		for (int i = 1; i < difference; i++){
			System.out.print(++ch1 + " ");
			if (i % numberPerLine == 0)
				System.out.print("\n");
			
		}
	}

}
