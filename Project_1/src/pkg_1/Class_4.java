package pkg_1;

public class Class_4 {
	public int div(int a, int b)
	{
		int c;
		c=a/b;
		return c;
	}
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
		
	public void mul(int a, int b)
	{
		int c;
		c=a*b;
		System.out.println("final result is "+c);		
	}
	public static void main(String[] args)
	{
		Class_4 ref = new Class_4();
		int x=ref.div(10, 2);
		int y=ref.sub(x, 2);
		int z=ref.sum(y, 2);
		y=ref.sub(z, 2);
		ref.mul(y, 2);
	}
}
