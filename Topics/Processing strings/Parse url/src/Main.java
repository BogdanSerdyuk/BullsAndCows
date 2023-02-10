import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        String[] url = new Scanner(System.in).nextLine().replace("=", " : ").split("[&?]");
        boolean isPass = false;
        String passValue = "";

        for (String word : url) {
            if (word.startsWith("https")) {
                continue;
            }
            if (word.startsWith("pass")) {
                isPass = true;
                passValue = word.substring(7);
            }
            if (word.endsWith(" : ")) {
                System.out.println(word + "not found");
            } else {
                System.out.println(word);
            }
        }
        if (isPass) {
            System.out.printf("%s : %s", "password", passValue);
        }


    }
}
