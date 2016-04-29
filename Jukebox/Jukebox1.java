// packages required for collections, sort & I/O objects/methods
import java.util.*;
import java.io.*;

public class Jukebox1 {
	
	/* create a new ArrayList collection object of String objects
	* name this ArrayList collection object 'songList' and instantiate a copy
	*/
	// ArrayList<String> songList = new ArrayList<String>();

	// create a new ArrayList collection object of Song objects
	// name this ArrayList collection object 'songList' and instantiate a copy
	ArrayList<Song> songList = new ArrayList<Song>();

	// main method
	public static void main(String[] args) {
		// create a new Jukebox1 object and run go() method on it
		new Jukebox1().go();
	}

	/* create a new inner class that implements Comparator, which we use for 
	* Song objects.  We're letting the String variables for artist do the
	* comparison since Strings already know how to alphabetize themselves
	* swap 'one' and 'two' in return statement to do reverse alphabetical
	*/
	class ArtistCompare implements Comparator<Song> {
		public int compare(Song one, Song two) {
			return one.getArtist().compareTo(two.getArtist());
		}
	}

	/* create a new inner class that implements Comparator, which we use for 
	* Song objects.  We're letting the String variables for title do the
	* comparison since Strings already know how to alphabetize themselves
	* swap 'one' and 'two' in return statement to do reverse alphabetical
	*/
	class TitleCompare implements Comparator<Song> {
		public int compare(Song one, Song two) {
			return one.getTitle().compareTo(two.getTitle());
		}
	}

	/* create a new inner class that implements Comparator, which we use for 
	* Song objects.  Requires Integer.parseInt to be run on returned rating for
	* each song to convert String representing an int to an actual int for
	* comparison, so as to work like compareTo() does for Strings
	* Comparator value becomes difference in values between params passed
	* - used for descending order
	* - swap 'one' and 'two' in return statement to do ascending order
	*/
	class RatingCompare implements Comparator<Song> {
		public int compare(Song one, Song two) {
			return Integer.parseInt(one.getRating()) - Integer.parseInt(two.getRating());
		}
	}

	/* create a new inner class that implements Comparator, which we use for 
	* Song objects.  Requires Integer.parseInt to be run on returned bpm for
	* each song to convert String representing an int to an actual int for
	* comparison, so as to work like compareTo() does for Strings
	* Comparator value becomes difference in values between params passed
	* - used for descending order
	* - swap 'one' and 'two' in return statement to do ascending order
	*/
	class BpmCompare implements Comparator<Song> {
		public int compare(Song one, Song two) {
			System.out.println("One's BPM: " + one.getBpm());
			System.out.println("Two's BPM: " + two.getBpm());
			System.out.println("Comparator value: " + (Integer.parseInt(one.getBpm()) - Integer.parseInt(two.getBpm())) + "\n");

			return Integer.parseInt(one.getBpm()) - Integer.parseInt(two.getBpm());
		}
	}
	
	public void go() {
		
		// populate list of songs from text file
		getSongs();
		
		// print results (as entered, pre-sort)
		// System.out.println(songList);

		/* Sort songList alphabetically (sort by artist or song title depends on
		* which addSong method we choose - see below; print sorted results
		*/
		// Collections.sort(songList);
		// System.out.println(songList);

		// make new instances of Comparator inner classes
		ArtistCompare artistCompare = new ArtistCompare();
		TitleCompare titleCompare = new TitleCompare();
		RatingCompare ratingCompare = new RatingCompare();
		BpmCompare bpmCompare = new BpmCompare();

		// sort artistCompare instance using artistCompare object as custom
		// comparator for Collections.sort
		Collections.sort(songList, artistCompare);
		System.out.println("\nSongs sorted (alphabetically) by Artist: ");
		System.out.println(songList + "\n");

		// sort titleCompare instance using titleCompare object as custom
		// comparator for Collections.sort
		Collections.sort(songList, titleCompare);
		System.out.println("Songs sorted (alphabetically) by Title: ");
		System.out.println(songList + "\n");
		
		// sort ratingCompare instance using ratingCompare object as custom
		// comparator for Collections.sort
		Collections.sort(songList, ratingCompare);
		System.out.println("Songs sorted by Rating: ");
		System.out.println(songList + "\n");
		
		// sort bpmCompare instance using bpmCompare object as custom
		// comparator for Collections.sort
		Collections.sort(songList, bpmCompare);
		System.out.println("Songs sorted by Beats per Minute: ");
		System.out.println(songList + "\n");
	}

	void getSongs() {
		// error handling
		try{
			// create new File object named 'file' that points to our list
			// of songs/artists (SongList.txt)
			File file = new File("./SongList.txt");

			// create new BufferedReader object named 'reader', pass arg of
			// new FileReader object (which has file obj as arg passed into it)
			BufferedReader reader = new BufferedReader (new FileReader(file));

			// initiliaze local var 'line' to null
			String line = null;

			// while there are still remaining lines in 'file' object
			// addSong from current line in 'file' object
			while ((line = reader.readLine()) != null) {
				addSong(line);
			}
		// error handling
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	
	// USE THIS CODE FOR STRING OBJECTS
	// void addSong(String lineToParse) {
		// using String.split, split lineToParse param at "/" delimiter into
		// String Array called 'tokens'.  then addSong by songName
		// ================================
		// String[] tokens = lineToParse.split("/");
		// songList.add(tokens[0]);
		
		// using String.split, split lineToParse param at "/" delimiter into
		// String Array called 'tokens'.  then addSong by artistName
		// ================================
		// String[] tokens = lineToParse.split("/");
		// songList.add(tokens[1]);

		// addSong (full artistName/songName format) from 'file', no delimiter
		// ================================
		// String currLine = lineToParse;
		// songList.add(currLine);
	// }
		
	// USE THIS CODE FOR SONG OBJECTS
	void addSong(String lineToParse) {
		// using String.split, split lineToParse param at "/" delimiter into
		// String Array called 'tokens'
		String[] tokens = lineToParse.split("/");

		// create new Song object called 'nextSong', passing args 'tokens[]'
		// from tokens String array, split at "/" delimiter
		Song nextSong = new Song(tokens[0], tokens[1], tokens[2], tokens[3]);
		songList.add(nextSong);
	}
}
