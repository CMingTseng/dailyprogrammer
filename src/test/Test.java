package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Simin
 */
public class Test {
    private static Integer[] a;

    public static void main(String[] args) {
        if (a == null)
            throw new NullPointerException();
       // list(a);
        System.out.println("yay");
    }

    private static List<Integer> list(Integer[] a) {
        List<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(a));
        return list;
    }
}
