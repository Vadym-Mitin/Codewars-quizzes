package org.wte.quizzes;

/**
 * You probably know the "like" system from Facebook and other pages.
 * People can "like" blog posts, pictures or other items.
 * We want to create the text that should be displayed next to such an item.
 * <p>
 * Implement a function likes :: [String] -> String, which must take in input array,
 * containing the names of people who like an item.
 * It must return the display text as shown in the examples:
 * <p>
 * likes {} // must be "no one likes this"
 * likes {"Peter"} // must be "Peter likes this"
 * likes {"Jacob", "Alex"} // must be "Jacob and Alex like this"
 * likes {"Max", "John", "Mark"} // must be "Max, John and Mark like this"
 * likes {"Alex", "Jacob", "Mark", "Max"} // must be "Alex, Jacob and 2 others
 */
public class WhoLikesIt {
    public static String whoLikesIt(String... names) {
        int length = names.length;
        if (length == 0)
            return "no one likes this";
        else {
            if (length > 3)
                return String.format("%s, %s and %d others like this", names[0], names[1], length - 2);
            else if (length == 3) return String.format("%s, %s and %s like this", names[0], names[1], names[2]);
            else if (length == 2) return String.format("%s and %s like this", names[0], names[1]);
            else return String.format("%s likes this", names[0]);
        }
    }
}
