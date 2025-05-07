import java.util.*;

public class fibonacci{
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the number of terms in the Fibonacci series:");
            int n = sc.nextInt();
            int a = 0, b = 1;
            System.out.print("Fibonacci Series: " + a + ", " + b);
            for (int i = 3; i <= n; i++) {
                int c = a + b;
                System.out.print(", " + c);
                a = b;
                b = c;
            } 
        }
    }
}