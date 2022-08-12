import java.util.Scanner;

public class PrintCalenderForAnyYear {
    public static void main(String[] args) {

        int numberofdays;
        String nameofthemonth;
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the year");
        int year = input.nextInt();
        int formulayear = year - 1;
        String fst = String.valueOf(formulayear).substring(0,2);
        String lst = String.valueOf(formulayear).substring(2);
        int firsttwodigits = Integer.parseInt(fst);
        int lasttwodigits = Integer.parseInt(lst);
        int day = 1 + ((13 * 11 - 1) / 5) + lasttwodigits + (lasttwodigits / 4) + (firsttwodigits / 4) - (2 * firsttwodigits);

        if(day < 0){
            while (day <= 0){
                day +=7;
            }
        }
        day %= 7;
        for(int i = 1 ; i <= 12; i++){
            switch (i){
                case 1:
                    nameofthemonth="January";
                    numberofdays=31;
                    break;
                case 2:
                    nameofthemonth="February";
                    numberofdays = (year % 4) == 0 ? 29 : 28;
                    break;
                case 3:
                    nameofthemonth="March";
                    numberofdays=31;
                    break;
                case 4:
                    nameofthemonth="April";
                    numberofdays=30;
                    break;
                case 5:
                    nameofthemonth="May";
                    numberofdays=31;
                    break;
                case 6:
                    nameofthemonth="June";
                    numberofdays=30;
                    break;
                case 7:
                    nameofthemonth="July";
                    numberofdays=31;
                    break;
                case 8:
                    nameofthemonth="August";
                    numberofdays=31;
                    break;
                case 9:
                    nameofthemonth="September";
                    numberofdays=30;
                    break;
                case 10:
                    nameofthemonth="October";
                    numberofdays=31;
                    break;
                case 11:
                    nameofthemonth="November";
                    numberofdays=30;
                    break;
                case 12:
                    nameofthemonth="December";
                    numberofdays=31;
                    break;
                default:
                    nameofthemonth="There is a problem";
                    numberofdays=1;
            }
            System.out.printf("  %s,%d \n",nameofthemonth,year);
            System.out.println("  ---------------------------");
            System.out.println("  Sun Mon Tue Wed Thu Fri Sat ");
            for(int j = 0 ; j < day; j++) {
                System.out.print("    ");
            }

            for(int k = 1; k <= numberofdays; k++){

                System.out.printf("%4d",k);
                if((k + day) % 7 == 0){
                    System.out.println(" ");
                }
            }
            System.out.println("\n");

            day = (day +numberofdays) % 7;
        }

    }
}
