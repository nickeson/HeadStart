public class GuessGame {
	
	/* create instance vars for players (can also be done below by adding 
	 * 'Player' before p1, p2, and p3
	 */
	Player p1;
	Player p2;
	Player p3;

	public void startGame() {

		// instantiate 3 player objects
		p1 = new Player();
		p2 = new Player();
		p3 = new Player();

		// create instance vars to hold values of players' guesses
		int guessp1 = 0;
		int guessp2 = 0;
		int guessp3 = 0;

		// instance vars (boolean) to verify if players' guesses are correct
		boolean p1isRight = false;
		boolean p2isRight = false;
		boolean p3isRight = false;

		// create a target number at random that the players have to guess
		int targetNum = (int) (Math.random() * 10);
		System.out.println("\n*** I'm thinking of a number between 0 and 9 ***\n");

		System.out.println("=====================");
		System.out.println("Number to guess is " + targetNum + ".");
		System.out.println("=====================\n");
		
		// create loop to iterate through game/player guesses/guess checks
		while (true) {
			// call each player's guess method
			p1.guess();
			p2.guess();
			p3.guess();

			// get each player's guess
			guessp1 = p1.guess;
			System.out.println("Player 1 guessed: " + guessp1);

			guessp2 = p2.guess;
			System.out.println("Player 2 guessed: " + guessp2);

			guessp3 = p3.guess;
			System.out.println("Player 3 guessed: " + guessp3 + "\n");

			// check each player's guess against targetNum
			if (guessp1 == targetNum) {
				p1isRight = true;
			}

			if (guessp2 == targetNum) {
				p2isRight = true;
			}

			if (guessp3 == targetNum) {
				p3isRight = true;
			}
			
			// if a winner is found, print out congrats, exit, else continue
			if (p1isRight || p2isRight || p3isRight) {
				System.out.println("*** We have a winner! *** \n");
				System.out.println("Player 1 got it right?: " + p1isRight);
				System.out.println("Player 2 got it right?: " + p2isRight);
				System.out.println("Player 3 got it right?: " + p3isRight + "\n");
				System.out.println("=========================================");
				System.out.println("Congratulations to our winner(s)!");
				System.out.println("The game is now over.  Please play again.");
				System.out.println("=========================================\n");				
				break; // game over, break out of loop
			}
			
			else {
				// keep going until somebody gets it right
				System.out.println("Please try again, players...\n");
			}
		}
	}
}
