public class Counter {
    public static void main(String[] args) {
        int[] a = {
                22, 22, 16, 31, 28, 19, 36,
                18, 26, 15, 27, 32, 22, 31,
                25, 23, 27, 16, 28, 19, 27, 33
        };
        int[] count = new int[37];
        // [0, 0, 0, 0, 0, 0, ..., 0]

        // [0, 2, 3, 2, 1, 5, 1]
        // count[0] -> 0
        // count[1] -> 2
        // count[6] -> 1

        // count[i] -> how many people are i years old
        // count[25] -> how many 25-year olds?
        // count[90] -> how many 90-year olds?

        for (int i = 0; i < a.length; i++) {
            // i = 2
            int age = a[i]; // age = 2
            count[age]++; // count[2]++
        }

        for (int i = 0; i < 37; i++) {
            if (count[i] > 0)
                System.out.println(i + " " + count[i]);
        }

    }
}
