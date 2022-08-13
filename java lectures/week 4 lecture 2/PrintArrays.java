public class PrintArrays {
    public static void print(int[] a) {
        for (int i = 0; i < a.length; i++)
            System.out.println(a[i] + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        int[] a = { 1, 2, 3, 4, 5 };
        print(a);

        int[] b = { 10, 9, 8, 7, 6 };
        print(b);
    }
}
