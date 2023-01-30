package src;

import java.util.Arrays;
import java.util.List;

public class attic {
    /* The context is a list of strings representing words in a document */

    public class Lec03at {

        // concat all words in list separated by spaces
        String concatAll(FuncList<String> words) {
            if (words.isEmpty()) {
                return "";
            } else {
                return words.first() + " " + concatAll(words.rest());
            }
        }

        Boolean anyLongWords(FuncList<String> words) {
            if (words.isEmpty()) {
                return false;
            } else {
                return (words.first().length() > 10) || anyLongWords(words.rest());
            }
        }

        public static int product(FuncList<Integer> nums) {
            if (nums.isEmpty()) {
                return 1;
            } else {
                return nums.first() * product(nums.rest());
            }
        }

        static <E> FuncList<E> toFuncList(E... args) {
            return new FuncList<E>(args);
        }

        public static void main(String[] args) {
            List<Integer> x = Arrays.asList(5, 6, 7, 8);
            System.out.println(x);

            FuncList<Integer> y = new FuncList<Integer>(5, 8, 2, 3);
            System.out.println(y);

            FuncList<String> s = new FuncList<String>("yo", "hi", "at");
            System.out.println(s);

            System.out.println(toFuncList(1, 2, 3));
            System.out.println(toFuncList("F", "TR", "a"));
            System.out.println(toFuncList());
        }
    }
}
