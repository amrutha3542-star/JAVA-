class Amrutha1
{
int a,b,c,d;
Amrutha1()
{
a=90;
b=89;
c=88;
d=92;
}
void cal()
{
int total=a+b+c+d;
double aggregate=((double)total/400)*100;
if(aggregate>75)
{
System.out.println(" the grade is distinction");
}
else if(aggregate>=60)
{
System.out.println(" the grade is first division");
}
else if(aggregate>=50)
{
System.out.println(" the grade is second division");
}
else if(aggregate>=40)
{
System.out.println(" the grade is third division");
}
else
{
System.out.println(" the grade is fail");
}
}
}
class Aggregate {
public static void main(String[] args)
{
Amrutha1 myAmrutha1=new Amrutha1();
myAmrutha1.cal();
}
}