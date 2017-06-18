import java.util.*;

public class NFLDraft implements Celebrator{

	public static void main(String[] args) {
		NFLDraft start = new NFLDraft();
		
		System.out.print("Welcome to NFL Draft 2038! \n"
				+ "-------------------------- \n");
		
		start.printTeams();

	}
	
	static Random rand = new Random();
	
	public int NFLRandom() {
		return rand.nextInt(6) + 1;
	}
	
	@Override
	public void celebrate(int i, int place){
		int randomInt;
		
		if (place == 0){
			randomInt = NFLRandom();
			
			switch (randomInt){
			case 1: System.out.println(players(i).get(place) + " seems pleased to be drafted."); break;
			case 2: System.out.println(players(i).get(place) + " dances to celebrate his draft."); break;
			case 3: System.out.println(players(i).get(place) + " is bragging to his friends about his draft."); break;
			case 4: System.out.println(players(i).get(place) + " doesn't seem to care much about his draft."); break;
			case 5: System.out.println(players(i).get(place) + " wants to throw a party in celebration of his draft."); break;
			case 6: System.out.println(players(i).get(place) + " yells so loudly in celebration, he startles some of his colleagues..."); break;

			}
		}
		
		else if (place == 1) {
				randomInt = NFLRandom();
				
				switch (randomInt){
				case 1: System.out.println(players(i).get(place) + " seems pleased to be drafted."); break;
				case 2: System.out.println(players(i).get(place) + " dances to celebrate his draft."); break;
				case 3: System.out.println(players(i).get(place) + " is bragging to his friends about his draft."); break;
				case 4: System.out.println(players(i).get(place) + " doesn't seem to care much about his draft."); break;
				case 5: System.out.println(players(i).get(place) + " wants to throw a party in celebration of his draft."); break;
				case 6: System.out.println(players(i).get(place) + " high fives his colleagues in celebration of his draft."); break;
				}
		}
	}
	
	
	//User's draft
	public ArrayList<String> Draft = new ArrayList<String>();
	
	//Lets the user view their draft
	public void accessDraft() {
		Scanner input = new Scanner(System.in);
		
		System.out.print("\nYour team has " + Draft.size() + " players.\n"
				+ Draft + "\n");
		
		System.out.print("Select an option:\n "
				+ "[r] to remove a player\n "
				+ "[c] to clear all players from the draft\n "
				+ "[b] to go back to the team selection screen.");
		
		String choice = input.next();
		char answer = choice.charAt(0);
		
		if (answer == 'r'){
			Scanner scan = new Scanner(System.in);
			System.out.print("Enter the player's first and last name: ");
			String p = scan.nextLine();
			
			removePlayer(p);
			accessDraft();
		}
		else if (answer == 'c') {
			System.out.print("\nAll players have been cleared!");
			clearPlayers();
			accessDraft();
		}
		else if (answer == 'b'){
			printTeams();
		}
		else {
			System.out.print("Invalid input.  Please enter a valid input. \n");
			accessDraft();
		}
		
	}
	
	//Adds a player to their draft
	public ArrayList<String> addPlayer(String s) {
		ArrayList<String> newDraft = Draft;
		if (newDraft.contains(s))
			System.out.print("\nThis player is already on your team.\n");
		else
			newDraft.add(s);
		return newDraft;
	}
	
	//Removes a player from their draft
	public ArrayList<String> removePlayer(String s) {
		ArrayList<String> newDraft = Draft;
		
		for (int i = 0; i < Draft.size(); i++){
			if (s.equalsIgnoreCase(Draft.get(i))){
				newDraft.remove(i);
				return newDraft;
			}
		}
		return newDraft;
	}
	
	
	
	//Clears all players on the draft
	public ArrayList<String> clearPlayers() {
		ArrayList<String> newDraft = Draft;
		
		newDraft.clear();
		
		return newDraft;
	}
	
	//Holds and prints the draftable players
	public ArrayList<String> players(int i) {
		ArrayList<String> returnedList = new ArrayList<>();
		
		ArrayList<String> Tigers = new ArrayList<String>();
		Tigers.add("Craig Penderson");
		Tigers.add("Jake Long");
		
		ArrayList<String> Sharks = new ArrayList<String>();
		Sharks.add("Tom McCree");
		Sharks.add("Brett Stewart");
		
		ArrayList<String> Pirates = new ArrayList<String>();
		Pirates.add("Ike Ildemal");
		Pirates.add("Quinn Flinton");
		
		ArrayList<String> Knights = new ArrayList<String>();
		Knights.add("Shawn Smith");
		Knights.add("Charly Piper");
		
		switch (i){
		case 1: returnedList.addAll(Tigers); break;
		case 2: returnedList.addAll(Sharks); break;
		case 3: returnedList.addAll(Pirates); break;
		case 4: returnedList.addAll(Knights); break;
		}
		
		return returnedList;
	}
	
	//Prints the teams to the user
	public void printTeams(){
		System.out.print("Choose a team:\n"
				+ "[1]Tigers\t[2]Sharks\n[3]Pirates\t[4]Knights\n"
				+ "[5]View your own draft\n");
		chooseTeam1();
	}
	
	public String showTeam(int i) {
		
		String returnedTeam = null;
		
		switch (i){
		case 1: returnedTeam = "Tigers"; break;
		case 2: returnedTeam = "Sharks"; break;
		case 3: returnedTeam = "Pirates"; break;
		case 4: returnedTeam = "Knights"; break;
		}
		
		return returnedTeam;
	}
	
	public void chooseTeam1(){
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the number next to the team you would like to choose: ");
		int choice = input.nextInt();
		
		if (choice < 1 || choice > 5){
			System.out.print("Invalid input.  Please use a valid input." );
			chooseTeam1();
		}
		else 
			chooseTeam2(choice);
	}
	
	public void chooseTeam2(int i) {
		Scanner input = new Scanner(System.in);
		
		switch (i){
		case 1: System.out.print("You have chosen the Tigers\n"); break;
		case 2: System.out.print("You have chosen the Sharks\n"); break;
		case 3: System.out.print("You have chosen the Pirates\n"); break;
		case 4: System.out.print("You have chosen the Knights\n"); break;
		case 5: accessDraft();
		}
		
		System.out.print("Select an option:\n"
				+ "[b] Go back to the previous menu.\n"
				+ "[a] Show all players on the team.\n"
				+ "[p] View offense or defense on the team.\n");
		
		
		String choice = input.next();
		char answer = choice.charAt(0);
		
		if (answer == 'b'){
			chooseTeam1();
		}
		else if (answer == 'a'){
			showAllPlayers(i);
		}
		else if (answer == 'p') {
			choosePosition(i);
		}
		else{
			System.out.print("Invalid input.  Please enter a valid input.");
			chooseTeam2(i);
		}
	}
	
	public void showAllPlayers(int i) {
			Scanner input = new Scanner(System.in);
			System.out.print("\nThe players on " + showTeam(i) + " are: " + players(i) + "\n"
				     + "Choose a player?\n"
				     + "Enter 'y' for yes\n"
				     + "Enter 'n' for no and to return to the selection screen: ");
	
			String choice = input.next();
			char answer = choice.charAt(0);
	
			if (answer == 'y')
			{	
				Scanner scan = new Scanner(System.in);
		
		
				System.out.print("Enter the player's name here: ");
				String choosePlayer = scan.nextLine();
		
				for (int l = 0; l < players(i).size(); l++)
				{
					if (choosePlayer.equalsIgnoreCase(players(i).get(l)))
						choosePlayer(i, l);
				}
			}
			else if (answer == 'n'){
				chooseTeam2(i);
			}
			else{
				System.out.print("\nInvalid input.  Please enter a valid input. \n");
				showAllPlayers(i);
			}
		}
		
	public void choosePosition(int i) {
		Scanner input = new Scanner(System.in);
			
		System.out.print("[b] to go back to the previous menu.\n"
				+ "[o] for offensive players.\n"
				+ "[d] for defensive players.\n");
			
		String choice = input.next();
		char answer = choice.charAt(0);
		
		if (answer == 'r'){
			chooseTeam2(i);
		}
		else if (answer == 'o'){
			System.out.print("\n" + players(i).get(0));
			choosePlayer(i, 0);
		}
		else if (answer == 'd') {
			System.out.print("\n" + players(i).get(1));
			choosePlayer(i, 0);
		}
		else{
			System.out.print("\nInvalid input.  Please enter a valid input.");
			choosePosition(i);
		}
	}
	
	public int height = 5;
	
	public double weight = 190.4;
	
	public int number = 23;
	
	public int touchdowns = 4;
	
	public int interceptions = 2;
	
	public int passYards = 1296;
	
	public int rushYards = 1102;
	
	public int receivingYards = 943;
	
	public int tackles = 7;
	
	public double sacks = 13.5;
	
	public void choosePlayer(int i, int place) {
		Scanner sc = new Scanner(System.in);
		
		if (place == 0) 
		{
			System.out.print("\n" 
							+ players(i).get(place) + " is an offensive player\n"
					       + "Height is: " + height + "'\n"
					       + "Weight is: " + weight + "lbs\n"
					       + "Jersey number is: " +number + "\n"				       
					       + "Touchdowns: " + touchdowns + "\n"
					       + "Interceptions: " + interceptions + "\n"
					       + "Passing yards: " + passYards + "\n"
					       + "Rushing yards: " + rushYards + "\n"
					       + "Receiving yards: " + receivingYards + "\n"
					       + "Would you like to add this player to your roster?\n"
					       + "[y] for yes\n"
					       + "[n] for no (will return to the previous screen)\n"
					       + "[a] to view all players on " + showTeam(i) + ":\n");
			
			String choice = sc.next();
			char answer = choice.charAt(0);
			
						
			if (answer == 'y')
			{	
				addPlayer(players(i).get(place));
				celebrate(i, place);
				accessDraft();
			}
			
			else if (answer == 'n')
				choosePosition(i);
			
			else if (answer == 'a')
				showAllPlayers(i);
		
			else
			{
				System.out.println("Invalid input.  Please enter a valid input\n");
				choosePlayer(i, place);
			}
			
		}
		
		if (place == 1) 
		{
			System.out.print("\n" 
					+ players(i).get(place) + " is a defensive player\n"
			       + "Height is: " + height + "'\n"
			       + "Weight is: " + weight + "lbs\n"
			       + "Player number is: " +number + "\n"				       
			       + "Tackles: " + tackles + "\n"
			       + "Sacks: " + sacks + "\n"
			       + "Interceptions: " + interceptions + "\n"
			       + "Add this player to your roster?\n"
			       + "[y] for yes\n"
			       + "[n] for no (will return to the previous screen)\n"
			       + "[a] to view all players on " + showTeam(i) + ": ");
	
			String choice = sc.next();
			char answer = choice.charAt(0);
			
			
			if (answer == 'y')
			{	
				addPlayer(players(i).get(place));
				celebrate(i, place);
				accessDraft();
			}
			
			else if (answer == 'n')
				choosePosition(i);
			
			else if (answer == 'a')
				showAllPlayers(i);

			else
			{
				System.out.println("Invalid input.  Please enter a valid input.\n");
				choosePlayer(i, place);
			}
			
		}	
	}
	

}
