package core_Java;

public class TestExceptionPropagation1 {

	void m() {
		throw new ArrayIndexOutOfBoundsException("Error");
	}

	void n() {
		System.out.println("n");
		m();
		System.out.println("n1");
	}
	
	void p() {
		try {
			n();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("exception handled");
		}
	}
	
	public static void main(String[] args) {
		TestExceptionPropagation1 exceptionPropagation1 = new TestExceptionPropagation1();
		exceptionPropagation1.p();
	}
}
