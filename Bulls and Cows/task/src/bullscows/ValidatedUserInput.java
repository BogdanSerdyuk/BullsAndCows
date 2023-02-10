package bullscows;

import java.util.Scanner;
import java.util.regex.Pattern;

public class ValidatedUserInput {
    private static final Pattern CODE_PATTERN = Pattern.compile("[0-9a-z]+");
    private final Scanner scanner = new Scanner(System.in);

    public int getInteger() throws CodeException {
        String input = scanner.nextLine();
        try {
            return Integer.parseInt(input);
        } catch (NumberFormatException e) {
            throw new CodeException(String.format("\"%s\" isn't a valid number.", input));
        }
    }

    public String getCodeString() throws CodeException {
        String input = scanner.nextLine();
        if (CODE_PATTERN.matcher(input).matches()) {
            return input;
        }
        throw new CodeException("Incorrect symbols!");
    }
}
