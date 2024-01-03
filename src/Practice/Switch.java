package Practice;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String fruit=sc.next();

        switch (fruit){
            case "Mango":
                System.out.println("King of fruits");
                break;
            case "Apple":
                System.out.println("Fruits with lots of benefits");
            case "Banana":
                System.out.println("Very sweet fruit");
            case "Grapes":
                System.out.println("Small fruits");
            case "Orange":
                System.out.println("Round fruit");
                break;
            default:
                System.out.println("Please enter valid fruit");
        }
    }
}
