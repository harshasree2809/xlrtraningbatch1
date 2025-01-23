public class demo015 {
   void swap(int a,int b){
        System.out.println("Before swapping of two elements:\na="+a+" b="+b);
        int temp=a;
        a=b;
        b=temp;
        System.out.println("After swapping of two elements:\na="+a+" b="+b);

    }
    public static void main(String[] args) {
        Demo15 de=new Demo15();
        de.swap(10,20);
    }
}
