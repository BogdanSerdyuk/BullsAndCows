import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();

        double p = (a + b + c) / 2;
        double resultOfHeronFormula = Math.sqrt(p * (p - a) * (p - b) * (p - c));

        System.out.println(resultOfHeronFormula);
    }
}