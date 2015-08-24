package Time;

public class Statisitcs {
 public static void avg(int... num)
 {
	 int sum=0;
	 for(int i:num)
	 {
		 sum=+i;
	 }
     double avgr=0.0D;
     avgr=(float)sum/num.length;
     System.out.println(avgr);
 }
 public static void main(String args[])
 {
	 avg(2,3,5,3,6,7,45);
 }
}
