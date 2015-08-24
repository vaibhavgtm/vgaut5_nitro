package mainpack;

import java.io.EOFException;
import java.io.IOException;
import java.sql.SQLException;

class Base{
	public void test()throws SQLException,IOException{
		System.out.println("Base");
	}
}
class Derived extends Base{
	public void test()throws EOFException{
		System.out.println("Derived");
	}
}

public class Expt {

	public static void main(String args[])
	{
		Base b = new Derived();
		try
		{ 
			b.test();
		}
		catch (IOException|SQLException e)
		{
			e.printStackTrace();
		}
			System.out.println("End");
	}
	
}
