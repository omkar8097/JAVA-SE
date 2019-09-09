package ttt;


public abstract class Demo1
{
	abstract void callme();
	public void normal()
	{
		System.out.println("this is concrete method");
	}
}
class B extends Demo1
{
	void callme()
	{
		System.out.println("this is callme.");
	}
	public static void main(String[] args)
	{
	 B b = new B();
	 b.callme();
	 b.normal();
	}
}