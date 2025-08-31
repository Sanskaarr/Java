package Arrays;

public class Sum_of_all_elements {
    public static void main(String[] args) {
        int sum =0;
        int[] arr = {2,4,6,8};

        for (int i = 0; i < arr.length; i++) {
           sum += arr[i];
        }
        System.out.println(sum);
    }
}
