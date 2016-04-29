public class ConstructorChaining{
	public static void main(String[] args) {
		// testing constructor chaining in Java
		Base primary = new Base("PrimayTest");
		System.out.println("=================");

		Derived sub = new Derived("DerivedTest");
		System.out.println("=================");

		String passedName = primary.getName();
		System.out.println("passedName = " + passedName);

		String passedNameDeriv = sub.getName();
		System.out.println("passedNameDeriv = " + passedNameDeriv);
	}
}
