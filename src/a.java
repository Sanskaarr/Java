public class a {
    public static void main(String[] args) {
        int x = 23;
        int reverse = 0;
        while(x>0){
            int n = x %10;
            reverse = reverse * 10 + n;
            x = x/10;
        }
        System.out.println(reverse);
    }
}
