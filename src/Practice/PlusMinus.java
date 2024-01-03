package Practice;

import java.util.Scanner;

public class PlusMinus {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        plusMinus(arr);
    }

    private static void plusMinus(int[] arr) {
        int positiveCount=0;
        int negativeCount=0;
        int zeroCount=0;
        int n=arr.length;
        for (int i=0;i<arr.length;i++){
            if(arr[i]>0){
                positiveCount++;
            } else if (arr[i]<0) {
                negativeCount++;
            }else {
                zeroCount++;
            }
            System.out.println((float) positiveCount/arr.length);
            System.out.println((float) negativeCount/arr.length);
            System.out.println((float) zeroCount/arr.length);
        }
    }
}
