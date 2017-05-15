import java.util.Scanner;

public class Exercise3_5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Sunday = 0, Monday = 1, Tuesday = 2, Wednesday = 3, Thursday = 4, Friday = 5, Saturday = 6.");
		System.out.print("Enter today's day: ");
		int today = input.nextInt();
		System.out.print("Enter the number of days elapsed since today: ");
		final int daysPassed = input.nextInt();
		
		switch (today) {
			case 0: System.out.println("Today is Sunday."); break;
			case 1: System.out.println("Today is Monday."); break;
			case 2: System.out.println("Today is Tuesday."); break;
			case 3: System.out.println("Today is Wednesday."); break;
			case 4: System.out.println("Today is Thursday."); break;
			case 5: System.out.println("Today is Friday."); break;
			case 6: System.out.println("Today is Saturday."); break;
			
			
		}
		//I'm not sure if a switch code would be better here, but I coulnd't figure out how to do the equations in one.  I hope this works just as well.
		if ((today + daysPassed) % 7 == 0) 
			System.out.println("The future day is Sunday.");
		else if ((today + daysPassed) % 7 == 1)
			System.out.println("The future day is Monday.");
		else if ((today + daysPassed) % 7 == 2)
			System.out.println("The future day is Tuesday.");
		else if ((today + daysPassed) % 7 == 3)
			System.out.println("The future day is Wednesday.");
		else if ((today + daysPassed) % 7 == 4)
			System.out.println("The future day is Thursday.");
		else if ((today + daysPassed) % 7 == 5)
			System.out.println("The future day is Friday.");
		else if ((today + daysPassed) % 7 == 6)
			System.out.println("The future day is Saturday.");
		

	}

}
