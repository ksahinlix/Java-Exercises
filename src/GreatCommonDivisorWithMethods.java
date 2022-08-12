import  java.util.Scanner;
public class GreatCommonDivisorWithMethods {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first integer: ");
        int number1 = input.nextInt();
        System.out.println("Enter second integer: ");
        int number2 = input.nextInt();
        calculateGreatCommonDivisor(number1,number2);


    }
    public static void calculateGreatCommonDivisor(int a, int b){
       int gdc = 1;
        if(b>a){
            int temp = a;
            a = b;
            b = temp;
        }
        for(int i = 1; i<=b; i++ ){
            if(b % i == 0 && a % i == 0 ){
                gdc = i;
            }
        }
        System.out.println("Great common divisor for " + a + " and " + b + " is: " + gdc);

    }
}
