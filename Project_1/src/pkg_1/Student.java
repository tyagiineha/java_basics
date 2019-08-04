package pkg_1;

public class Student {
	int age=12;
	int roll_no;
	public void display()
	{
		System.out.println("Welcome Everyone");
	}
	public void display_2()
	{
		System.out.println("Basics of Java");
	}
	
	public static void main(String[] args)
	{
		Student deepak = new Student();
		deepak.display();
		deepak.display_2();
		deepak.roll_no=12;
		System.out.println(deepak.age);
		System.out.println(deepak.roll_no);
		
	}

}
