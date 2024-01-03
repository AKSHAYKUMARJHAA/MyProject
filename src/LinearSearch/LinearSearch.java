package LinearSearch;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {1, 33, 4, 25, 6, -2, -23};
        int ans = linearSearch(arr, 25);
        System.out.println(ans);
/*
        int ans2=linearSearch2(arr,4);
        System.out.println(ans2);
        boolean ans3=linearSearch3(arr,4);
        System.out.println(ans3);
*/

    }

    static int linearSearch(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }
        for (int element : arr) {
            if (element == target) {
                return element;
            }
        }
        return -1;
    }

        static int linearSearch2(int[] arr, int target) {
            if (arr.length == 0) {
                return -1;
            }
            for (int index = 0; index < arr.length; index++) {
                int element = arr[index];
                if (element == target) {
                    return index;
                }
            }
            return -1;
        }

    static boolean linearSearch3(int[] arr, int target) {
        if (arr.length == 0) {
            return false;
        }
        for (int index = 0; index < arr.length; index++) {
            int element = arr[index];
            if (element == target) {
                return true;
            }
        }
        return false;
    }
}
