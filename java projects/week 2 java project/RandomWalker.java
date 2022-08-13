public class RandomWalker {
    public static void main(String[] args) {
        // this program simulates the motion of a random walk for n steps
        // take int command-line argument n
        int n = Integer.parseInt(args[0]);
        int x = 0;
        int y = 0;
        // printing origin point before loop
        System.out.println("(" + x + "," + y + ")");

        // using while loop, generate random probability with Math.random
        // print other random points to the n steps
        for (int i = 0; i < n; i++) {
            double random = Math.random();
            if (random < 0.25)
                x += 1;
            else if (random < 0.5)
                x -= 1;
            else if (random < 0.75)
                y += 1;
            else
                y -= 1;
            System.out.println("(" + x + "," + y + ")");
        }

        // compute and finally print the square of the Euclidean distance = x^2+y^2
        int distance = x * x + y * y;
        System.out.println("squared distance = " + distance);
    }
}


