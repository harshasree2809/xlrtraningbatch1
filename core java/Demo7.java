import java.util.Scanner;

public class Demo7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your name: ");
        String name=sc.nextLine();
        System.out.print("Enter your age: ");
        int age =sc.nextInt();
        System.out.print("Enter your Phone number: ");
        int Phonenumber=sc.nextInt();
        System.out.println("Hello "+name+" !\nYour age is "+age+"\nThe Phone "+Phonenumber);
    }
}
