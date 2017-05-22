import java.util.Scanner;

public class TimeConversion1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a time in 24-hour format: ");
		int mHour = input.nextInt();
		
		int sHour = mHour % 12;
		
		if (sHour == 0)
			sHour = 12;
		
		if (mHour < 12)
			System.out.println("The time in standard format is: " + sHour + " AM");
		else if (mHour > 12 && mHour < 24)
			System.out.println("The time in standard format is: " + sHour + " PM");
		else if (mHour == 12)
			System.out.println("The time in standard format is: " + sHour + " PM");
		else
			System.out.println("Invalid input");
		
		

	}

}
