import java.util.Scanner;

public class isPalindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter an integer:");
        int num = input.nextInt();

        System.out.println(isPalindrome(num));
    }
    public static int reverse(int n){
        String temp = "";
        while (n !=0 ){
            temp += n%10;
            n /= 10;
        }
        return Integer.parseInt(temp);
    }
    public static boolean isPalindrome(int n){
        return n == reverse(n);
    }
}
