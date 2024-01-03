package BinarySearch;

public class InfiniteArray {
    public static void main(String[] args) {
        int arr[]={3,5,7,8,9,10,15,29,32,43,49,55,59,62,65,90,110,170};
        int target =10;
        System.out.println(ans(arr,target));
    }
    static int ans(int[] arr,int target){
        //find the range
        //first start with a box of size 2
        int start=0;
        int end=1;

        //condition for the target to lie in the range
        while (target>arr[end]){
            int newStart=end+1;    //this is the new start
            //double the box value
            //end = previous end + sizeofbox * 2
            end=end+(end-start+1)*2;
            start=newStart;
        }
        return binarySearch(arr,target,start,end);
    }
    static int binarySearch(int[] arr, int target,int start,int end) {
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
