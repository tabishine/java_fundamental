public class NBodyProj {
    public static void main(String[] args) {
        // Step 1. Parse command-line arguments
        double tau = Double.parseDouble(args[0]);
        double deltat = Double.parseDouble(args[1]);

        // Step 2. Read universe from standard output
        int n = StdIn.readInt(); // количество частиц
        double radius = StdIn.readDouble(); // radius
        // creating parallel arrays
        double[] px = new double[n]; // positions
        double[] py = new double[n];
        double[] vx = new double[n]; // velocities
        double[] vy = new double[n];
        double[] mass = new double[n];
        String[] image = new String[n];
        double[] fx = new double[n]; // force
        double[] fy = new double[n];
        double[] gforce = new double[n];
        double[] ax = new double[];
        double[] ay = new double[];
        double G = 6.67e-11;

        // read in the data
        for (int i = 0; i < n; i++) {
            px[i] = StdIn.readDouble();
            py[i] = StdIn.readDouble();
            vx[i] = StdIn.readDouble();
            vy[i] = StdIn.readDouble();
            mass[i] = StdIn.readDouble();
            image[i] = StdIn.readString().trim(); // пробелы убирает
        }

        // Step 5: Simulate the universe (the big time loop)
        // creating time simulation loop
        for (double t = 0.0; t < tau; t += deltat) {
            // double elapsedTime = deltat * n;
            // for (int k = 0; k < n; k++) {
            // StdOut.println("t = " + elapsedTime);
            // elapsedTime += deltat;
            // if (elapsedTime < tau) {
            // StdOut.println("t = " + elapsedTime);
            // Step 5B: Update the velocities and positions
            for (int i = 0; i < n; i++) {
                // Update the velocity and position of each body
                vx[i] += ax[i] * deltat;
                vy[i] += ay[i] * deltat;
                px[i] += vx[i] * deltat;
                py[i] += vy[i] * deltat;
                // step 5B drawing the universe
                StdDraw.setXscale(-radius, +radius);
                StdDraw.setYscale(-radius, +radius);
                StdDraw.enableDoubleBuffering();
                StdDraw.picture(0, 0, "starfield.jpg");
                StdDraw.picture(px[i], py[i], image[i]);
                StdDraw.picture(vx[i], vy[i], image[i]);

                StdDraw.show();
                StdDraw.pause(20);
                // Step 5A: Calculate the force
                // calculate new velocity and position
                double vx0 = vx + deltat * ax;
                double vy0 = vy + deltat * ay;
                double px0 = px + deltat * vx;
                double py0 = py + deltat * vy;
                double force = mass[1] * mass[i] * G / radius * radius;
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < n; j++) {
                        if (i != j) {
                            fx = force * py0 / radius;
                            fy = force * px0 / radius;

                        }
                    }
                }
            }
        }
        // Step 6: Print universe to standard
        StdOut.printf("%d\n", n);
        StdOut.printf("%.2e\n", radius);
        for (
                int i = 0;
                i < n; i++) {
            StdOut.printf("%11.4e %11.4e %11.4e %11.4e %11.4e %12s\n",
                          px[i], py[i], vx[i], vy[i], mass[i], image[i]);
        }

        // Step 3: Initialize standard drawing
        // set the scale of the coordinate system
        StdDraw.setXscale(-radius, +radius);
        StdDraw.setYscale(-radius, +radius);
        StdDraw.enableDoubleBuffering();
        while (true) {
            for (int i = 1; i <= n; i++) {
                StdDraw.filledSquare(0.0, 0.0, 1.0);
                if (Math.abs(px[i] + vx[i]) > radius) {
                    vx[i] = -vx[i];
                    // Step 4: Play music on standard audio
                    StdAudio.play("2001.wav");
                }
                if (Math.abs(py[i] + vy[i]) > radius) {
                    vy[i] = -vy[i];
                    StdAudio.play("2001.wav");
                }

            }
        }

    }

}
}
        }






