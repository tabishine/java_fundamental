public class NoonSnooze {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int start = 0;
        int remainder = 0;
        if (n < 60) {
            System.out.println("12" + ":" + n);
        }
        if (n == 60) {
            start += 1;

            System.out.println(start + ":" + "00");
        }
        if (n > 60) {
            int divide = n / 60;
            start += divide;
            n = n % 60;
            remainder += n;
            System.out.println(start + ":" + remainder);
        }

    }
}

