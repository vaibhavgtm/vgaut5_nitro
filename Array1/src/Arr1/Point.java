package Arr1;

public class Point {
 public int x, y;
	
Point(int x1,int y1)
	{
		x=x1;
		y=y1;
	}


public Point[] createArray()
{
Point[] p;
p= new Point[10];
  for(int i=0; i<10; i++)
  {
	  p[i]=new Point(i,i+1);
  }
  return p;
}
public void print()
{
	Point[] p1;
	p1=new Point[10];
	p1=createArray();
	 for(int ctr=0;ctr<10;ctr++)
		 System.out.println(p1[ctr].x+" "+p1[ctr].y);
}

}
