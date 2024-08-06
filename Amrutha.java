class Amrutha
{
int sal,basicsal,hra;
void getsalary()
{
basicsal=50000;
hra=1500;
}
void cal()
{
sal=basicsal+hra;
System.out.println("employee salary="+sal);
}
}
class Manager extends Amrutha
{
int ta,da,totalsal;
void getsalary()
{
super.getsalary();
ta=10000;
da=1500;
totalsal=sal+ta+da;
}
void disp()
{
System.out.println ("manager salary"+totalsal);
}
}
class Amrutha3test
{
public static void main(String[]arg)
{
Manager c=new Manager();
c.getsalary();
c.cal();
c.disp();
}
}