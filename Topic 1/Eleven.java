
public class Eleven {

	public static void main(String[] args) {
		System.out.println("There are " + 365 * 24 * 60 * 60 + " seconds in one year.");
		System.out.println("With one birth every 7 seconds, there are " + 31536000 / 7 + " births in a year.");
		System.out.println("With one death every 13 seconds, there are " + 31536000 / 13 + " deaths in a year.");
		System.out.println("With one new immigrant every 45 seconds, there are " + 31536000 / 45 + " new immigrants in a year.");
		System.out.println("The total estimated population growth for one year is +" + (4505142 - 2425846 + 700800) + " people.");
		System.out.println("If the current population is 312032486, the growth over the next five years will be:");
		System.out.println("Year 1: " + (312032486 + 2780096));
		System.out.println("Year 2: " + (312032486 + (2780096 * 2)));
		System.out.println("Year 3: " + (312032486 + (2780096 * 3)));
		System.out.println("Year 4: " + (312032486 + (2780096 * 4)));
		System.out.println("Year 5: " + (312032486 + (3780096 * 5)));

	}

}
