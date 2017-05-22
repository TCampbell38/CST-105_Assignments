import java.util.Scanner;

public class TimeConversion2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a time value: ");
		double number = input.nextDouble();
		
		double minutes = number % 1;
		double hours = (int)number / 1;
		double minutes2 = 60 * minutes;
		int finalHour = (int)hours;
		int finalMinute = (int)minutes2;
		
		System.out.println("The time is " + finalHour + " hours and " + finalMinute + " minutes.");

	}

}
