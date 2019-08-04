package pkg3;

public class class1 {
	public void Method()
	{
		System.out.println("Default Method");
		this.Method1(2);
	}
	public void Method1(int a)
	{
		System.out.println("One parameterized method");
		this.Method3(2,3,4);
	}
	public void Method2(int a, int b)
	{
		System.out.println("Two parameterizrd method");
		this.Method();
	}
	public void Method3(int a,int b,int c)
	{
		System.out.println("Three parameterized Method");
	}
	 public static void main(String args[])
	 {
		 class1 cls =new class1();
		 cls.Method2(3,5);
	 }
}
