public class ComparisonOps {
    public static void main(String[] args) {
        int x = 10;
        int y = 5;

        boolean less = (x < y);
        System.out.println(less); // false

        boolean eq = (x == y);
        System.out.println(eq); // false

        boolean more = (x > y);
        System.out.println(more); // true

        boolean moreeq = (x >= y);
        System.out.println(moreeq); // true

        boolean noteq = (x != y);
        System.out.println(noteq); // true

    }
}
