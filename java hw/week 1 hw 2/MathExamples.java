public class MathExamples {
    public static void main(String[] args) {
        double a = 3.141529;
        double b = 1.1415;
        double c = -14.2423914892013481;
        double max = Math.max(a, b);
        double min = Math.min(a, b);
        double pos = Math.abs(c); // pos = 14.2423914892013481
        // System.out.println(Math.PI);

        // 2.7^10
        double two = 2.7;
        double ten = 10;
        // System.out.println(Math.pow(two, ten));

        // Math.random() -> [0, 1) -> [0, 100)
        // double r = Math.random() * 100;
        // System.out.printf("%.3f", r);
        // System.out.println(StdRandom.uniform(1, 10));

        int x = (int) (Math.random() * 100);
        // 99.14392104812390423 -> 99
        System.out.println(x);

    }
}
