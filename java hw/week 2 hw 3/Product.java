public class Product {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int product = 1; // 1->1->2->6->24
        for (int i = 1; i <= n; i++) {
            product *= i;
        }
        System.out.println(product);
    }

}
