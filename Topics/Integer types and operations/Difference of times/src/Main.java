import java.time.Duration;
import java.time.LocalTime;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        /*
        Scanner sc = new Scanner(System.in);
        System.out.println(Duration.between(
                LocalTime.of(sc.nextInt(), sc.nextInt(), sc.nextInt()),
                LocalTime.of(sc.nextInt(), sc.nextInt(), sc.nextInt())
        ).toSeconds());
        */

        char ch = 'e';
        ch -= 'a';
        ch++;
        ch += 'b';
        System.out.println(ch);
    }
}