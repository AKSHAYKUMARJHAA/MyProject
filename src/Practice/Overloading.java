package Practice;

public class Overloading {
    public static void main(String[] args) {
        fun(12);
        //fun("Akshay");
        sum(2, 5);
        sum(1, 2, 3);

    }

    static void sum(int a, int b) {
        int c = a + b;
        System.out.println(c);
    }

    static void sum(int a, int b, int c) {
        int d = a + b + c;
        System.out.println(d);
    }

    static void fun(int a) {
        System.out.println(a);
    }

    static void fun(String name) {
        System.out.println(name);
    }
}
