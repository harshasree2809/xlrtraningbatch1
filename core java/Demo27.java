import java.util.Scanner;

public class Demo27 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a value: ");
        int num=sc.nextInt();
        primeornot(num);
    }
    static void primeornot(int n){
        if (n <= 1) {
            System.out.println(n + " is not a prime number");
            
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                System.out.println(n + " is not a prime number");
                
            }
        }
        
        System.out.println(n + " is a prime number");
    }
}
    


