package Practice;

import java.util.Scanner;

public class BirthdateYear {
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
        int leap_years = 0;
        int non_leap_years=0;
        for (int year = birthdate_year-1; year < current_year; year++) {
            c = isLeap(year);
            if (c[1] == 29) {
                leap_years++;
            }else {
                non_leap_years++;
            }
        }
        int total_day_in_years = non_leap_years *365 + leap_years*366;

        int start_end = (c[birthdate_year-1]- current_day)+birthdate_day;
        days += total_day_in_years;
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
