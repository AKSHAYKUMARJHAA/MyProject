package Practice;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();

        list.add(12);
        list.add(121);
        list.add(112);
        list.add(122);
        list.add(222);
        list.add(22);
        list.add(322);
        list.add(232);

        list.set(0,99);
        list.remove(2);

        System.out.println( list.contains(22));
        System.out.println(list);

    }
}
