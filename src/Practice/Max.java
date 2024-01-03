package Practice;

public class Max {
    public static void main(String[] args) {
        int[] arr={1,2,34,44,22};
       // max(arr);
        System.out.println(max(arr));
    }
    static  int max(int[] arr){
        int maxVal=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>maxVal){
                maxVal=arr[i];
            }
        }
        //System.out.println(maxVal);
        return maxVal;
    }

}
