import java.util.Scanner;

public class MaxOccuredLetterInString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a string:");
        String s = input.nextLine();
        getMaxOccuringLetter(s);

    }
    public static void getMaxOccuringLetter(String s){
        int temp= 0;
        int max = 0;
        char m=' ';
        for(int i =0; i < s.length() - 1; i++ ){
            for(int k = 0; k < s.length() - 1; k++){
                if(s.charAt(i) == s.charAt(k))
                    temp++;
            }
            if(max <= temp){
                max = temp;
                m = s.charAt(i);
            }
            temp = 0;
        }
        System.out.println("Max occured char is: " + m + " and " + max + " times occured.");
    }
}
