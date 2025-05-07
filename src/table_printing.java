import java.util.Scanner;

public class table_printing {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the number for which you want to print the table:");
            int n = sc.nextInt();
            for(int i=1;i<=10;i++){
                int j= i*n;
                System.out.println(n+" * "+i +" = "+j);
            }
        }
    }
}
