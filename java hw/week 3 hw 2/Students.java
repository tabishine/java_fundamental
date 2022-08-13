public class Students {
    public static void main(String[] args) {
        final int N = StdIn.readInt();
        String[] firstName = new String[N];
        String[] secondName = new String[N];
        String[] email = new String[N];
        int[] section = new int[N];

        for (int i = 0; i < N; i++) {
            section[i] = StdIn.readInt();
            firstName[i] = StdIn.readString();
            secondName[i] = StdIn.readString();
            email[i] = StdIn.readString();
        }

        StdOut.println("Section 4");
        for (int i = 0; i < N; i++) {
            if (section[i] == 4)
                StdOut.println(firstName[i] + secondName[i] + email[i]);
        }

        StdOut.println();

        StdOut.println("Section 5");
        for (int i = 0; i < N; i++) {
            if (section[i] == 5)
                StdOut.println(firstName[i] + secondName[i] + email[i]);
        }
    }
}


