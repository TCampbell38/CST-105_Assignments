import java.util.Scanner;

public class Exercise6_5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter 3 numbers: ");
		Double num1 = input.nextDouble();
		Double num2 = input.nextDouble();
		Double num3 = input.nextDouble();
		
		sortNumber(num1, num2, num3);
		

	}
	public static void sortNumber(double num1, double num2, double num3){
		if (num1 < num2 && num2 < num3)
			System.out.println(num1 + ", " + num2 + ", " + num3);
		else if (num3 < num2 && num2 < num1)
			System.out.println(num3 + ", " + num2 + ", " + num1);
		else if (num1 < num3 && num3 < num2)
			System.out.println(num1 + ", " + num3 + ", " + num2);
		else if (num2 < num1 && num1 < num3)
			System.out.println(num2 + ", " + num1 + ", " + num3);
		else if (num3 < num1 && num1 < num2)
			System.out.println(num3 + ", " + num1 + ", " + num2);
		else if (num3 < num2 && num2 < num1)
			System.out.println(num3 + ", " + num2 + ", " + num1);
		else if (num2 < num3 && num3 < num1)
			System.out.println(num2 + ", " + num3 + ", " + num1);
		
		
	}

}
