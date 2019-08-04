package pkg_2;

public class Class_this {
	
	Class_this()
	{
		this(2,3,4,5);
		System.out.println("Default Constructor");
      }
	Class_this(int x)
	{
		this();
		System.out.println("one parameterized constructor");
	}
    Class_this(int w, int e)
    {
    	this(3,5,7);
    	System.out.println("two parameterized constructor");
    }
    Class_this(int a,int b, int c)
    {
    	this(23);
        System.out.println("three parameterized constructor");
    }
    Class_this(int a, int b,int c,int d)
    {
    	System.out.println("four parameterized cnstructor");
    }
      public static void main(String[] args)
      {
    	  Class_this ref=new Class_this(2,3);

      }
}

