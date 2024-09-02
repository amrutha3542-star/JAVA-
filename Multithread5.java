class NegativeNumbers implements Runnable 
{
public void run() {
System.out.println("Negative Numbers from -1 to -9:");
for (int i = -1; i >= -9; i--) {
System.out.println(i);
}
}
}
class FibonacciSeries implements Runnable {
public void run() {
int n = 10, a= 0,b = 1;
System.out.println("Fibonacci Series:");
for (int i = 1; i <= n; ++i) {
System.out.print(a+ ", ");
int nextTerm = a+b;
a = b;
b = nextTerm;
}
}
}

public class Multithread5 
{
public static void main(String[] args) {
Thread negativeThread = new Thread(new NegativeNumbers());
Thread fibonacciThread = new Thread(new FibonacciSeries());
negativeThread.start();
fibonacciThread.start();
}
}