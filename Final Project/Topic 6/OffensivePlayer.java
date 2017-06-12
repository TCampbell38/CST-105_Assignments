import java.util.Random;

public class OffensivePlayer extends NFLPlayer implements Celebrator{
	private static int passY;
	private static int rushY;
	private static int receiving;
	private static int td;
	private static int fieldGoal;
	
	public static int getPassY() {
		return passY;
	}
	
	public static void setPassY(int pY) {
		passY = pY;
	}
	
	public static int getRushY() {
		return rushY;
	}
	
	public static void setRushY(int rY) {
		rushY = rY;
	}
	
	public static int getReceiving() {
		return receiving;
	}
	
	public static void setReceiving(int r) {
		receiving = r;
	}
	
	public static int getTD() {
		return td;
	}
	
	public static void setTD(int t) {
		td = t;
	}
	
	public static int getFieldGoal() {
		return fieldGoal;
	}
	
	public static void setFielGoal(int FG) {
		fieldGoal = FG;
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
			System.out.println(getName() + " high fives his colleagues in celebration of his draft.");
		}
	}

}
