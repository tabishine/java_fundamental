public class Birthday {
    public static void main(String[] args) {
        // Birthday problem. Suppose that people enter an empty room until a pair of people
        // share a birthday. On average, how many people will have to enter before there is a
        // match? Write a program Birthday.java to simulate one experiment.
        // Write a program Birthdays.java to repeat the experiment many times and
        // estimate the average value. Assume birthdays to be uniform random integers
        // between 0 and 364.
        int trials = 10000;
        int totalPeople = 0;
        for (int i = 0; i < trials; i++) {
            int people = 0;
            boolean[] birthday = new boolean[365];
            while (true) {
                int day = (int) (Math.random() * 365);
                if (birthday[day])
                    break;
                birthday[day] = true;
                people++;
            }
            totalPeople += people;
        }
        double avg = 1.0 * totalPeople / trials;
        System.out.println(avg);
        

    }
}
