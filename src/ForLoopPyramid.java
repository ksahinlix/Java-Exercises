import java.util.Scanner;
public class ForLoopPyramid {
    public static void main(String[] args) {
        //printfs are for better looking
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of lines : ");
        int numberOfLines = input.nextInt();

        for(int rows = 1 ; rows <= numberOfLines; rows++){
            for(int i = numberOfLines - rows; 1 <= i ; i-- ){
                System.out.print("    ");
            }
            for(int k = 1 ; k < rows ; k++){
                System.out.printf("%4d",(int)Math.pow(2,k-1));
            }
            for(int j = rows ; 1 <= j; j-- ){
                System.out.printf("%4d",(int)Math.pow(2,j-1));
            }
            System.out.println();
        }
    }
}

