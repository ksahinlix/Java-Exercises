public class HeadsAndTails {
    public static void main(String[] args) {
        int result;
        int heads = 0;
        int tails = 1;
        for(int i = 1; i < 1000000; i++){
            result = (int) (Math.random() * 2);
            if(result == 1)
                heads += 1;
            else
                tails +=1 ;
        }

        System.out.println("Heads are:" + heads + " Tails are :" + tails );
    }
}
