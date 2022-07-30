public class MaxExample {
    public static void main(String[] args) {
        int x = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[1]);
        int max;
        if (x < y)
            max = y;
        else
            max = x;
        System.out.println(max);

    }
}
