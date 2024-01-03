package LinearSearch;

public class FindMin {
    public static void main(String[] args) {
    int[] arr={12,-2,8,-7,88,81,61,5};
        System.out.println(findMin(arr));
    }
    static int findMin(int[] arr){
        if (arr.length==0){
            return -1;
        }
        int ans=arr[0];
        for (int i = 1; i <arr.length ; i++) {
            if (ans>arr[i]){
                ans=arr[i];
            }
        }
        return ans;
    }
}
