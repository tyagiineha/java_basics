package pkg3;

public class child extends parent
{
	public child()
	{ 
		this(95);
		System.out.println("child default");
	}
	public child(int x)
	{
		super(55);
		System.out.println("child 1 parameter");
	}
	public child(int x, int y)
	{
		this();
		System.out.println("child 2 paremeter");
	}
	public static void main(String[] args) 
	{
		child ref= new child(2,3);
		
	}
}
