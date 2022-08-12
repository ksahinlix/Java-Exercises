import java.util.Scanner;

public class LoanPaymentTable {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter loan amount:");
        int amount = input.nextInt();
        System.out.println("Please enter number of years");
        int years = input.nextInt();
        double yearlyInterest = 5.00;
        double monthlyInterest;
        double monthlyPayment;
        double totalPayment;
        System.out.println("Interest Rate Monthly Payment Total Payment");
        while(5.00 <= yearlyInterest && yearlyInterest <= 8.00){

            monthlyInterest =yearlyInterest / 1200;
            monthlyPayment = amount * monthlyInterest / (1 - 1 / Math.pow(1 + monthlyInterest, years * 12));
            totalPayment = monthlyPayment * years * 12;
            System.out.printf("%9.4f%% %14.2f %14.2f \n", yearlyInterest, monthlyPayment, totalPayment);
            yearlyInterest += 0.125;
        }
    }
}
