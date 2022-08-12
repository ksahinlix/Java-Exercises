import java.util.Scanner;
public class GuessNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int nim = 1 + (int)(Math.random() * 100);

        System.out.println("Guess a magic number between 0 and 100");
        int guess=317;

        while (nim != guess){
            System.out.print("Enter your guess: ");
            guess = input.nextInt();
            if (nim > guess )
                System.out.println("Your guess is to low");
            else if(nim < guess)
                System.out.println("Your guess is too high");

        }
        System.out.println("Yes the number is: " + guess);
    }
}
