public class RollDice {
    public static void main(String[] args) {
        // this program takes an arg, rolls 10 fair six-sided dice, n times and print histogram
        // takes int command-line argument n
        int n = Integer.parseInt(args[0]);

        // create the counter array with 61 elements inside
        String[] counter = new String[61];
        for (int i = 0; i < counter.length; i++) {
            counter[i] = " ";
        }
        // using loop for generate random values from 1 to 6
        for (int i = 0; i < n; i++) {
            int total = 0;
            for (int k = 0; k < 10; k++) {
                int dice = (int) (Math.random() * 6 + 1);
                total += dice;
            }
            // adding sum results in the counter array and print stars
            counter[total] += "*";
        }
        // using this loop for compute number of times that possible between 10 and 60
        for (int i = 10; i < counter.length; i++)
            System.out.println(i + ": " + counter[i]);
    }
}
