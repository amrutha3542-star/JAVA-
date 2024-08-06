abstract class A
{
	int a,b,c;
	abstract void get(int x,int y);
	abstract void cal();
}
class B extends A
{
	void get(int x,int y)
	{
		a=x;
		b=y;
	}
	void cal()
	{
		c=a+b;
		System.out.println("Addition : "+c);	
	}
}
class AbstractTest
{
	public static void main(String arg[])	
	{
		
		A obj=new B();
		obj.get(10,20);
		obj.cal();	
	}
}