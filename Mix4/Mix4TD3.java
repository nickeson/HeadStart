// test drive for Mix4 class
public class Mix4TD3 {

	// default constructor
	public Mix4TD3() {
	}
	
	// main method
	public static void main(String[] args) {

		// count variable is local to main method
		int count = 0;

		// local var for loop counter
		int x = 0;
												
		// create a new array object of Mix4 type objects named m4a, size is 20
		Mix4[] m4a = new Mix4[20];

		while (x < 9) {

			/* - as we loop, create new Mix4 objs in cells of Mix4 array obj
			 * - total num of array slots filled by loop changes in exercise
			 * - values can be 10, 21, 8 or 20
			 * - for each instance of an object created to fill array cells, 
			 *   each object's instance vars are initialized with values defined
			 *   at the class level this causes instance vars 'counter' and 
			 *   'text' to reset each time through the loop to their 
			 *   'class level' values
			 */
			m4a[x]= new Mix4();
			
			// increment array 'counter' and 'text' vars
			m4a[x].setCounter(m4a[x].getCounter() + 1);
			m4a[x].setText(m4a[x].getText() + "2");

			/* increment 'count' local var by 1
			 * this and x are only vars that end up incrementing
			 */
			count = count + 1;

			/* increment the 'count' local var, only for ints 0 - 4
			* passes value of x as a parameter
			*/
			count = count + m4a[x].maybeNew(x);

			// increment loop counter 'x'
			x = x + 1;
		}

		/* print vals of local vars 'count' and 'counter' from cell 2 of
		 * Mix4 array object 'm4a'
		 */
		System.out.println(count + " " + m4a[1].getCounter());
	}
}
