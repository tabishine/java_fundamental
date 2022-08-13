public class BirthdayOneExperiment {
    public static void main(String[] args) {
        // april 1 -> birthday[90] = true
        // dec 31 -> birthday[364] = true
        // july 17 -> ...
        // nov 27
        // apr 7
        // feb 5
        // july 6
        // nov 27
        // jan 1 -> birthday[0] = true
        // 67 -> birthday[67] = true
        // 300 -> birthday[300] = true
        // 364 -> birthday[364] = true

        int people = 0;
        boolean[] birthday = new boolean[365];
        while (true) {
            int day = (int) (Math.random() * 365);
            if (birthday[day] == true)
                break;
            birthday[day] = true;
            people++;
        }
        System.out.println(people);
    }
}
