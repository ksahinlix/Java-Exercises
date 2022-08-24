import java.util.Scanner;


/*
                 1
              2  1
           3  2  1
        4  3  2  1
     5  4  3  2  1
  6  5  4  3  2  1
 */
public class DiplayPatternWithMethod {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter an integer for displaying pattern: ");
        int patterncount = input.nextInt();

        displayPattern(patterncount);
    }
    public static void displayPattern(int n){
        for(int k = 1; k <= n; k++) {
            for (int i = k; 1 <= n - i; i++) {
                System.out.print("   ");
            }
            for (int j = k; 1 <= j; j--) {
                System.out.printf("%3d", j);
            }
            System.out.println();
        }
    }
}
