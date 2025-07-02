package Arrays;

import java.util.Scanner;

public class array_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];

        for(int i=0;i<arr.length;i++){
            System.out.println("Enter the value for index " + i + ": ");
            arr[i] = sc.nextInt();
            System.out.println();
        }
        for(int e:arr){
            System.out.println(e);
        }
    }
}