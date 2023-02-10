package bullscows;

public class Grade {
    private final int length;
    private int bulls;
    private int cows;

    public Grade(int length, int bulls, int cows) {
        this.length = length;
        this.bulls = bulls;
        this.cows = cows;
    }

    public Grade(int length) {
        this.length = length;
        this.bulls = 0;
        this.cows = 0;
    }

    public void addBull() {
        bulls++;
    }

    public void addCow() {
        cows++;
    }

    public boolean isSolved() {
        return bulls == length;
    }

    @Override
    public String toString() {
        String text = "Grade:";
        if (bulls > 0 && cows > 0) {
            return String.format("%s %d bull(s) and %d cow(s).", text, bulls, cows);
        } else if (bulls > 0) {
            return String.format("%s %d bull(s).", text, bulls);
        } else if (cows > 0) {
            return String.format("%s %d cow(s).", text, cows);
        }
        return text + " None.";
    }
}
