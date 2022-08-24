import java.util.Scanner;
public class AJustRun {
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
            } while (dice != 7 && dice2 != dice);
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



