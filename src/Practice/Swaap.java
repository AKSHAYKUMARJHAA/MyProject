package Practice;

import java.util.Arrays;
public class Swaap {
    public static void main(String[] args) {
        int[] arr={1,2,34,4,5};
        swaap(arr,1,2);
        System.out.println(Arrays.toString(arr));
    }
    static void swaap(int[] arr,int index1,int index2){
        int temp=arr[index1];
        arr[index1]=arr[index2];
        arr[index2]=temp;
    }
}
