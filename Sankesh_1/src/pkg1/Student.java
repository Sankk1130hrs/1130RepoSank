package pkg1;     

public class Student 
{
	public void method()
	{
		this.method3(1,2,3);
		System.out.println("I am Default Method");
	}
	public void method1(int a)
	{
		this.method2(1, 2);
		System.out.println("I am one Parameterized Method");
	}
	public void method2(int a,int b)
	{
		this.method4(1, 2, 3, 4);
		System.out.println("I am Two Parameterized Method");
	}
	public void method3(int a,int b,int c)
	{
		System.out.println("I am Three Parameterized Method");
	}
	public void method4(int a,int b,int c,int d)
	{
		this.method();
		System.out.println("I am Four Parameterized Method");
	}
	public static void main(String[] args) 
	{
		Student s=new Student();
		s.method1(1);
	}
}