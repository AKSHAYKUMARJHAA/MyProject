package PatternProblems;

public class Pattern2 {
    public static void main(String[] args) {
        pattern5(4);
    }

    static void pattern1(int n){
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <=n ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern2(int n){
        for (int row = 1; row <= n ; row++) {
            for (int col = 1; col <= row ; col++) {
                System.out.print("#");
            }
            System.out.println();
        }
    }

    static void pattern3(int n){
        for (int i = 1; i <=n ; i++) {
            for (int j = n; j >=i ; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
    static void pattern4(int n){
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <= i ; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    static void pattern5(int n){
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
