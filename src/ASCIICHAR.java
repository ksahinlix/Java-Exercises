import java.util.Scanner;
public class ASCIICHAR {
    public static void main(String[] args) {

       String s1 = "";
       char ch = ' ';
       for (int j = 0 ; j < 3; j++ ){
           int lt = 65 + (int)(Math.random() * 27);
           ch = (char)lt;
           s1 += ch;


       }
       int i = (int)(Math.random() * 1000);
       System.out.printf("%3s%03d", s1, i);


    }

}