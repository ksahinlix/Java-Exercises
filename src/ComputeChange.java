import java.util.Scanner;
public class ComputeChange {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the money that you have:");

        double money = input.nextDouble();
        System.out.println(money*10);

        /*double totalPennies = money * 100;

        int totalDollars = (int)totalPennies / 100;

        int remainingPennies = (int)totalPennies % 100;

        int totalQuarters = remainingPennies / 25;

        remainingPennies %=25;

        int totalDimes = remainingPennies / 10;

        remainingPennies %=10;

        int totalNickels = remainingPennies / 5;

        remainingPennies %=5;

        int  justPennies = remainingPennies;

        System.out.println("Total Money: " + money + " Total Dollars: " + totalDollars +
                " Total Quarters: " + totalQuarters + " Total Dimes: " + totalDimes +
                " Total Nickels: " + totalNickels + " Total Pennies: " + remainingPennies );

*/






    }
}
