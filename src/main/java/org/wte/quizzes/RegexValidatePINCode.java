package org.wte.quizzes;

/**
 * @author Vadym Mitin
 */
public class RegexValidatePINCode {
    public static boolean validatePin(String pin) {
        String eq4 = "\\d{4}";
        String eq6 = "\\d{6}";

        return pin.matches(eq4) || pin.matches(eq6);
//       return pin.matches("\\d{4}|\\d{6}")
    }

}
