package LinearSearch;

public class EvenDigits {
    public static void main(String[] args) {
        int[] nums = {2, 1223, 111, 21211, 21, 33, 121};
        System.out.println(findNumbers(nums));
       // System.out.println(digits(236573));

    }
    static int findNumbers(int[] nums) {
        int count = 0;
        for (int num : nums) {
            if (even(num)) {
                count++;
            }
        }
        return count;
    }
    //function to check that the no is even digit no or not
    static boolean even(int num) {
        int noOfDigits = digits(num);
        if (noOfDigits % 2 == 0) {
            return true;
        }
        return false;
    }
    //count number of digits in a number
    static int digits(int num) {
        if (num<0){
            num=num*-1;
        }
        if (num==0){
            return 1;
        }

        int count = 0;
        while (num > 0) {
            count++;
            num /= 10;
        }
        return count;
    }
}
