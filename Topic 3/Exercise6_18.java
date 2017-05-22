import java.util.Scanner;
public class Exercise6_18 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Password must have at least 8 characters \n"
				+ "Password must consist of only letters and digits \n"
				+ "Password must contain at least 2 digits \n"
				+ "Enter your password: ");
		String password = input.next();
		passCheck(password);

	}

	public static void passCheck(String password){
		boolean passCheck = true;
		int digits = 0;
		
		if (password.length() > 8)
			for(char c : password.toCharArray()){
				if(Character.isDigit(c)){
					digits++;
				}
				else if(!Character.isAlphabetic(c)){
					passCheck = false;
					break;
				}
			}
		if (passCheck && digits >= 2){
			System.out.print("Password is valid.");
		}
		else{
			System.out.println("Password is invalid.");
		}
		
	}
	
}
