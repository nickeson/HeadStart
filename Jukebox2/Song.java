/* we must implement the Comparable interface in order to use sort method on
* Song objects, instead of String objects as sort is defaulted to only sort 
* String objects
*/

class Song implements Comparable<Song>{
	
	// instance vars
	String title;
	String artist;
	String rating;
	String bpm;

	// we must override hashCode() and equals() to get HashSet to work properly
	// and not add duplicates
	public boolean equals(Object aSong) {
		Song s = (Song) aSong;
		return getTitle().equals(s.getTitle());
	}

	public int hashCode() {
		return title.hashCode();
	}

	// the sort() method sends a Song to compareTo() to see how that Song 
	// compares to the Song on which the method was invoked
	// when we implement the interface, we have to implement compareTo() method
	public int compareTo(Song s) {
		return title.compareTo(s.getTitle());
	}

	// constructor sets instance vars from params passed in when constructor is 
	// called
	Song(String t, String a, String r, String b) {
		title = t;
		artist = a;
		rating = r;
		bpm = b;
	}

	// getters & setters
	public String getTitle() {
		return title;
	}

	public String getArtist() {
		return artist;
	}

	public String getRating() {
		return rating;
	}

	public String getBpm() {
		return bpm;
	}

	// overriding Object.toString method to print just title, instead of 
	// name@hashCode which prints by default
	public String toString() {
		// return artist + ": " + title;

		// this return statement prints all populated instance vars for object
		return title + "|" + artist + "|" + rating + "|" + bpm;
	}

	// main method written to test code
	// public static void main (String[] args) {
		// create new Song object called 'mySongs' and print it out
		// Song mySong1 = new Song("Pink Moon", "Nick Drake", "5", "80");
		// Song mySong2 = new Song("Load", "Metallica", "4", "112");
		// System.out.println(mySong1);
		// System.out.println(mySong2);
	//}
}
