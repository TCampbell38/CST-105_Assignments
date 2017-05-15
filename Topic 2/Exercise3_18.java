import java.util.Scanner;

public class Exercise3_18 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the weight of the package: ");
		double weight = input.nextDouble();
		
		double price = 0;
		
		if (weight <= 1)
			price = 3.5;
		else if (weight <= 3)
			price = 5.5;
		else if (weight <= 10)
			price = 8.5;
		else if (weight <= 20)
			price = 10.5;
		else
			System.out.println("The package cannot be shipped");
		
		if (weight <= 20)
			System.out.println("The price of a package with a weight of " + weight + " pounds is $" + price + ".");

	}

}
