class A
{
	int a,b,c;
	void get(int x)
	{
a=x;
b=x;
}
void cal()
{
c=a+b;
System.out.println("Addition : "+C);
}
}
class B extends A
{
int d,e;
void get(int z)
{
super.get(z);
d=z;
{

oid cal()
{
super.cal();
e=a+b+c+d;
System.out.println("Addition :"+e);
}
}
}
class AB
{
public static void main(String arg[])
{
b obj=new b();
obj.get(10);
obj.cal();
}
} 