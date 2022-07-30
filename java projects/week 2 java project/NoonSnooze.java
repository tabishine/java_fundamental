public class NoonSnooze {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int snooze = 0;
        if (n % 720 >= 0) {
            System.out.println(snooze + "am");
        }
        if (n % 720 != 0) {
            System.out.println(n + " pm");
        }
        if (n % 720 < 0) {
            System.out.println(n + " pm");
        }
    }
