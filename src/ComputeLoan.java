import java.util.Scanner;
public class ComputeLoan {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter annual interest rate e.g 5.25%:");
        double annualInterestRate = input.nextDouble();

        double monthlyInterestRate= annualInterestRate/1200;

        System.out.println("Enter number of years as an  integer:");
        byte numberOfYears = input.nextByte();

        System.out.println("Enter loan amount:");
        double loanAmount = input.nextDouble();

        double monthlyPayment = loanAmount*monthlyInterestRate / (1 - 1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12));

        double totalPayment = monthlyPayment * 12 * numberOfYears;

        System.out.println("The mothly payment is: " +
                (int)(monthlyPayment * 100) / 100.0);

        System.out.println("The total payment is: " +
                (int)(totalPayment * 100) / 100.0);

            int a,b,c;
                a=b=c=1;
            double x = -b + Math.pow(Math.pow(b,2) - 4*a*c,0.5);
    }
}
