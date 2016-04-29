class Derived extends Base{
	
	protected String name;

	public Derived() {
		System.err.println("Inside no argument constructor of Derived class");
	}

	public Derived(String name) {
		// super(); - compiler auto inserts this if we uncomment next 2 lines
		
		super(name); // calling one argument constructor of super class
		System.out.println("Inside one arg constructor from Derived class");

		// set class instance var 'name' to value passed to constructor as param
		this.name = name; // if commented out, value passed is null
	}

	public String getName() {
		return name;
	}
}
