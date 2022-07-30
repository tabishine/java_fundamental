public class Quadratic {
    public static void main(String[] args) {
        // "2.1843124" -> 2.1843124
        double b = Double.parseDouble(args[0]);
        double c = Double.parseDouble(args[1]);
        // discriminant
        // b^2 - 4c
        double discriminant = b * b - 4 * c;
        double dd = Math.sqrt(discriminant);
        double r1 = (-b + dd) / 2;
        double r2 = (-b - dd) / 2;
        System.out.println(r1);
        System.out.println(r2);


    }
}
