import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int amount = scanner.nextInt();
        int max = 0;
        for (int i = 0; i < amount; i++) {
            int temp = scanner.nextInt();
            if (temp > max && temp % 4 == 0) {
                max = temp;
            } 
        }
        System.out.println(max);
    }
}
