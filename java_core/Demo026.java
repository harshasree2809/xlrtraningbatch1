import java.util.Scanner;
class Demo026{
   public static void main(String[] args) {
       //Find vowel and consonant
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a char value: ");
        char ch = sc.next().charAt(0);
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
           ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
            System.out.println("vowel");
        } else {
            System.out.println("consonant");
        }
        
        
        sc.close();
    }
}
