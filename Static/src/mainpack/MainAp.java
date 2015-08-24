package mainpack;

class IllegalAgeException extends Exception
{
	public String getMessage()
	{
		System.out.println("Age below 18");
		return super.getMessage();
	}
}
class Vote{
	public void register(int age) throws IllegalAgeException{
		if(age<18){
			throw new IllegalAgeException();
		}
		System.out.println("You are elligble to vote");
	}
	
} 
public class MainAp {

	public static void main(String args[]){
		
		Vote vote = new Vote();
		
	    try {
		
	    	vote.register(22);
		} catch (IllegalAgeException e) {
			e.printStackTrace();
			// TODO: handle exception
		}
	    
		
	}
}
