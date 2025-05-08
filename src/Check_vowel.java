import java.util.Scanner;

public class Check_vowel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char n = sc.nextLine().toLowerCase().charAt(0);
        if(n == 'a' || n == 'e' || n == 'i' || n == 'o' || n == 'u'){
            System.out.println(n + " is a vowel.");
        } else {
            System.out.println(n + " is not a vowel.");
        }
        sc.close();
    }
}
