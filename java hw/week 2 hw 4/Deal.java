public class Deal {
    public static void main(String[] args) {
        int PLAYERS = Integer.parseInt(args[0]);
        int line = 5;
        String[] SUITS = { "Clubs", "Diamonds", "Hearts", "Spades" };
        String[] RANKS = {
                "2", "3", "4", "5", "6", "7", "8", "9", "10",
                "Jack", "Queen", "King", "Ace"
        };
        int n = SUITS.length * RANKS.length;
        if (line * PLAYERS > n)
            throw new RuntimeException("Too many players");

        String[] deck = new String[n];
        for (int i = 0; i < RANKS.length; i++) {
            for (int j = 0; j < SUITS.length; j++) {
                deck[SUITS.length * i + j] = RANKS[i] + "of" + SUITS[j];
            }
        }

        // prints n poker hands (5 card each) from a shuffled deck and separated by blank lines
        for (int i = 0; i < n; i++) {
            int r = i + (int) (Math.random() * (n - 1));
            String temp = deck[r];
            deck[r] = deck[i];
            deck[i] = temp;
        }
        for (int i = 0; i < PLAYERS * line; i++) {
            System.out.println(deck[i]);
            if (i % line == line - 1)
                System.out.println(deck[i]);
        }
    }
}

