package org.wte.quizzes;

import java.util.stream.Stream;

/**
 * Task
 * Given a string str, reverse it omitting all non-alphabetic characters.
 * <p>
 * Example
 * For str = "krishan", the output should be "nahsirk".
 * <p>
 * For str = "ultr53o?n", the output should be "nortlu".
 * <p>
 * Input/Output
 * [input] string str
 * <p>
 * A string consists of lowercase latin letters, digits and symbols.
 * <p>
 * [output] a string
 */
public class ReverseLetter {

    public static String reverseLetter(final String str) {
        String s = str.replaceAll("[^a-zA-Z]+", "");
        char[] chars = s.toCharArray();
        char[] result = new char[chars.length];
        for (int i = 0; i < chars.length; i++) {
            result[i] = chars[chars.length - i - 1];
        }
        return new String(result);
//        return new StringBuilder(s.replaceAll("[^a-zA-Z]", "")).reverse().toString();
    }
}
