package Experiment7;

public class MyClass implements A {
	public void meth1() {
		System.out.println("Hello,I'm Arnav");
	}
	public void meth2()
	{
		System.out.println("This is OOPS Lab");
	}
	public static void main(String args[])
	{
		MyClass obj=new MyClass();
		obj.meth1();
		obj.meth2();
		}
}
