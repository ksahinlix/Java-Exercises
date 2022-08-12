public class FirstXPrimeNumber {
    public static void main(String[] args) {
        int divisorCount = 0;
        final int numberOfPrimeNumber = 200;
        int countOfPrimeNumber = 0;
        int candidateNumber = 2;
        int divisor;
        boolean isPrime;
        String s = "";
        while (countOfPrimeNumber < numberOfPrimeNumber) {
            for (divisor = 1; divisor <= (candidateNumber / 2); divisor++) {
                if (candidateNumber % divisor == 0)
                    divisorCount++;
                if(divisorCount>2)
                    break;
            }
            if (divisorCount > 1) {
                isPrime = false;
            } else
                isPrime = true;

            if (isPrime) {
                countOfPrimeNumber++;
                if(candidateNumber<10){
                    s = (countOfPrimeNumber % 20) == 0 ? s + candidateNumber + "\n" : s + candidateNumber + "    ";
                }
                else if(candidateNumber>10 && candidateNumber<100){
                    s = (countOfPrimeNumber % 20) == 0 ? s + candidateNumber + "\n" : s + candidateNumber + "   ";
                }
                else if(candidateNumber>100 && candidateNumber<1000){
                    s = (countOfPrimeNumber % 20) == 0 ? s + candidateNumber + "\n" : s + candidateNumber + "  ";
                }
                else {
                    s = (countOfPrimeNumber % 20) == 0 ? s + candidateNumber + "\n" : s + candidateNumber + " ";
                }
            }
            divisorCount = 0;
            candidateNumber++;
        }
        System.out.println(s);

    }
}

