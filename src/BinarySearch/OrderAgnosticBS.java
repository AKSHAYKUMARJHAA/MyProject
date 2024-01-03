package BinarySearch;

public class OrderAgnosticBS {
    public static void main(String[] args) {
       // int[] arr = {-18, -12, -8, 0, 2, 6, 8, 11, 12, 15, 19, 25, 29, 31, 37, 39};
        int[] arr={99,60,51,48,35,33,29,21,11,9,8,5,3,1,0,-2};
        int target = 51;
        int ans=orderAgnosticBS(arr,target);
        System.out.println(ans);
    }

    static int orderAgnosticBS(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        boolean isAsc = arr[start] < arr[end];

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return mid;
            }
            if (isAsc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}
