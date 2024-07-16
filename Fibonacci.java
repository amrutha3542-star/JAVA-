import java.util.*;
class Fibonacci
{
public static void main(String arg[])
{
Scanner sc=new Scanner(System.in);
int n,a=0;b=1;
System.out.println("enter a");
a=sc.nextInt();
while(a<=n) {
int sum=a+b;
a=b;
b=sum;
System.out.println("Fibonacci series");
}
}
