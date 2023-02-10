import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.next();

        String vowels = "aeiouy";

        int counterVowels = 0;
        int counterConsonants = 0;

        int result = 0;

        for (char ch : word.toCharArray()) {
            if (vowels.contains(Character.toString(ch))) {
                counterVowels++;
                counterConsonants = 0;
            }
            else {
                counterConsonants++;
                counterVowels = 0;
            }

            if (counterConsonants == 3) {
                result++;
                counterConsonants = 1;
            }

            if (counterVowels == 3) {
                result++;
                counterVowels = 1;
            }

        }

        System.out.println(result);

    }

}