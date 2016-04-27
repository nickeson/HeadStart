public class Mix4 {
	
	// instance variables ('of the class', encapsulated))
	private int counter = 0;
	private String text = "Test String";
	
	// default constructor
	public Mix4() {
	}

	// maybeNew method takes 'index' argument, initializes automatically to 0
	public int maybeNew(int index) {
		
		// for index values 0-z (z = 5, 7 or 1, depending on exercise params)
		if (index < 5) {

			// create new instance of Mix4 object called 'm4'
			Mix4 m4 = new Mix4();
			
			// increment counter variable of m4 object
			m4.counter = m4.counter + 1;
																							// return value of 1 on method calls with params 0 -4 
			return 1;
		}
		
		// return value of 0 on method calls with params >= 5
		return 0;
	}

	// create getters & setters to access private member vars 'counter' & 'text'
	public int getCounter() {
		return counter;
	}

	public void setCounter(int c) {
		counter = c;	
	}

	public String getText() {
 		return text;
 	}

	public void setText(String t) {
		text = t;	
	}
	
	// alternate form of setter using 'this'
	// public void setCounter(int counter) {
	// this.counter = counter;
	// }

	// alternate form of setter using 'this'
	// public void setText(String text) {
	// this.text = text;
	//}
}
