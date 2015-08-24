package mainpack;

public class MainApp {
	public static void main(String args[])
	{
		Data.value=8;
		System.out.println(Data.value);
	}

}

class Data
{
	static int value;
	static{
		value=88;
	}
}
