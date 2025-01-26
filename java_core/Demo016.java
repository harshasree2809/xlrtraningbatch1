import java.util.Scanner;
class Demo016 {
    public static void main(String[] args) {
        //string reverser
    //     public static void main(String[] args) {
    //     Scanner sc=new Scanner(System.in);
    //     String mess=sc.nextLine();
    //     StringBuilder remess = new StringBuilder(mess);
    //     remess.reverse();
    //     System.out.println(remess.toString());
    //     sc.close();

    // }
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the String: ");
            String str = sc.nextLine();
                    String reversed = new StringBuilder(str).reverse().toString();
                    if (str.equals(reversed)) {
                        System.out.println("The string \"" + str + "\" is a palindrome.");
                    } else {
                        System.out.println("The string \"" + str + "\" is not a palindrome.");
                    }
        }
            }
}
