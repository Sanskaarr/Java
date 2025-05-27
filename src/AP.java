import java.util.Scanner;

public class AP {
    public void Nth_term(int n,int a,int d){
        int nthterm = a + (n-1)*d;
        System.out.println("The " + n + "th term of the AP is: " + nthterm);
        
    }

    public void Sum_of_AP(int a,int n,int d){
          int sum = (n * (2 * a + (n - 1) * d)) / 2;
          System.out.println("The sum of the AP is: " + sum);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Nth term of the AP: ");
        int n= sc.nextInt();
        System.out.println("Enter the first term of the AP: ");
        int a = sc.nextInt();
         System.out.println("Enter the common difference of the AP: ");
        int d = sc.nextInt();
        sc.close();
      AP obj = new AP();
      obj.Nth_term(n,a,d);
      obj.Sum_of_AP(a,n,d);
    }

    
}
