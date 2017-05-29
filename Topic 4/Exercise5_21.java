
/**Note: I can't seem to format these numbers properly.  I use System.out.printf("%4.2f", monthlyPayment) for example and it gives me errors.
* This isn't really a big problem, but I am curious as to why this is happening...
**/

import java.util.Scanner;
public class Exercise5_21 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Loan amount: ");
		double loan = input.nextDouble();
		System.out.print("Number of years: ");
		int years = input.nextInt();
		
		double interest = 5.0;
		
		
		
		System.out.println("Interest rate \t\t Monthly payment \t\t Total Payment");
		
		while (interest <= 8.0){
			
			double monthlyInterest = interest / 1200;
			
			double monthlyPayment = loan * monthlyInterest / (1 - 1 / Math.pow(1 + monthlyInterest, years * 12));
			
			double totalPayment = monthlyPayment * years * 12;
			
			System.out.print(interest + " percent\t\t" + monthlyPayment + "\t\t" + totalPayment + "\n");
			
			interest += 0.125;
			
		}
		
		

	}

}
