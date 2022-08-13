public class Function {
    public static int nint(double num) {
        double remainder = num - (int) num;
        if (remainder >= 0.5) {
            return (int) num + 1;
        }
        else
            return (int) num;
        // 4.3 - 4 = 0.3 -> 0.3 < 0.5   >= 0.5 5

    }

    public static void main(String[] args) {
        double number = Double.parseDouble(args[0]);
        System.out.println(nint(number));

    }
}
