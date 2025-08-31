package Arrays;

public class Maximum_number {
    public static void main(String[] args) {
        int max =0;
        int[] arr = {12,24,358,2,4,99,0};

        for (int i= 0; i < arr.length; i++) {
            if(arr[i]>max){
                max = arr[i];
            }
        }
        System.out.println(max);
    }
}
