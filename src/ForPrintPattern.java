import java.util.Scanner;
public class ForPrintPattern {
    public static void main(String[] args) {
        /*
        output for 6 is looks like at the below:
                1 2 3 4 5 6
                  1 2 3 4 5
                    1 2 3 4
                      1 2 3
                        1 2
                          1
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of lines : ");
        int numberOfLines = input.nextInt();

        for(int rows = 0; rows < numberOfLines; rows++){
            for(int k = rows; 1 <= k; k--){
                System.out.print("  ");
            }
            for(int i = 1; i <= numberOfLines - rows; i++ ){
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}

