class DogTestDrive {
	public static void main (String[] args) {
		
		// create an instance of the class Dog (this one's named Nippy!)
		Dog dog = new Dog();

		// set some attributes for this type of dog
		dog.size = 40;
		dog.breed = "Chocolate Lab";
		dog.name = "Nippy";

		// make the dog do something
		dog.bark();

		// show us the size and name of the dog
		System.out.println("The Dog's size is: " + dog.size);
		System.out.println("The Dog's name is: " + dog.name);
	}
}
