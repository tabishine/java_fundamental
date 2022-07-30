public class Distance {
    public static void main(String[] args) {
        int x1 = Integer.parseInt(args[0]);
        int y1 = Integer.parseInt(args[1]);
        int x2 = Integer.parseInt(args[2]);
        int y2 = Integer.parseInt(args[3]);
        // import library "Math" that include "sqrt" e.g (квадратный корень)
        double dist = Math.sqrt((y2 - y1) * (y2 - y1) + (x2 - x1) * (x2 - x1)); // distance formula
        System.out.println(
                "distance from (" + x1 + ", " + y1 + ") to (" + x2 + ", " + y2 + ") = " + dist);


    }
}
