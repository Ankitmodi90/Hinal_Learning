package core_Java;

public class TestThrow1 {
	
	static void validate(int age) throws InvalidAgeException 
	{
		if(age<18)
		{
			throw new InvalidAgeException("not valid");
		}
		else {
			System.out.println("Able to vote");
		}
	}
	
	public static void main(String[] args) throws InvalidAgeException {
		TestThrow1.validate(1);
	}

}
