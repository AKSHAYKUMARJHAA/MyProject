public class InnerClasses {
     static class Test{
         static int non;
        public Test(int no){
            this.non=this.non  +  no;
        }
    }

    public static void main(String[] args) {
        Test t1=new Test(1);
        System.out.println(t1.non);
        Test t2=new Test(1);
        System.out.println(t2.non);
    }
}
