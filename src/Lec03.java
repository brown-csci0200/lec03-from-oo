package src;

import src.FuncList;

public class Lec03 {

    public static int product(FuncList<Integer> nums) {
        return nums.first() * product(nums.rest());
    }

    static <E> FuncList<E> toFuncList(E... args) {
        return new FuncList<E>(args);
    }

    public static void main(String[] args) {

        FuncList<Integer> y = new FuncList<Integer>(5, 8, 2, 3);
        System.out.println(y);
        System.out.println(product(y));

        FuncList<String> s = new FuncList<String>("yo", "hi", "at");
        System.out.println(s);

        System.out.println(toFuncList(1, 2, 3));
        System.out.println(toFuncList("F", "TR", "a"));
        System.out.println(toFuncList());
    }
}



