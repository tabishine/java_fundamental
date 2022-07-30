public class GymnasticsScorer {
    public static void main(String[] args) {
        double j1 = Double.parseDouble(args[0]);
        double j2 = Double.parseDouble(args[1]);
        double j3 = Double.parseDouble(args[2]);
        double j4 = Double.parseDouble(args[3]);
        double j5 = Double.parseDouble(args[4]);
        double j6 = Double.parseDouble(args[5]);
        double cnt = 4.0;

        if (j1 >= 0.0 && j1 <= 10.0) System.out.println(j1);
        if (j2 >= 0.0 && j2 <= 10.0) System.out.println(j2);
        if (j3 >= 0.0 && j3 <= 10.0) System.out.println(j3);
        if (j4 >= 0.0 && j4 <= 10.0) System.out.println(j4);
        if (j5 >= 0.0 && j5 <= 10.0) System.out.println(j5);
        if (j6 >= 0.0 && j6 <= 10.0) System.out.println(j6);

        double max = Math.max(j1, Math.max(j2, Math.max(j3, Math.max(j4, Math.max(j5, j6)))));
        double min = Math.min(j1, Math.min(j2, Math.min(j3, Math.min(j4, Math.min(j5, j6)))));
        System.out.println("max " + max);
        System.out.println("min " + min);
        double average = j1 + j2 + j3 + j4 + j4 + j5 + j6 - max - min;

        System.out.println("Average: " + average);


    }

}

