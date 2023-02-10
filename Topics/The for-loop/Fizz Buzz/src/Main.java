import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        /*Scanner scanner = new Scanner(System.in);
        int start = scanner.nextInt();
        int end = scanner.nextInt();

        for(int i = start; i <= end; i++) {
            if (i % 5 == 0 && i % 3 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }

        int number = 10;
        for (int i = 0; i < number; i++) {
            for (int j = 0; j < number; j++) {
                System.out.print(j + " ");
                if (j == i) {
                    break;
                }
            }
            System.out.println();
        }

        int n = 10;
        for (int i = 0; i < n; i++) {
            if (i % 2 != 0) {
                continue;
            }
            System.out.print(i + " ");
        }*/

        String name1 = "Bohdan";
        String name2 = "Serdiuk";

        String nameAndSurname = name1.concat(" ").concat(name2);
        System.out.println(nameAndSurname);
        byte[] nameArray = name1.getBytes();
        for (int i = 0; i < nameArray.length; i++) {
            System.out.print((char) nameArray[i] + " ");
        }



    }
}