package pkg3;

public class parent {
	
	public parent()
	{
		this(3,4);
		System.out.println("parent default");
	}
	public parent(int x)
	{
		this();
		System.out.println("parent 1 parameter");
	}
	public parent(int x, int y)
	{
		System.out.println("parent 2 parameter");
	}
}
