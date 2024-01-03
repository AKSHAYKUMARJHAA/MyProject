package Practice;

public class StairCase {
    public static void main(String[] args) {
        pattern(5);
    }

        /* n=4        space   |   symbol
        ___#           3           1
        __##           2           2
        _###           1           3
        ####           0           4*/

        /* n=4        space   |   symbol
        ___1           3           1
        __22           2           2
        _333           1           3
        4444           0           4*/
/*
    int n=6;
        for (int k = 2; k <=n ; k++) {
            int space=n-k;
            for (int j = 0; j < space; j++) {
                System.out.print(".");
            }
            for (int i = 1; i < k; i++) {
                System.out.print(i);
            }
            System.out.println();
        }*/

        static void pattern ( int n){
            for (int row = 1; row <= n; row++) {

                for (int space = 0; space < n - row; space++) {
                    System.out.print(" ");
                }

                for (int col = row; col >= 1; col--) {
                    System.out.print(col);
                }
                for (int col = 2; col <= row; col++) {
                    System.out.print(col);
                }
                System.out.println();
            }
        }
    }
