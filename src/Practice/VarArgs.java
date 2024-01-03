package Practice;

import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        fun(1,2,3,34,4,3,1,111,13);

    }
    static  void fun(float ...b){
        System.out.println(Arrays.toString(b));
    }
}
