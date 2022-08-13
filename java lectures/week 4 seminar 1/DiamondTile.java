public class DiamondTile {
    // drawing the coordinates
    public static void diamond(double x, double y, double z) {
        double[] positionx = { x + z, x, x - z, x };
        double[] positiony = { y, y + z, y, y - z };
        StdDraw.filledPolygon(positionx, positiony);
    }

    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        StdDraw.setXscale(0, n);
        StdDraw.setYscale(0, n);
        // nested loop for x and y
        for (int x = 0; x < n; x++) {
            for (int y = 0; y < n; y++) {
                // black diamond
                StdDraw.setPenRadius();
                StdDraw.setPenColor(StdDraw.BLACK);
                diamond(x + 0.5, y + 0.5, 0.5);
            }
        }


    }
}
