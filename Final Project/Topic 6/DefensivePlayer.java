import java.util.Random;

public class DefensivePlayer extends NFLPlayer implements Celebrator {
	private static int interception;
	private static double sacks;
	private static double tackles;
	
	public static int getInterception() {
		return interception;
	}
	
	public static void setInterception(int i) {
		interception = i;
	}
	
	public static double getSacks() {
		return sacks;
	}
	
	public static void setSacks(double s){
		sacks = s;
	}
	
	public static double getTackles() {
		return tackles;
	}
	
	public static void setTackles(double t) {
		tackles = t;
	}
	
	@Override
	public int randomNumber() {
		Random rand = new Random(6);
		
		int number = rand.nextInt();
		
		return number;
	}
	
	@Override
	public void celebrate(){
		

		int celebrate = randomNumber();
		
		if(celebrate == 0) {
			System.out.println(getName() + " seems pleased to be drafted.");
		}
		else if(celebrate == 1){
			System.out.println(getName() + " dances to celebrate his draft.");
		}
		else if(celebrate == 2){
			System.out.println(getName() + " is bragging to his friends about his draft.");
		}
		else if(celebrate == 3){
			System.out.println(getName() + " doesn't seem to care much about his draft.");
		}
		else if(celebrate == 4){
			System.out.println(getName() + " wants to throw a party in celebration of his draft.");
		}
		else if(celebrate == 5){
			System.out.println(getName() + " yells so loudly in celebration, he startles some of his colleagues...");
		}
		else if(celebrate == 6){
			System.out.println(getName() + " is going to go for a drive to celebrate his draft.");
		}
	}

}
