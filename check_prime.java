import java.util.Scanner;

public class check_prime {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter a number to check if it is prime:");
            int n = sc.nextInt();
            if(n%2==0){
                System.out.println(n+" is not a prime number");
            }
            else{
                System.out.println(n+" is a prime number");
            }
        }
        }
    }

