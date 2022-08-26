import java.util.Scanner;

public class AJustRun {
    public static void main(String[] args) {

        printMax(34, 3, 3, 2, 56.5);

        printMax(2, new double[]{1, 2, 3});
    }


    public static void printMax(int k, double... numbers) {

        if (numbers.length == 0) {
            System.out.println("No argument passed");
            return;
        }

        System.out.println(k);
        double result = numbers[0];


        for (int i = 1; i < numbers.length; i++)

            if (numbers[i] > result) result = numbers[i];

        System.out.println("The max value is " + result);
    }
}





