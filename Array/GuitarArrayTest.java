public class GuitarArrayTest {

	public static void main(String[] args) {

		// create a new array of Guitar objects called myGuitarArray
		Guitar[] myGuitarArray = new Guitar[5];

		// create guitar object @ array index loc 3 calling default constructor
		myGuitarArray[3] = new Guitar();

		// set 'brand' field of Gibson object in array index loc 3
		myGuitarArray[3].brand = "Gibson";

		// display brand of Guitar in array index loc 3
		System.out.println(myGuitarArray[3].brand);
	}
}
