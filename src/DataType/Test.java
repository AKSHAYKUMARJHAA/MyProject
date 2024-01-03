package DataType;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner anand=new Scanner(System.in);
        System.out.println("Enter the three Number:");
        int a=anand.nextInt();
        int b=anand.nextInt();
        int c=anand.nextInt();
        int sum=a+b+c;
        System.out.println("Ans=" +sum);
    }
}
