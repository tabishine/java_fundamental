public class Midnight {
    public static void main(String[] args) {

        for (int i = 1; i <= 12; i++) {
            if (i == 12) System.out.println(i + " noon");
            if (i >= 1 && i != 12) System.out.println(i + " am");
        }
        for (int n = 1; n <= 12; n++) {
            if (n >= 1 && n != 12) System.out.println(n + " pm");
            if (n == 12) System.out.println(n + " midnight");
        }
    }
}










