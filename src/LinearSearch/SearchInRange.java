package LinearSearch;

public class SearchInRange {
    public static void main(String[] args) {
        int[] arr={18,12,-7,2,9,-86,22,8,13,-6};
        System.out.println(linearSearch3(arr,8,3,8));
    }
    static int linearSearch3(int[] arr, int target,int start,int end) {
        if (arr.length == 0) {
            return -1;
        }
        for (int index = start; index <=end; index++) {
            int element = arr[index];
            if (element == target) {
                return index;
            }
        }
        return -1;
    }
}
