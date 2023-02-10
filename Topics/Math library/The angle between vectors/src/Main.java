import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int vx = in.nextInt();
        int vy = in.nextInt();
        int ux = in.nextInt();
        int uy = in.nextInt();

        int num = (vx*ux + vy*uy);
        double den = (Math.sqrt(Math.pow(vx, 2) + Math.pow(vy, 2)) * (Math.sqrt(Math.pow(ux, 2) + Math.pow(uy, 2))) );
        double cos =  num / den;
        double result = Math.acos(cos);
        System.out.println((int) Math.toDegrees(result));



    }
}
