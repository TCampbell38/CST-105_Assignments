
public class OffensivePlayer extends NFLPlayer {
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

}
