import java.util.Scanner;
public class MultipleSubstraction {
    public static void main(String[] args) {
     final int noq = 5;
     Scanner input = new Scanner(System.in);
     int number1,number2,answer,temp;
     int qcount=0;
     int correct=0;
     long start = System.currentTimeMillis();
     long end;
     String output="";
     double spenttime;
         while(qcount<noq){
             number1=(int)(Math.random()*101);
             number2=(int)(Math.random()*101);
                 if(number1<number2){
                     temp = number2;
                     number2=number1;
                     number1=temp;
                 }
                 System.out.println("What is the result of: " + number1 + " - " + number2);
                 answer = input.nextInt();
                 if(number1-number2==answer){
                     System.out.println("You are correct");
                     correct++;
                 }else{
                     System.out.println("Your answer is wrong! \n" + "The answer should be: " + (number1 - number2));}

                 output+="\n" + number1 + " - " + number2 + " = " + answer  +" was"+ ((number1 - number2 == answer ) ? " correct":" wrong") ;
             qcount++;

         }
         end = System.currentTimeMillis();
         spenttime =((double)(end - start) / 1000);
         System.out.printf("\nTime spent: %5.2f seconds \nCorrect answers: %d %s",spenttime, correct, output);
    }
}
