import java.util.Scanner;

public class Exercise4_23 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter employee's name: ");
		String name = sc.next();
		System.out.print("Enter number of hours worked in a week: ");
		double hours = sc.nextDouble();
		System.out.print("Enter hourly pay rate: ");
		double pay = sc.nextDouble();
		System.out.print("Enter federal tax withholding rate: ");
		double FTax = sc.nextDouble();
		System.out.print("Enter state tax withholding rate: ");
		double STax = sc.nextDouble();
		
		double gross = hours * pay;
		double totalD = (gross * FTax) + (gross * STax);
		double netP = (gross - totalD);
		
		System.out.println("");
		System.out.println("Employee name: " + name);
		System.out.println("Hours worked: " + hours);
		System.out.println("Pay rate: $" + pay);
		System.out.printf("Gross pay: $" + gross);
		System.out.println("");
		System.out.println("Deductions: ");
		System.out.printf("  Federal withholding (" + FTax * 100 + "): $%4.2f", gross * FTax);
		System.out.println("");
		System.out.printf("  State withholding (" + STax * 100 + "): $%4.2f", gross * STax);
		System.out.println("");
		System.out.printf("  Total deduction: $%4.2f", totalD);
		System.out.println("");
		System.out.printf("Net pay: $%4.2f", netP);

	}

}
