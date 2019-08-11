package org.wte.quizzes;

/**
 * This time no story, no theory. The examples below show you how to write function accum:
 * <p>
 * Examples:
 * <p>
 * accum("abcd") -> "A-Bb-Ccc-Dddd"
 * accum("RqaEzty") -> "R-Qq-Aaa-Eeee-Zzzzz-Tttttt-Yyyyyyy"
 * accum("cwAt") -> "C-Ww-Aaa-Tttt"
 * The parameter of accum is a string which includes only letters from a..z and A..Z.
 */
public class Accumul {
    public static String accum(String s) {
        StringBuilder sb = new StringBuilder();
        s = s.toLowerCase();
        for (int i = 0; i < s.length(); i++) {
            sb.append(Character.toUpperCase(s.charAt(i)));
            for (int j = 0; j < i; j++) {
                sb.append(s.charAt(i));
            }
            sb.append("-");
        }
        return sb.deleteCharAt(sb.length()-1).toString();
    }
}
