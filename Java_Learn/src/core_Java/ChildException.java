package core_Java;

import java.io.IOException;
import java.sql.SQLException;

public class ChildException extends parentException {

	void msg() throws SQLException
	{
		System.out.println("Child");
	}
}

class parentException
{
	void msg() throws NullPointerException, SQLException
	{
		System.out.println("Parent");
	}
}
