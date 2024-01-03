package BinarySearch;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {-18, -12, -8, 0, 2, 6, 8, 11, 12, 15, 19, 25, 29, 31, 37, 39};
        int target = 13;
        int ans = binarySearch(arr, target);
        System.out.println(ans);
    }
    static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target > arr[mid]) {
                start = mid + 1;
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}