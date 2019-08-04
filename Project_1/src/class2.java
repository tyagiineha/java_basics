import java.util.Scanner;

public class class2 
{
     public int sum(int x,int y)
     {
    	 int z= x+y;
    	 return z;
     }
     public int sub(int x,int y)
     {
    	int z= x-y;
    	return z;
      }
     public int mul(int x,int y)
     {
    	 int z=x*y;
    	 return z;
     }
     public void div(int x,int y)
     {
    	 int z=x/y;
    	 System.out.println("the final result is" +z);
     }
     public static void main(String[] args)
     {
    	 Scanner s=new Scanner(System.in);
    	 System.out.println("enter the value of x");
    	 int x=s.nextInt();
    	 System.out.println("enter the value of y");
    	 int y=s.nextInt();
    	 System.out.println("enter the value of z");
    	 int z= s.nextInt();
    	 System.out.println("enter the value of a");
    	 int a=s.nextInt();
    	 System.out.println("enter the value of b");
    	 int b=s.nextInt();
    	 System.out.println("enter the value of c");
    	 int c= s.nextInt();
    	 class2 ref= new class2();
    	 int sum=ref.sum(x, y);
    	 int sub=ref.sub(sum, z);
    	 sum=ref.sum(sub, a);
    	 int mul=ref.mul(sum, b);
    	 ref.div(mul,c);
    	 }
     
 }
