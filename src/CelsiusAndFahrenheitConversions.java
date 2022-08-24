public class CelsiusAndFahrenheitConversions {
    public static void main(String[] args) {
        double celcius=40;
        double fahrenheit=120;
        System.out.println("Celsius   Fahrenheit\t\t|\t\tFahrenheit   Celcius");
        System.out.println("----------------------------------------------------------");
        for (int k = 1; k <= 10;k++){
            System.out.printf("%-10.1f%-10.1f\t\t|\t%9.1f%13.2f\n",celcius, celsiusToFahrenheit(celcius), fahrenheit, fahrenheitToCelsius(fahrenheit) );
            celcius -= 1;
            fahrenheit -= 10;
        }

    }
    public static double celsiusToFahrenheit(double celsius){
        double fahrenheit = (9.0 / 5 ) * celsius + 32;
        return fahrenheit;
    }
    public static double fahrenheitToCelsius(double fahrenheit){
        double celsius = (5.0 / 9 ) * (fahrenheit - 32);
        return celsius;
    }
}
