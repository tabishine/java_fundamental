public class RandomCards {
    public static void main(String[] args) {
        String[] rank = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A" };
        String[] suit = { "♣", "♦", "♥", "♠" };
        String[] deck = new String[52];
        // deck = {"2♣", "3♣", "4♣", "5♣", "6♣", "7♣"}
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 13; j++) {
                deck[i * 13 + j] = rank[j] + suit[i];
            }
        }
        int n = Integer.parseInt(args[0]);
        for (int i = 0; i < n; i++) {
            // Math.random() -> [0, 1)
            // Math.random() * 52 -> [0, 52)
            // (int)(Math.random * 52) -> [0, 51]
            int r = (int) (Math.random() * 52); // [0, 51]
            System.out.println(deck[r]);
        }

    }
}
