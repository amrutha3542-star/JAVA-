class OddNumberThread extends Thread {
  public void run() {
   try {
for (int i = 1; i <= 10; i++) {
if (i % 2 != 0) {
System.out.println("Odd Number: " + i);
Thread.sleep(1000);                
 }
}
System.out.println("Exiting Odd Number Thread");
 }
 catch (InterruptedException e) {
System.out.println(e);
        }
    }
}

class SumOfSeriesThread extends Thread {
public void run() {
int sum = 0;
try {
for (int i = 1; i <= 10; i++) {
sum += i;
Thread.sleep(2000); 
}
System.out.println("Sum of Series: " + sum);
System.out.println("Exiting Sum of Series Thread");
}
 catch (InterruptedException e) {
System.out.println(e);
}
}
}

public class MultithreadTests {
public static void main(String[] args) {
OddNumberThread oddNumber = new OddNumberThread();
SumOfSeriesThread sumOfSeries = new SumOfSeriesThread();
oddNumber.start();
sumOfSeries.start();
}
}