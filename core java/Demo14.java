public class Demo14 {
    void unaryop(){
        int a=10,b=5;
        System.out.println(a++);
        System.out.println(++a);
        System.out.println(b--);
        System.out.println(--b);
        a=5;
        b=5;
        int c=a++*-b*a;
        System.out.println(c);
    }
    public static void main(String[] args) {
        Demo14 de=new Demo14();
        de.unaryop();
    }
}
