import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        int start = scanner.nextInt();
        int end = scanner.nextInt();

        System.out.println(word.substring(start, end + 1));

        char[] chars = {'A','B','C'};
        String wordFromChars = String.valueOf(chars);
        System.out.println(wordFromChars);

    }
}