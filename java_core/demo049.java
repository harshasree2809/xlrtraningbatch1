import java.util.Scanner;
public class demo049 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        int reversed = 0;
        
        // Reverse the number
        while (number != 0) { 
            reversed = reversed * 10 + number % 10;  
            number /= 10;                         
        }
        System.out.println("Reversed number: " + reversed);
    }
}


