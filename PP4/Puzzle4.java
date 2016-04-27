public class Puzzle4 {

	// default constructor
	public Puzzle4() {
	}

	public static void main (String[] args) {
		
		// create new Puzzle4B array object, initialized to size 6
		Puzzle4b[] obs = new Puzzle4b[6];

		// declare instance vars
		int y = 1;
		int x = 0;
		int result = 0;

		// loop through the 6 array cells
		while (x < 6) {
			
			// initialize each cell of the obs array object with Puzzle4 objects
			obs[x] = new Puzzle4b();

			// set ivar value of obs array object cell 'x' to value of y
			obs[x].ivar = y;

			// increment y
			y = y * 10;
			
			// increment x
			x = x + 1;
		}

		x = 6; // does nothing as x is already set to 6 at this point in the run

		// run loop in reverse
		while (x > 0) {
			
			// decrement x
			x = x - 1;

			// increment result
			result = result + obs[x].doStuff(x);
		}

		System.out.println("result " + result);
	}
}

class Puzzle4b {

	// local var
	int ivar;

	// doStuff method
	public int doStuff(int factor) {

		// tmp for testing value of ivar as we go through loops
		// System.out.println("ivar: " + ivar);

		if (ivar > 100) {
			return ivar * factor;
		} else {
			return ivar * (5 - factor); 
		}
	}
}
