package LinearSearch;

public class FindMax {
    public static void main(String[] args) {
        int[] arr={18,23,87,1,9,-2,11};
        System.out.println(findMax(arr));
    }
    static int findMax(int[] arr){
        if (arr.length==0){
            return -1;
        }
        int ans=arr[0];
        for (int i = 1; i <arr.length ; i++) {
            if (ans<arr[i]){
                ans=arr[i];
            }
        }
        return ans;
    }
}
