public class CountInLetters {
    public static void main(String[] args) {
        char letters[] = new char[100];
        int count[] = new int[26];
        for(int i = 0; i < letters.length; i++){
          letters[i] = RandomCharacter.getRandomLowerCaseCharacter();
            if ((i + 1) % 20 == 0)
            System.out.println(letters[i] + " ");
            else
            System.out.print(letters[i] + " ");
        }
        for(int i = 0; i < letters.length; i++){
            count[letters[i] - 'a'] += 1;
        }

        System.out.println("----------------------------------------------------");
        for (int i = 0; i < count.length;i++) {
            if ((i + 1) % 10 == 0)
                System.out.println(count[i] + " " + (char)(i + 'a'));
            else
                System.out.print(count[i] + " " + (char)(i + 'a') + " ");
        }
    }
}
