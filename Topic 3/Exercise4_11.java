import java.util.Scanner;

public class Exercise4_11 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a decimal value (0 to 15): ");
		int value = input.nextInt();
		
		
		switch (value) {
		case 0: System.out.println("The hex value for " + value + " is 0"); break;
		case 1: System.out.println("The hex value for " + value + " is 1"); break;
		case 2: System.out.println("The hex value for " + value + " is 2"); break;
		case 3: System.out.println("The hex value for " + value + " is 3"); break;
		case 4: System.out.println("The hex value for " + value + " is 4"); break;
		case 5: System.out.println("The hex value for " + value + " is 5"); break;
		case 6: System.out.println("The hex value for " + value + " is 6"); break;
		case 7: System.out.println("The hex value for " + value + " is 7"); break;
		case 8: System.out.println("The hex value for " + value + " is 8"); break;
		case 9: System.out.println("The hex value for " + value + " is 9"); break;
		case 10: System.out.println("The hex value for " + value + " is A"); break;
		case 11: System.out.println("The hex value for " + value + " is B"); break;
		case 12: System.out.println("The hex value for " + value + " is C"); break;
		case 13: System.out.println("The hex value for " + value + " is D"); break;
		case 14: System.out.println("The hex value for " + value + " is E"); break;
		case 15: System.out.println("The hex value for " + value + " is F"); break;
		}
	}

}
