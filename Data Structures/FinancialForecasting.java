import java.util.Scanner;

public class FinancialForecasting {

    public static double futureValue(double amount, double rate, int years) {
        if (years == 0) {
            return amount;
        }
        return futureValue(amount * (1 + rate), rate, years - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Financial Forecasting Tool");

        try {
            System.out.print("Enter initial amount: $");
            double initialAmount = scanner.nextDouble();

            System.out.print("Enter annual growth rate (e.g., 0.05 for 5%): ");
            double annualRate = scanner.nextDouble();

            System.out.print("Enter number of years to forecast: ");
            int years = scanner.nextInt();

            double result = futureValue(initialAmount, annualRate, years);

            System.out.printf("Projected value after %d years: $%.2f%n", years, result);

        } catch (Exception e) {
            System.out.println("Invalid input. Please enter numbers only.");
        }

        scanner.close();
    }
}