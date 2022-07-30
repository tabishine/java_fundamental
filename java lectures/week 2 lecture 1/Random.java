public class Random {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        double[] array = new double[n];

        double min = 100;
        for (int i = 0; i < n; i++) {
            array[i] = Math.random();
            System.out.println(array[i]);
            min = Math.min(min, array[i]);
        }
        System.out.println();
        System.out.println("min = " + min);
    }
}

