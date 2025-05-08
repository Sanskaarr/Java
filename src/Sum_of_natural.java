import java.util.Scanner;

public class Sum_of_natural {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        if(n == 0){
            System.out.print(n +" is not a Natural Number");
        }
        else{
            while(n>0) {
                int digit = n % 10;
                sum = sum + digit;
                n = n / 10;
            }
            System.out.println("The Sum is " + sum);
        }

    }
}
