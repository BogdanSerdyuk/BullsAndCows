import java.util.Map;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        String input = new Scanner(System.in).next();
        var answer = Map.of(
                "1", "You have chosen a square",
                "2", "You have chosen a circle",
                "3", "You have chosen a triangle",
                "4", "You have chosen a rhombus"
        ).getOrDefault(input, "There is no such shape!");
        System.out.println(answer);
    }
}