import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputLine = scanner.nextLine();
        String[] valuesFromInput = inputLine.split(" ");
        switch (valuesFromInput[1]) {
            case "+" -> System.out.println(Long.parseLong(valuesFromInput[0]) + Long.parseLong(valuesFromInput[2]));
            case "-" -> System.out.println(Long.parseLong(valuesFromInput[0]) - Long.parseLong(valuesFromInput[2]));
            case "/" -> {
                if (Long.parseLong(valuesFromInput[2]) == 0) {
                    System.out.println("Division by 0!");
                } else {
                    System.out.println(Long.parseLong(valuesFromInput[0]) / Long.parseLong(valuesFromInput[2]));
                }
            }
            case "*" -> System.out.println(Long.parseLong(valuesFromInput[0]) * Long.parseLong(valuesFromInput[2]));
            default -> System.out.println("Unknown operator");
        }
    }
}