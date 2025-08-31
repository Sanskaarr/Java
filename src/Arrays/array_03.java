package Arrays;

public class array_03 {
    public static void main(String[] args) {
        int[] arr = {2,55,4,6,7,8,10};
        int max=Integer.MIN_VALUE;

        for(int i =0;i<arr.length;i++){
            if(max<arr[i]){
                max = arr[i];

            }
        }
        System.out.println(max);
    }
}
