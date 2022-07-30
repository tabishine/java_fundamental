public class Distinct {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);
        int count = 1;
        if (a != b && a != c) count++;
        if (b != a && b != c) count++;
        if (c != a && c != b) count++;

        System.out.println(count);

    }
}
