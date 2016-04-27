public class SimpleDotComGame {
	
	// default constructor
	public SimpleDotComGame() {
	}
	
	// main method / app entry point
	public static void main (String[] args) {

	int guessNum = 0;

	// we haven't written this yet, but it's to take input from the console
	GameHelper helper = new GameHelper();

	// create instance of SimpleDotCom called dotCom1
	SimpleDotCom dotCom1 = new SimpleDotCom();

	// Compute Random Number between 1 and 4, cast to int = starting cell loc
	int randomNum = (int) (Math.random() * 5);

	/* declare array, incrementally populate it from starting cell loc, 
	 * up to array's length 
	 */

	// invoke setter method setLocationCells on dotCom1 object, populating it with the int array we built
	
	// declare boolean isAlive, initialize to true

	// while dotCom1 isAlive (repeat)
		// get user input from command line (guess)
		// invoke checkYourself method against dotCom1, passing guess param
		// increment guessNum
		// check isAlive is true/false
		// if result = kill, game is over, print congrats
			// else get another guess
		// print out result
	// end while
	
	// print out numOfHits
	}
}
