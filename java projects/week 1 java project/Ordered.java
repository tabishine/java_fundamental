public class Ordered {
    public static void main(String[] args) {
        // takes 3 int command-line arguments x, y, z
        int x = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[1]);
        int z = Integer.parseInt(args[2]);

        // prints true if (x < y < z) or (x > y > z) and false otherwise
        boolean b = (x < y) && (y < z) || (x > y) && (y > z);
        System.out.println(b);

    }
}
