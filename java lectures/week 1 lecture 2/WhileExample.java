public class WhileExample {
    public static void main(String[] args) {
        int i = 0;
        int v = 1;
        int n = 4;
        // i
        while (i <= n) {
            System.out.println(v); // 1 2 4 8
            i = i + 1; // i++;
            v = 2 * v;
        }

    }
}
