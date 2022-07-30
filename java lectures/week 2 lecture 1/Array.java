public class Array {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        double[] a = new double[n]; // create array
        double min = 2;
        for (int i = 0; i < n; i++) {
            a[i] = Math.random();
            System.out.println(a[i]);
            if (a[i] < min)
                min = a[i];
        }
        System.out.println();
        System.out.println("min = " + min);
    }
}

