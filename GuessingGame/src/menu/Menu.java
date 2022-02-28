package menu;

import RPS.*;
import RPS.RPS;

public class Menu {

	public void Menu() {
		
		// Class instances
		UserInput userInput = new UserInput();
		RPS rps = new RPS();
		
		// Variables
		String userChoice = null;
		String computerChoice = null;
		boolean exit = false;
		boolean bcontinue;

		bcontinue = false;

		System.out.println("Let's play a game of Rock, Paper, Scissors");

		System.out.println("=".repeat(40));
		
		do {
			System.out.println("Which do you choose? \n" 
					+ "1: Rock \n" 
					+ "2: Paper \n" 
					+ "3: Scissors \n"
					+ "4: Stop playing");

			System.out.println("=".repeat(40));

			int input = userInput.getInt();

			System.out.println("=".repeat(40));
			
			switch (input) {

			case 1:
				userChoice = rps.Rock();
				computerChoice = RandomRPS.ComputerChoice();			
				bcontinue = true;
				break;
			
			case 2:
				userChoice = rps.Paper();
				RandomRPS.ComputerChoice();
				bcontinue = true;
				break;
			
			case 3:
				userChoice = rps.Scissors();
				RandomRPS.ComputerChoice();
				bcontinue = true;
				break;
			
			case 4:
				System.out.println("case 4");
				System.out.println("Thanks for playing!");
				exit = true;
				break;
			
			default:
				System.out.println("default case");
				System.out.println("Please try again.");
			}
						
			while(bcontinue)
			{
				if (userChoice == computerChoice) {
					System.out.println("The computer chose: " + computerChoice);
					System.out.println("you were correct");
				} else {
					System.out.println("The computer chose: " + computerChoice);
					System.out.println("try again kid");
				}
				bcontinue = false;
			}
			
			System.out.println("=".repeat(40));

		} while (!exit);
	}
}