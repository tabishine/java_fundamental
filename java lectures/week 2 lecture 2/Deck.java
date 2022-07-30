public class Deck {
    public static void main(String[] args) {
        String[] rank = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A" };
        String[] suit = { "♣", "♦", "♥", "♠" };
        String[] deck = new String[52];
        // [2♣, 3♣, 4♣, ... , A♠]


        // deck[0 * 13 + 0] = deck[0] = rank[0] + suit[0] = 2♣
        // deck[0 * 13 + 1] = deck[1] = rank[1] + suit[0] = 3♣
        // ...
        // deck[0 * 13 + 12] = deck[12] = rank[12] + suit[0] = A♣
        // deck[0] = 2♣
        // deck[1] = 3♣
        // ..
        // deck[12] = A♣
        // deck[13] = 2♦
        // deck[14] = 3♦

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 13; j++) {
                deck[i * 13 + j] = rank[j] + suit[i];
            }
        }

        // 2♣
        // 3♣
        // 4♣
        // 5♣
        // ..
        // A♣
        // 2♦
        // 3♦
        // ..
        // A♦
        // for (int i = 0; i < 4; i++) {
        //     for (int j = 0; j < 13; j++) {
        //         System.out.println(i + " " + j);
        //     }
        //     System.out.println("NEXT SUIT");
        // }
        // 0 0
        // 0 1
        // 0 2
        // ..
        // 0 12
        // 1 0
        // 1 12

        for (int i = 0; i < deck.length; i++) {
            System.out.println(deck[i] + " ");
        }

    }
}
