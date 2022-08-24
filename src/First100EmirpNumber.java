public class First100EmirpNumber {
    public static void main(String[] args) {
        int number = 2;
        int count = 1 ;
        int number0flines=1;
        while (count <= 100){
            if(isPrime(number) && isPrime(reverse(number))){
                System.out.printf("%4d ",number);
                count++;
                number0flines++;
            }if(number0flines % 11 == 0){
                System.out.println();
                number0flines = 1;
            }
            number++;
        }
    }
    public static boolean isPrime(int prime){
        for(int i = 2; i <= prime / 2; i++){
            if(prime % i == 0){
                return false;
            }
        }
        return true;
    }
    public static int reverse(int num){
        int result = 0;
        while(num != 0 ){
            result = result*10 + num % 10;
            num /= 10;
        }
        return result;
    }
}
