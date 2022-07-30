public class GreatCircle {
    public static void main(String[] args) {
        // takes 4 double command-line arguments and convert them to radians
        double x = Double.parseDouble(args[0]);
        double x1 = Math.toRadians(x);

        double y = Double.parseDouble(args[1]);
        double y1 = Math.toRadians(y);

        double xx = Double.parseDouble(args[2]);
        double x2 = Math.toRadians(xx);

        double yy = Double.parseDouble(args[3]);
        double y2 = Math.toRadians(yy);

        // compute the distance using the trigonometric formula
        // divided the formula into 2 actions
        double trig = Math.sin(x1) * Math.sin(x2) + Math.cos(x1) * Math.cos(x2)
                * Math.cos(y1 - y2);
        double formula = 60 * Math.acos(trig);

        // convert radians to degrees
        double convert = Math.toDegrees(formula);

        // prints the great circle distance in nautical miles
        System.out.println(convert + " nautical miles");
    }
}

