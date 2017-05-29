import java.util.Scanner;

public class Exercise10_1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("The current time is: " + getHours() + ":" + getMinutes() + ":" + getSeconds() + "\n");
		System.out.print("Enter an amount of milliseconds since midnight, Jan. 1, 1970: \n");
		long elapsedTime = input.nextLong();
		
		setTime(elapsedTime);
		
		

	}
	public static int millis = (int)System.currentTimeMillis();
	
	private static int seconds = millis / 1000 % 60;
	
	private static int minutes = millis / 60000 % 60;
	
	private static int hours = millis / 3600000 % 24;
	
	public static int getSeconds(){
		return seconds;
	}
	
	public static int getMinutes(){
		return minutes;
	}
	public static int getHours(){
		return hours;
	}
	
	public static void setTime(long elapsedTime){
		double passedTime = System.currentTimeMillis() - elapsedTime;
		
		int elapsedSeconds = (int)elapsedTime / 1000 % 60;
		int elapsedMinutes = (int)elapsedTime / 60000 % 60;
		int elapsedHours = (int)elapsedTime / 3600000 % 24;
		
		System.out.println("The elapsed time since midnight, Jan. 1, 1970 is: " + elapsedHours + ":" + elapsedMinutes + ":" + elapsedSeconds);
	}
	

}
