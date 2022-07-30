public class BooleanExamples {
    public static void main(String[] args) {
        // boolean a = true;
        // System.out.println(!a);

        // && = and
        // a && b
        // false -> 0, true -> 1
        // false && false -> false
        // true && false -> false
        // false && true -> false
        // true && true -> true

        // || = OR
        // a || b
        // false || false -> false
        // true || false -> true
        // false || true -> true
        // true || true -> true

        boolean a = true;
        boolean b = false;
        // !a && b = !true && false = false && false = false
        // a && !b = true && !false = true && true = true
        // false || true
        boolean c = (!a && b) || (a && !b);
        System.out.println(c);

    }
}
