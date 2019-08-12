package org.wte.quizzes;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Take 2 strings s1 and s2 including only letters from ato z. Return a new sorted string, the longest possible, containing distinct letters,
 * <p>
 * each taken only once - coming from s1 or s2.
 * Examples:
 * a = "xyaabbbccccdefww"
 * b = "xxxxyyyyabklmopq"
 * longest(a, b) -> "abcdefklmopqwxy"
 * <p>
 * a = "abcdefghijklmnopqrstuvwxyz"
 * longest(a, a) -> "abcdefghijklmnopqrstuvwxyz"
 */
public class TwoToOne {
    public static String longest(String s1, String s2) {
        Set<Character> collect = s1.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.toSet());
        collect.addAll(s2.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.toSet())
        );
        Character[] a = collect.toArray(new Character[0]);
        Arrays.sort(a);
        return Arrays.toString(a).replaceAll("[^a-zA-Z]", "");
//        return (s1 + s2).chars().distinct().mapToObj(c -> String.valueOf((char) c)).sorted().collect(Collectors.joining());
    }
}
