import java.util.Random;

abstract class NFLPlayer implements Celebrator{
	
	private static String team;
	private static String name;
	private static String pos;
	
	public static String getTeam() {
		return team;
	}
	
	public static void setTeam(String s) {
		team = s;
	}
	
	public static String getName() {
		return name;
	}
	
	public static void setName(String n) {
		name = n;
	}
	
	public static String getPos() {
		return pos;
	}
	
	public static void setPos(String p){
		pos = p;
	}
	
	public int randomNumber() {
		Random rand = new Random(5);
		
		int number = rand.nextInt();
		
		return number;
	}
	
	public void celebrate() {
		
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
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
