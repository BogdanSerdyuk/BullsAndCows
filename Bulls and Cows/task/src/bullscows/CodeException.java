package bullscows;

public class CodeException extends Exception {
    public CodeException(String message) {
        super("Error: " + message);
    }
}
