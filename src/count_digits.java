import java.util.Scanner;

public class count_digits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count=0;
        int original = n;
        while(n>0){
            int digit = n%10;
            n = n/10;
            if(digit != 0){
                count++;
            }
            else{
                System.out.println("The Number of Digits in the "+ original +  " is "+ count );
            }

        }
        System.out.println("The Number of Digits in the "+ original + " is "+ count );
    }
}
