public class RandomWalkers {
    public static void main(String[] args) {
        // this program takes 2 args, simulate a random walk and compute the average of squared distance
        // create new array for trials
        double[] trials = new double[Integer.parseInt(args[1])];
        double sum = 0;

        // using nested loops, for inside for;)
        for (int n = 0; n < Integer.parseInt(args[1]); n++) {
            int x = 0;
            int y = 0;
            // generate random numbers, move random walkers
            for (int i = 0; i < Integer.parseInt(args[0]); i++) {
                double random = Math.random();
                if (random < 0.25)
                    x += 1;
                else if (random < 0.5)
                    x -= 1;
                else if (random < 0.75)
                    y += 1;
                else
                    y -= 1;
            }
            trials[n] = x * x + y * y;
        }
        // compute sum of the trials array
        for (int k = 0; k < trials.length; k++) {
            sum = sum + trials[k];
        }
        // printing the mean squared distance
        System.out.println("mean squared distance = " + sum / (double) trials.length);
    }
}


