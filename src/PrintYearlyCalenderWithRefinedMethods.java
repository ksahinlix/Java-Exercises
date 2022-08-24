import java.util.Scanner;

public class PrintYearlyCalenderWithRefinedMethods {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a year: ");
        int year = input.nextInt();


        for (int i = 1; i <= 12; i++ ){
            printCalender(year,i);
        }

    }
    public static void printCalender(int year, int month){
        printMonth(year,month);
    }

    public static void printMonth(int year, int month) {
        printMontTitle(month,year);
        printMonthBody(year, month);
    }

    public static void printMontTitle(int month,int year) {
        System.out.println("        " + getMonthName(month) + ", " + year );
        System.out.println("----------------------------");
        System.out.println(" Sun Mon Tue Wed Thu Fri Sat");
    }

    public static void printMonthBody(int year,int month) {
        int startDay = getStartDay(year, month);
        int numberOfDaysInMonth = getTotalNumberOfDaysInMonth(year , month);
        int i;
        for(i = 0 ; i < startDay; i++){
            System.out.print("    ");
        }
        for (i = 1; i<=numberOfDaysInMonth; i++ ){
            if((i + startDay) % 7 == 0) {
                System.out.printf("%4d \n", i);
            }
            else
                System.out.printf("%4d",i);
        }
        System.out.println();
    }


    public static String getMonthName(int month){
        String monthName = "";
        switch (month){
            case 1: monthName="January"; break;
            case 2: monthName="February"; break;
            case 3: monthName="March"; break;
            case 4: monthName="April"; break;
            case 5: monthName="May"; break;
            case 6: monthName="June"; break;
            case 7: monthName="July"; break;
            case 8: monthName="August"; break;
            case 9: monthName="September"; break;
            case 10: monthName="October"; break;
            case 11: monthName="November"; break;
            case 12: monthName="December"; break;

        }
        return monthName;
    }
    public static int getStartDay(int year, int month){
        final int START_DAY_FOR_JAN_1_1800=3;
        int startDay = (getNumberOfDays(year,month) + START_DAY_FOR_JAN_1_1800) % 7;
        return startDay;
    }
    public static int getNumberOfDays(int year, int month){
        int totalDay = 0;
        for(int i = 1800; i<year; i++){
            if(isLapYear(i))
                totalDay += 366;
            else
                totalDay += 365;
        }
        for(int i = 1; i < month;i++){
            totalDay += getTotalNumberOfDaysInMonth(year,i);
        }
        return totalDay;
    }
    public static int getTotalNumberOfDaysInMonth(int year,int month ){
        int numberOfDaysInMonth = 0;

        if(month == 1 || month == 3 ||month == 5 || month == 7 || month == 8 ||month == 10 ||month == 12){
            numberOfDaysInMonth = 31;
        }
        else if( month == 4 || month == 6 || month == 9 || month == 11){
            numberOfDaysInMonth = 30;
        }
        else if (month == 2 ) {
            numberOfDaysInMonth = isLapYear(year) ? 29:28;
        }
        return numberOfDaysInMonth;
    }
    public static boolean isLapYear(int year){
        if(year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))
            return true;
        else
            return false;
    }
}
