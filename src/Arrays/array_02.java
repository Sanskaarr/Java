package Arrays;

import java.util.Scanner;

public class array_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number to Find in the Array");
        int x = sc.nextInt();
        int[] arr = {10,20,30,40,50,60};

        for(int i =0;i<arr.length;i++){
            if(x==arr[i]){
                System.out.println("The Element Found on Index : "+i);
            }
        }
        
    }
}
