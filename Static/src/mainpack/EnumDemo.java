package mainpack;

enum Apple{
	jonathan(10),goldendel(9),redDel(12),winesap(15),cortland(8);
   private int price;
	
	Apple(int p)
	{
		price=p;
		
	}
	int getPrice(){
		
		return price;
	}
}
public class EnumDemo {

	public static void main(String args[])
	{
		Apple ap;
		System.out.println("Winesap costs "+Apple.winesap.getPrice()+" cents.\n");
		
		System.out.println("All apple prices :");
		for(Apple a : Apple.values())
			System.out.println(a+" costs "+a.getPrice()+" cents ");
		
		/*System.out.println("here are all the apple constants");
		 Apple allapples[]=Apple.values();
		 for(Apple a:allapples)
			  System.out.println(a);
		 
		System.out.println();
		
		
		ap=Apple.valueOf("winesap");
		System.out.println("ap contains "+ap);*/
	}
}
