// required import to use 'Collections' class
import java.util.*;

public class SortMountains {
	
	// create new LinkedList collection object (holds Mountain objects) and name
	// it 'mtn'
	LinkedList<Mountain> mtn = new LinkedList<Mountain>();
	
	// must implement Comparator interface to use Collections.sort()
	// this is an inner class as it's only required when sorting mountains
	class NameCompare implements Comparator<Mountain> {
		
		// method implementation for Comparator.compare method
		// completes implementation for Comparator interface
		public int compare(Mountain one, Mountain two) {
			
			// for testing how sort & compareTo methods work
			// System.out.println("One's name: " + one.name);
			// System.out.println("Two's name: " + two.name);
			// System.out.println("====");
			// System.out.println(two.name.compareTo(one.name));
			// System.out.println("----");

			// compareTo() is actually String.compareTo();
			return one.name.compareTo(two.name);

			// use this instead to sort list in reverse alphabetical order
			// return two.name.compareTo(one.name);
		}
	}

	// must implement Comparator interface to use Collections.sort()
	// this is an inner class as it's only required when sorting mountains
	class HeightCompare implements Comparator<Mountain> {
		
		// method implementation for Comparator.compare method
		// completes implementation for Comparator interface
		public int compare(Mountain one, Mountain two) {
			
			// compares height in descending order
			// returns difference in values, used as comparator value for sort
			return (two.height - one.height);
			
			// compares height in ascending order
			//return (one.height - two.height);
		}
	}

	public static void main(String[] args) {
		
		// this statement is equivalent to the two below it (commented out)
		// but does it leave the object alive after running SortMountains.go()?
		new SortMountains().go();
		
		// I think this statement leaves a SortMountains object named 'sm' alive
		// SortMountains sm = new SortMountains();
		// sm.go();
	}

	public void go() {
		// create new Mountain objects, add to mtn LinkedList collection object
		// pass name and height as args
		mtn.add(new Mountain("Longs", 14255));
		mtn.add(new Mountain("Elbert", 14433));
		mtn.add(new Mountain("Maroon", 14156));
		mtn.add(new Mountain("Castle", 14265));

		// print out list of Mountain objects using overridden toString() method
		// to display name + height, in the order they were entered
		System.out.println("\nas entered:\n" + mtn + "\n");

		/* create NameCompare object nc, use it as Comparator arg to sort
		* LinkedList collection of Mountain objects 'mtn'.  Sort by name
		* Collections.sort() requires Comparator interface be implemented
		* we're using an overloaded sort method by using our own nc Comparator
		* then print out a list of the Mountain objects using overridden
		* toString() method to display name and height for each Mountain object
		*/
		NameCompare nc = new NameCompare();
		Collections.sort(mtn, nc);
		System.out.println("by name (alphabetical):\n" + mtn + "\n");
		
		/* create HeightCompare object hc, use it as Comparator arg to sort
		* LinkedList collection of Mountain objects 'mtn'.  Sort by height
		* Collections.sort() requires Comparator interface be implemented
		* we're using an overloaded sort method by using our own hc Comparator
		* then print out a list of the Mountain objects using overridden
		* toString() method to display name and height for each Mountain object
		*/
		HeightCompare hc = new HeightCompare();
		Collections.sort(mtn, hc);
		System.out.println("by height (descending):\n" + mtn + "\n");
	}
}

class Mountain {
	// instance vars
	String name;
	int height;
	
	// assign instance variables from passed args (received as params by method)
	Mountain (String n, int h) {
		name = n;
		height = h;
	}

	// overridden toString method to print name & height instead of 
	// standard name@hashcode that prints by default when using toString();
	public String toString() {
		return "name=" + name + "|" + "height=" + height;
	}
}
