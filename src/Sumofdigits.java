import java.util.Scanner;

public class Sumofdigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int n = sc.nextInt();
        int sum=0;
        int orginal = n;
        while(n>0){
            int digit = n % 10;
            sum = sum + digit;
            n = n/10;
        }
        System.out.println("The Sum of the digits of " + orginal + " is : " + sum);
        sc.close();
    }
}
