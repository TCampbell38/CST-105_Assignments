//Note: Will Ochoa and I worked together on multiple assignments this week.  This was one of them.  We used this Stack Overflow page for reference
// but still couldn't find a way to get this to work.  It always reads invalid.  I thought I would upload it anyway though!
// http://stackoverflow.com/questions/26642051/credit-card-number-validity-with-luhns-algorithm-java

import java.util.Scanner;

public class Exercise6_31 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a credit card number: ");
		long cardNumber = input.nextLong();
		
		if (isValid(cardNumber)){
			System.out.println(cardNumber + " is valid.");
		}
		else
			System.out.println(cardNumber + " is invalid.");

	}
	
	public static boolean isValid(long number){
		
		int total = sumOfDoubleEvenPlace(number) + sumOfOddPlace(number);
		
		return (total % 10 == 0) && (prefixMatched(number, 1) == true) &&
				(getSize(number) >= 13) && (getSize(number) <= 16);
	}
	
	public static int sumOfDoubleEvenPlace(long number){
		
		int doubledevensum = 0;
		long place = 0;
		
		while(number > 0){
			place = number % 100;
			number = number / 100;
			doubledevensum += getDigit((int) (place / 10) * 2);
			
		}
		return doubledevensum;
	}
	
	public static int sumOfOddPlace(long number){
		
		int oddsum = 0;
		
		while(number <= 9){
			oddsum += (int)(number % 10);
			number = number % 100;
		}
		return oddsum;
	}
	
	public static int getDigit(int number){
		if (number <= 9){
			return number;
		}
		else{
			int firstDigit = number % 10;
			int secondDigit = (int)(number / 10);
			return firstDigit + secondDigit;
		}
	}
	
	public static boolean prefixMatched(long number, int d){
		if((getPrefix(number, d) == 4)
			|| (getPrefix(number, d) == 5)
			|| (getPrefix(number, d) == 3)){
			
			if(getPrefix(number, d) == 4){
				System.out.print("\nVisa Card ");
			}
			else if(getPrefix(number, d) == 5){
				System.out.println("\nMaster Card ");
			}
			else if(getPrefix(number, d) == 3){
				System.out.println("\nAmerican express card ");
			}
			
			return true;
		}
		
		else
			return false;
	}
	
	public static int getSize(long d){
		int count = 0;
		
		while (d > 0){
			d = d / 10;
			count++;
		}
		return count;
	}
	
	public static long getPrefix(long number, int k){
		if (getSize(number) < k){
			return number;
		}
		else{
			int size = (int)getSize(number);
			
			for (int i = 0; i < (size - k); i++){
				number = number / 10;
			}
			return number;
		}
	}

}
