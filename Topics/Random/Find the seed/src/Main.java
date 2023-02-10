import java.util.*;

public class Main {

    int seed1;
    int seed2;
    int N;
    int K;

    Main(int seed1, int seed2, int N, int K) {
        this.seed1 = seed1;
        this.seed2 = seed2;
        this.N = N;
        this.K = K;
    }
    public static void main(String[] args) {
        int[] values = inputTheValues();
        Main main = new Main(values[0], values[1], values[2], values[3]);

        Map<Integer, Integer> seedAndMaxValue = new HashMap<>();
        for (int i = main.seed1; i <= main.seed2 + 1; i++) {
            Random random = new Random(i);
            int[] results = new int[main.N];
            for (int j = 0; j < main.N; j++) {
                results[j] = random.nextInt(main.K);
            }
            int max = Integer.MIN_VALUE;
            for (int num: results) {
                if (num > max) {
                    max = num;
                }
            }
            seedAndMaxValue.put(i, max);
        }

        int min = Integer.MAX_VALUE;
        int seed = 0;
        for (Map.Entry<Integer, Integer> entry: seedAndMaxValue.entrySet()) {
            if (entry.getValue() < min) {
                min = entry.getValue();
                seed = entry.getKey();
            }
        }

        System.out.print(seed + "\n" + min);
    }


    private static int[] inputTheValues() {
        String[] inputValues = new Scanner(System.in).nextLine().split(" ");
        int[] numberValues = new int[inputValues.length];
        for (int i = 0; i < inputValues.length; i++) {
            numberValues[i] = Integer.parseInt(inputValues[i]);
        }
        return numberValues;
    }
}
