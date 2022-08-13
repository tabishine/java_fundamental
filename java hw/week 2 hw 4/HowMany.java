public class HowMany {
    public static void main(String[] args) {
        int n = args.length;
        System.out.println("You entered " + n + "command-line argument");
        if (n == 1) System.out.println(".");
        else System.out.println("s.");
    }
}
