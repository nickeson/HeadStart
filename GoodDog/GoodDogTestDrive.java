class GoodDogTestDrive {
	public static void main (String[] args) {

		// create a new instance of GoodDog called myDog1, set to size 70
		GoodDog myDog1 = new GoodDog();
		myDog1.setSize(70);

		// create a new instance of GoodDog called myDog2, set to size 8
		GoodDog myDog2 = new GoodDog();
		myDog2.setSize(8);

		System.out.println("myDog1: " + myDog1.getSize());
		System.out.println("myDog2: " + myDog2.getSize());

		myDog1.bark();
		myDog2.bark();
	}
}
