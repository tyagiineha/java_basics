package pkg_1;

public class class_3
{
	public int sub(int a, int b)
	{
		int c;
		c=a-b;
		return c;
	}
	public int sum(int a, int b)
	{
		int c;
		c=a+b;
		return c;
	}
	public int mul(int a, int b)
	{
		int c;
		c=a*b;
		return c;
	}
	public void div(int a, int b)
	{
		int c;
		c=a/b;
		System.out.println("final result is "+c);
	}
	public static void main(String[] args)
	{
     class_3 ref=new class_3();
     int x =ref.sub(10,2);
     int y=ref.sum(x,2);
      x=ref.sub(y,2);
     int z=ref.mul(x,2);
     ref.div(z, 2);
	}
     
}
