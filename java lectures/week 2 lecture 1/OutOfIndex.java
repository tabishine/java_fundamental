public class OutOfIndex {
    public static void main(String[] args) {
        // Should not WORK!
        int[] array = new int[5];

        for (int i = 0; i < 10; i++) {
            System.out.println(array[i]);
        }
    }
}
