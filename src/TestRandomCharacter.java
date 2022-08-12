public class TestRandomCharacter {
    public static void main(String[] args) {
        final int NUMBER_OF_CHARS = 175;
        final int CHARS_PER_LINE = 25;

        for (int i = 0 ; i < NUMBER_OF_CHARS; i++){
            char ch = RandomCharacter.getRandomLowerCaseCharacter();
            if((i+1) % CHARS_PER_LINE == 0){
                System.out.println(ch);
            }
            else
                System.out.print(ch);
        }
        System.out.println();
        for (int i = 0 ; i < NUMBER_OF_CHARS; i++){
            char ch = RandomCharacter.getRandomCharacter();
            if((i+1) % CHARS_PER_LINE == 0){
                System.out.println(ch);
            }
            else
                System.out.print(ch);
        }
    }
}
