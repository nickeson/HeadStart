public class Mix4TD2 {

	// default constructor
	public Mix4TD2() {
	}

	public static void main (String[] args) {
		// create new Mix4 object instance called m4, inherits
		// vars counter & text and their default vals
		Mix4 m4 = new Mix4();

		// access inherited var vals
		int x = m4.getCounter();
		String y = m4.getText();

		// print out vals
		System.out.println("m4.counter = " + x);
		System.out.println("m4.text = " + y);
		
		// create new Mix4 array object called m4a, size 20
		Mix4[] m4a = new Mix4[20];

		/* populate cell 1 of array with new Mix4 object with default vals
		 * inherited from Mix4TD class instance vars predefined
		 */
		m4a[0] = new Mix4();

		/* manually set counter instance var from Mix4TD class using setter
		 * for cell 1 of m4a array object
		 */ 
		m4a[0].setCounter(1);

		/* use getter to access Mix4 class' instance var 'counter' for m4a
		 * array object cell 1, then print results to console
		 */
		System.out.println("m4a[0].counter: " + m4a[0].getCounter());
	}
}
