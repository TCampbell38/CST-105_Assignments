import java.util.Scanner;
public class Exercise6_7 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("The amount invested: ");
		double iA = input.nextDouble();
		System.out.print("Annual interest rate: ");
		double aIR = input.nextDouble() / 100;
		double mIR = aIR / 12;
		int years = 0;
		
		futureInvestmentValue(iA, mIR, years);
		

	}
	
	public static double futureInvestmentValue(double iA, double mIR, int years){
		double fIV = 0;
		for (years = 0; years <= 30; years++){
			fIV = iA * Math.pow((1 + mIR), (years * 12));
			System.out.printf("Future investment value in " + years + " years is: %4.2f \n", + fIV);
		}
		
		return fIV;
	}

}
