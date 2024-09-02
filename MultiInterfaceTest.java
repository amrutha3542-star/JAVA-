interface A
{
	int x=100;
	public void cal1();
}
class B 
{
	int a,b,c;
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
class C extends B implements A
{
	int f;
	public void cal1()
	{
		f=c+x; 
		System.out.println("Addition : "+f);
	}	
}
class MultiInterfaceTest
{
	public static void main(String arg[])	
	{
		
		C obj=new C();
		obj.get(10,20);
		obj.cal();
		obj.cal1();	
	}
}