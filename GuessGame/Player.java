public class Player {
	
	// member variables
	int guess = 0;

	// default constructor
	public Player() {
	}

	public void guess() {
		// generate a random number between 0 and 9
		guess = (int) (Math.random() * 10);

		// comment out once program is working - verifies player's guess
		// System.out.println("I'm guessing this number: " + guess);
	}
}
