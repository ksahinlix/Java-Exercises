import java.util.Scanner;

public class MaximumNumberAndCount {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int number = 1;
        int max=0;
        int count=0;
        System.out.println("Please enter integers and 0 for exit");
        while (number != 0){
            number = input.nextInt();
            if (max < number){
                max = number;
                count = 1;
            } else if (max == number) {
                count++;
            }
        }
        System.out.println("Maximum number is: " + max + " Count is : " +count);
    }
}
