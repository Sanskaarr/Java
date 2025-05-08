import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int n = sc.nextInt();
        int check=0;
        int orginal = n;
        while(n>0){
            int digit = n % 10;
            check = check * 10 + digit;
            n = n/10;
        }
        if(check == orginal){
            System.out.println("The Number " + orginal + " is a Palindrome");
        }
        else{
            System.out.println("The Number " + orginal  + " is not a Palindrome");
        }
        sc.close();
    }

}
