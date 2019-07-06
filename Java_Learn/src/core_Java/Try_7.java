package core_Java;

public class Try_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Base b = new Derived();
//		Derived b = new Derived();
		b.show();
		
	}

}

class Base{
	public static void show()
	{
		System.out.println("Base::Show");
	}
}

class Derived extends Base{
	public static void show()
	{
		System.out.println("Derived::Show");
	}
}
