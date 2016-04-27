public class SimpleDotCom {

	// default constructor
	public SimpleDotCom() {
	}

	// declare instance var, 	
	int numOfHits = 0;

	// declare int array object named 'locationCells' (not initialized)
	int[] locationCells;

	// method to check player's guess & return hit, miss or kill
	public String checkYourself(String stringGuess) {
	
		// get user guess using String param, convert to int
		int guess = Integer.parseInt(stringGuess);

		// declare variable to hold hit/miss result, initialize to 'false'
		String result = "miss";

		// for each cell in int array locationCells, check against guess
		for (int cell : locationCells) {
			if (guess == cell) {
				result = "hit";
				numOfHits++;
				break;
			}
		}

		// if number of hits = 3, we've killed!
		if (numOfHits == locationCells.length) {
			result = "kill";
		}

		// prints 'miss' unless changed to 'hit' or 'kill'
		System.out.println("guess result: " + result);

		// return result back to calling method
		return result;
	}
	
	// setter method for locationCells int array object (takes int array)
	public void setLocationCells(int[] locs) {
		// get cell loc as an int array param
		locationCells = locs;
		// assign cell loc param to cell loc instance var
	}
}
