package Time;


public class Cal {

 public static void main(String args[])
 {
	 int[][] arr;
	 arr=new int[2][2];
	arr[0][0]=0;
	arr[1][1]=1; 
	arr[1][0]=2;
	arr[1][1]=3;
    
	int[][] arr1;
	arr1=new int[7][2];
	System.arraycopy(arr, 1, arr1, 0, 4);
	
	for(int i[]:arr1)
		{
		for(int j:i)
		System.out.println(j);
		}
 }
	
}
