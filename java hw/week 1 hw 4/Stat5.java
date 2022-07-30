public class Stat5 {
    public static void main(String[] args) {
        int n = 5;
        double random1 = Math.random();
        double random2 = Math.random();
        double random3 = Math.random();
        double random4 = Math.random();
        double random5 = Math.random();
        System.out.println(random1);
        System.out.println(random2);
        System.out.println(random3);
        System.out.println(random4);
        System.out.println(random5);
        double average = (random1 + random2 + random3 + random4 + random5) / n;
        double min = Math.min(random1, Math.min(random2, Math.min(random3,
                                                                  Math.min(random4, random5))));
        double max = Math.max(random1, Math.max(random2, Math.max(random3,
                                                                  Math.max(random4, random5))));
        System.out.println("Average: " + average);
        System.out.println("Min: " + min);
        System.out.println("Max: " + max);

    }
}
