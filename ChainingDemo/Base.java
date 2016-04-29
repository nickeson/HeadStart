class Base {
	protected String name;

	public Base(){
		this(""); // calling one arg constructor of same class (below)
		System.out.println("Inside no argument constructor of Base class");
	}

	public Base(String name){
		/* this.name refers to the 'name' field of Base class
		* name here refers to the local val of name passed to the constructor
		*/
		this.name = name;
		System.out.println("One arg constructor of Base class");
	}

	public String getName() {
		return name;
	}
}
