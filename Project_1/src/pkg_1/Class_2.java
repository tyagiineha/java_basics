package pkg_1;

public class Class_2 {
	public int sum(int a, int b)
	{
		int c;
		c=a+b;
		return c;
	}
	public int sub(int a, int b)
	{
		int c;
		c=a-b;
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
		Class_2 ref=new Class_2();
		int x =ref.sum(10,2);
		int y=ref.sub(x,2);
		int z=ref.sum(y, 2);
		int w= ref.mul(z, 2);
		ref.div(w,2);
	}
}
