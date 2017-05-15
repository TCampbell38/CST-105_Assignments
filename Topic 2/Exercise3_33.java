import java.util.Scanner;

public class Exercise3_33 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a weight and price for package 1 (will calculated in ounces and dollars): ");
		double weight1 = input.nextDouble();
		double price1 = input.nextDouble();
		
		System.out.print("Enter a weight and price for package 2: ");
		double weight2 = input.nextDouble();
		double price2 = input.nextDouble();
		
		double value1 = weight1 / price1;
		double value2 = weight2 / price2;
		
		if (value1 < value2)
			System.out.println("Package 2 is a better value at " + value2 + " ounces per dollar, versus " + value1 + " ounces per dollar.");
		else if (value1 > value2)
			System.out.println("Package 1 is a better value at " + value1 + " ounces per dollar, versus " + value2 + " ounces per dollar.");
		else if (value1 == value2)
			System.out.println("Package 1 and package 2 are the same value, at " + value1 + " ounces per dollar.");
		
		

	}

}
