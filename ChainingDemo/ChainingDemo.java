public class ChainingDemo {
   
	//default constructor of the class
	public ChainingDemo(){
		System.out.println("Default constructor");
	}
   
	public ChainingDemo(String str){
		this();
		System.out.println("Parametrized constructor with single param");
	}

	//It will call the constructor with String argument
	public ChainingDemo(String str, int num){
		this("Hello"); 
	System.out.println("Parametrized constructor with double args");
	}

	// It will call the constructor with (String, integer) arguments
	public ChainingDemo(int num1, int num2, int num3){
		this("Hello", 2);
		System.out.println("Parametrized constructor with three args");
    }

	//Creating an object using Constructor with 3 int arguments
    public static void main(String args[]){
		ChainingDemo obj = new ChainingDemo(5, 5, 15);
    }
}
