import java.util.Scanner;

public class SortThreeDoubleNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter three double value:");
        double num1 = input.nextInt();
        double num2 = input.nextInt();
        double num3 = input.nextInt();
        displayPattern(num1,num2,num3);


    }
    public static void displayPattern(double num1, double num2, double num3){
        double temp = 0;
        if(num2 <= num1){
            temp = num1;
            num1 = num2;
            num2 = temp;
        }
        if(num3 <= num2){
            temp=num2;
            num2=num3;
            num3=temp;
        }
        if(num2 <= num1){
            temp = num1;
            num1 = num2;
            num2=temp;
        }
        System.out.println("Sorted numbers: " + num1 +" " + num2 +" "+ num3);
    }
}
