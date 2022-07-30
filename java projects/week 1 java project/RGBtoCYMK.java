public class RGBtoCYMK {
    public static void main(String[] args) {
        // this program converts from RGB format to CMYK format
        // takes 3 int command-line arguments red, green, and blue
        double red = Integer.parseInt(args[0]);
        double green = Integer.parseInt(args[1]);
        double blue = Integer.parseInt(args[2]);

        System.out.println("red = " + red);
        System.out.println("green = " + green);
        System.out.println("blue = " + blue);

        // using math formulas prints the equivalent CMYK values
        double white = Math.max(red / 255, Math.max(green / 255, blue / 255));
        double cyan = (white - red / 255) / white;
        double magenta = (white - green / 255) / white;
        double yellow = (white - blue / 255) / white;
        double black = 1 - white;

        System.out.println("cyan = " + cyan);
        System.out.println("magenta = " + magenta);
        System.out.println("yellow = " + yellow);
        System.out.println("black = " + black);

    }
}

