public class RandomNumbers {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int[] counter = new int[11];
        for (int i = 0; i < n; i++) {
            int randomN = (int) (Math.random() * 10 + 1);
            System.out.println(randomN);
            counter[randomN]++;
        }
        int max = 0;
        int value = 0; // значение
        for (int i = 0; i < counter.length; i++) {
            if (max < counter[i]) {
                max = counter[i];
                value = i;
            }
        }
        System.out.println("Number " + value + " is the most frequent number " + max);
    }
}


