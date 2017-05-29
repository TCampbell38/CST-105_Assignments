
public class NFLPlayer {
	
	
	
	//Statistics that will be used for all players
	private static String team;
	private static String name;
	private static String pos;
	
	//Statistics used for defense position players
	private static int interception;
	private static double sacks;	
	
	//Statistics used for offense position players
	private static int passY;
	private static int rushY;
	private static int receiving;
	private static int td;
	private static int fieldGoal;
	
	
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
