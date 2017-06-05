
public class DefensivePlayer extends NFLPlayer {
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

}
