import java.util.Scanner;

class Tax {
    double income;

    Tax(double income) {
        this.income = income;
    }

    double calculateTax() {
        return 0;
    }
}

class TaxCalculator extends Tax {
    TaxCalculator(double income) {
        super(income);
    }

    double calculateTax() {
        if (income <= 250000) {
            return 0;
        } else if (income > 250000 && income <= 500000) {
            return (income - 250000) * 0.1;
        } else if (income > 500000 && income <= 1000000) {
            return 25000 + (income - 500000) * 0.2;
        } else {
            return 75000 + (income - 1000000) * 0.3;
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the income: ");
        double income = scanner.nextDouble();

        TaxCalculator taxCalculator = new TaxCalculator(income);
        double tax = taxCalculator.calculateTax();

        System.out.println("Taxable Income: " + tax);
    }
}
