public class Bits {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        if (n < 0) {
            System.out.println("Illegal input");
        }
        int cnt = 0;
        while (n > 0) {
            n /= 2;
            cnt++;
        }
        System.out.println(cnt);
    }
}
