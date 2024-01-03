package Practice;

import java.util.Scanner;

public class Birthdate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the current date (dd mm yy): ");
        int current_day = sc.nextInt();
        int current_month = sc.nextInt();
        int current_year = sc.nextInt();

        System.out.println("Enter the birthdate (dd mm yy): ");
        int birthdate_day = sc.nextInt();
        int birthdate_month = sc.nextInt();
        int birthdate_year = sc.nextInt();

        int days = 0;
        int[] c = isLeap(birthdate_year);
        int sum=0;
        for (int i = current_month; i < birthdate_month; i++) {
            sum=sum+c[i];
        }
        //System.out.println(sum);
        int start_end_days = (c[current_month-1]- current_day)+birthdate_day;
        days = sum+ start_end_days;
        System.out.println(days);
    }

    private static int[] isLeap(int year) {
        int[] a = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int[] b = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            return a;
        } else {
            return b;
        }
    }
}