public class ElectricityBill {
    int consumerNo;
    String consumerName;
    double prevMonthReading;
    double currMonthReading;

    public ElectricityBill(int consumerNo, String consumerName, double prevMonthReading, double currMonthReading) {
     consumerNo = consumerNo;
     consumerName = consumerName;
prevMonthReading = prevMonthReading;
 currMonthReading = currMonthReading;
    }

    public double calculateBillAmount() {
        double unitsConsumed = currMonthReading - prevMonthReading;
        double billAmount = 0;

        if (unitsConsumed <= 100) {
            billAmount = unitsConsumed * 1;
        }

        return billAmount;
    }

    public static void main(String[] args) {
        ElectricityBill bill = new ElectricityBill(12345, "John Doe", 1000, 1100);
        double amount = bill.calculateBillAmount();
        System.out.println("Bill Amount: Rs. " + amount);
    }
}
