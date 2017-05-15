import java.util.Scanner;

public class Exercise3_17 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Select scissors (0), rock (1), or paper (2): ");
		int player = input.nextInt();
		
		int cpu = (int)(Math.random() * 10 % 3);
		
		//Scissors draw
		if (player == 0 && cpu == 0)
			System.out.println("The computer is scissors.  You are scissors.  Draw.");
		//Rock draw
		else if (player == 1 && cpu == 1)
			System.out.println("The computer is rock.  You are rock.  Draw.");
		//Paper draw
		else if (player == 2 && cpu == 2)
			System.out.println("The computer is paper.  You are paper.  Draw.");
		//Player loses scissors
		else if (player == 0 && cpu == 1)
			System.out.println("The computer is rock.  You are scissors.  The computer won.");
		//Player wins scissors
		else if (player == 0 && cpu == 2)
			System.out.println("The computer is paper.  You are scissors.  You won.");
		//Player wins rock
		else if (player == 1 && cpu == 0)
			System.out.println("The computer is scissors.  You are rock.  You won.");
		//Player loses rock
		else if (player == 1 && cpu == 2)
			System.out.println("The computer is paper.  You are rock.  The computer won.");
		//Player loses paper
		else if (player == 2 && cpu == 0)
			System.out.println("The computer is scissors.  You are paper.  The computer won.");
		//Player wins paper
		else if (player == 2 && cpu == 1)
			System.out.println("The computer is rock.  You are paper.  You won.");
		else
			System.out.println("Invalid input.");

	}

}
