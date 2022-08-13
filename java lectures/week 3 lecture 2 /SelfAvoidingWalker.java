public class SelfAvoidingWalker {
    public static void main(String[] args) {
        //[] [] двумерный массив
        int n = Integer.parseInt(args[0]);
        int trials = Integer.parseInt(args[1]);
        int deadEnds = 0;
        for (int t = 0; t < trials; t++) {
            boolean[][] a = new boolean[n][n];
            // a[i] [j] - false if dog didn't visit cell (i, j)
            // a[i] [j] - true if dog visited cell (i, j)
            int x = n / 2, y = n / 2; // centre
            while (x > 0 && x < n - 1 && y > 0 && y < n - 1) {
                // this is a dead end
                if (a[x - 1][y] && a[x + 1][y] && a[x][y - 1] && a[x][y + 1]) {
                    deadEnds++;
                    break;
                }
                a[x][y] = true;
                double r = Math.random();
                if (r < 0.25) {
                    if (!a[x + 1][y]) x++;
                }
                else if (r < 0.50) {
                    if (!a[x - 1][y]) x--;
                }
                else if (r < 0.75) {
                    if (!a[x][y + 1]) y++;
                }
                else {
                    if (!a[x][y - 1]) y--;
                }
            }
        }
        System.out.println(100 * deadEnds / trials + "% dead ends");
    }
}

