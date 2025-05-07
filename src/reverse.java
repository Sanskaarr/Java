import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter a number to reverse:");
            int x = sc.nextInt();
            int Original = x;
            int rev = 0;
            while(x>0){
                int digit = x%10;
                rev = rev*10 + digit;
                x = x/10;
            }
            System.out.println("The Original Number is : " + Original);
            System.out.println("The Reversed Number is : " + rev);
        }
    }
}
