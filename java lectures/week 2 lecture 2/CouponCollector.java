public class CouponCollector {
    public static void main(String[] args) {
        int m = 4;
        boolean[] found = new boolean[m];
        int distinct = 0;
        int cards = 0;
        while (distinct < m) {
            int r = (int) (Math.random() * m);
            cards++;
            if (!found[r]) {
                found[r] = true;
                distinct++;
            }
        }
        System.out.println(cards);

    }
}
