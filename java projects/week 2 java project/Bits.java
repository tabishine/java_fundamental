public class Bits {
    public static void main(String[] args) {
        // take int command-line argument n
        int n = Integer.parseInt(args[0]);
        int cnt = 0;

        // if n is negative print "Illegal input"
        if (n < 0) {
            System.out.println("Illegal input");
            return;
        }
        // divide n by 2 until it is less than 1
        while (n >= 1) {
            n /= 2;
            cnt++;
        }
        // print the number of times that need
        System.out.println(cnt);
    }
}
