public class NBody {
    final static double G = 6.67e-11;

    public static double distance(double a, double b) {
        return Math.sqrt(a * a + b * b);
    }

    public static void main(String[] args) {
        // Step 1. Parse command-line arguments
        double tau = Double.parseDouble(args[0]);
        double dt = Double.parseDouble(args[1]);
        // Step 2. Read universe from standard output
        int n = StdIn.readInt();
        double radius = StdIn.readDouble();
        StdDraw.setXscale(-radius, +radius);
        StdDraw.setYscale(-radius, +radius);
        StdDraw.enableDoubleBuffering();

        // creating parallel arrays
        double[] x = new double[n];
        double[] y = new double[n];
        double[] vx = new double[n];
        double[] vy = new double[n];
        double[] mass = new double[n];
        double[] fx = new double[n];
        double[] fy = new double[n];
        double[] ax = new double[n];
        double[] ay = new double[n];
        String[] image = new String[n];
        double fxsum, fysum;

        // read in the data, fiiling the arrays
        for (int i = 0; i < n; i++) {
            x[i] = StdIn.readDouble();
            y[i] = StdIn.readDouble();
            vx[i] = StdIn.readDouble();
            vy[i] = StdIn.readDouble();
            mass[i] = StdIn.readDouble();
            image[i] = StdIn.readString().trim();
        }

        // Step 5: Simulate the universe (the big time loop)
        // creating time simulation loop and initialize drawing
        for (double t = 0; t < tau; t += dt) {
            for (int i = 0; i < n; i++) {
                StdDraw.picture(0, 0, "starfield.jpg");
                for (int k = 0; k < n; k++) {
                    StdDraw.picture(x[k], y[k], image[k]);
                }
                StdDraw.show();
                StdDraw.pause(100);
                fxsum = 0;
                fysum = 0;

                // Step 5A: calculate the forces
                for (int j = 0; j < n; j++) {
                    if (i != j) {
                        fx[i] = (G * mass[i] * mass[j] / distance(x[i] - x[j],
                                                                  y[i] - y[j]) *
                                distance(x[i] - x[j], y[i] - y[j])) * (x[j] - x[i]) /
                                distance(x[j] - x[i], y[j] - y[i]);
                        fy[i] = (G * mass[i] * mass[j] / distance(x[i] - x[j],
                                                                  y[i] - y[j])
                                * distance(x[i] - x[j], y[i] - y[j])) * (y[j] - y[i]) /
                                distance(x[i] - x[j], y[i] - y[j]);
                        fxsum += fx[i];
                        fysum += fy[i];
                    }
                }
                // Update the velocity and position of each body

                ax[i] = fxsum / mass[i];
                ay[i] = fysum / mass[i];

                vx[i] += ax[i] * dt;
                vy[i] += ay[i] * dt;

                x[i] = x[i] + vx[i] * dt;
                y[i] = y[i] + vy[i] * dt;

            }
        }

    }
}


