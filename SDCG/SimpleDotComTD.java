public class SimpleDotComTD {

	// default constructor
	public SimpleDotComTD() {
	}

	public static void main (String[] args) {
	
		// instantiate a new SimpleDotCom object
		SimpleDotCom dotCom1 = new SimpleDotCom();

		// declare an array for dotCom1's loc to be held and populate it
		int[] dotCom1Locs = { 2, 3, 4 };

		/* invoke setter method on dotCom1 object, populating it with the 
		 * int array that we pre-set
		 */
		dotCom1.setLocationCells(dotCom1Locs);

		// test what the number of hits are
		System.out.println("numHits: " + dotCom1.numOfHits);
		
		// hard-coded test guess from user
		String userGuess = "2";

		// invoke the checkYourself method, passing it userGuess param
		String result = dotCom1.checkYourself(userGuess);

		// initialize var to failed, for use below
		String testResult = "failed";

		// use equals method to evaluate string match to 'hit'
		if (result.equals("hit")) {
			testResult = "Passed";
		}

		// print out testResult (pass/fail)
		System.out.println("testResult: " + testResult);
	}
}
