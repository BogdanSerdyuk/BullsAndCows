package bullscows;

public class Main {
    public static void main(String[] args) {
        try {
            new Application().execute();
        } catch (CodeException e) {
            System.out.println(e.getMessage());
        }
    }
}

