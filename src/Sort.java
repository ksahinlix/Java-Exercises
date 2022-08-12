import java.util.Scanner;
public class Sort {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter 1 number");

        int number = input.nextInt();
        String nmb= Integer.toString(number);
        int size = nmb.length();
        System.out.println(size);
       // int b = input.nextInt();
        int reverse=0;
        int remainder;
        do{
            remainder= number%10;
            reverse = reverse*10 + remainder;
            number /=10;
            System.out.println(reverse);

        } while(number!=0);
    }
}
