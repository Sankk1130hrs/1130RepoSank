package pkg2;

import java.util.Scanner;                                     // ((((x1+x2)-x3)+x4)*x5)/x6)
                                                             // ((((x1*x2)+x3)+x4)-x5)/x6)

public class pkgclass1 
{
	static int x1,x2,x3,x4,x5;
	static float x6;
	int sumresult,subresult,mulresult;
	float divresult;
	public int sum(int a, int b)
	{
		int c;
		c=a+b;
		System.out.println("Sum Result" +c);
		sumresult=c;
		return c;
	}
	public int sub (int a, int b)
	{ 
		sumresult=a;
		int c;
		c=a-b;
		System.out.println("Sub Result"+c);
		subresult=c;
		return c;
	}
	public int mul(int a, int b) 
	{
		subresult=a;
		int c;
		c=a*b;
		System.out.println("Mul Result"+c);
		mulresult=c;
		return c;
	}
	public float div(int a, float b)
	{
		mulresult=a;
		float c;
		c=a/b;
		System.out.println("Print Result ((((x1*x2)+x3)+x4)-x5)/x6) = "+c);
		return c;
	}
	public static void main(String[] args) 
	{
		
		System.out.println("Please enter the value of x1:");
		Scanner s1=new Scanner(System.in);
		 x1=s1.nextInt();	
	
		System.out.println("Please enter the value of x2:");
		Scanner s2=new Scanner(System.in);
		x2 =s2.nextInt();
		
		System.out.println("Please enter the value of x3:");
		Scanner s3=new Scanner(System.in);
		x3=s3.nextInt();
		
		System.out.println("Please enter the value of x4:");
		Scanner s4=new Scanner (System.in);
		x4=s4.nextInt();
		
		System.out.println("Please enter the value of x5:");
		Scanner s5=new Scanner (System.in);
		x5=s5.nextInt();
		
		System.out.println("Please enter the value of x6:");
		Scanner s6=new Scanner (System.in);
		x6=s6.nextFloat();	
	
		pkgclass1 obj=new pkgclass1();
		int mul_result=obj.mul(x1,x2);
		int sum_result=obj.sum(mul_result,x3);
		int sum_result1=obj.sum(sum_result,x4);
		int sub_result=obj.sub(sum_result1,x5);
		float div_result=obj.div(sub_result,x6);
		
	}
}
