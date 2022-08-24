/*
      Roll two dice. Each die has six faces representing values 1, 2, …, and 6, respec-
      tively. Check the sum of the two dice. If the sum is 2, 3, or 12 (called craps), you
      lose; if the sum is 7 or 11 (called natural), you win; if the sum is another value
      (i.e., 4, 5, 6, 8, 9, or 10), a point is established. Continue to roll the dice until either
      a 7 or the same point value is rolled. If 7 is rolled, you lose. Otherwise, you win.
       */
public class CrapsGame {
    public static void main(String[] args) {
        int dice = getDice();

        if (dice == 7 || dice == 11) {
            System.out.println("You win!");
            System.exit(1);
        } else if (dice == 2 || dice == 3 || dice == 12) {
            System.out.println("You Lost");
            System.exit(2);
        }
        System.out.println("Dice is : " + dice);
        int dice2 = dice;
        do {
            dice = getDice();
        } while ((7 != dice) && (dice2 != dice));
        if(dice == 7){
            System.out.println("You lost");
        }else
            System.out.println("You win");

    }
    public static int getDice(){
        int number1 = (int)( 1 + Math.random() * 6);
        int number2 = (int)( 1 + Math.random() * 6);
        System.out.println("You rolled: " +  number1 + " and " + number2 + " total is : " + ( number1 + number2));
        return number1+number2;
    }
}
