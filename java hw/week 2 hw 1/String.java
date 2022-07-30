public class String {
    public static void main(String[] args) {
        int n = a.length;
        String[] a = new String[10];
        for (int i = 0; i < n / 2; i++) {
            String temp = a[n - i - 1];
            a[n - i - 1] = a[i];
            a[i] = temp;
        }
        System.out.println(a);
    }
}


