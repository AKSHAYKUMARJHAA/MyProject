package Practice;

public class Swap {
    public static void main(String[] args) {
        int a=10;
        int b=20;
       /*
        int temp=a;
        a=b;
        b=temp;*/
        swap(1,2);
        System.out.println(a+" "+b);

        String name="Akshay Kumar";
        changeName(name);
        System.out.println(name);
    }

     static void changeName(String naam) {
        naam="Shashank";
    }

    static void swap(int a, int b){
        int temp=a;
        a=b;
        b=temp;
    }
}
