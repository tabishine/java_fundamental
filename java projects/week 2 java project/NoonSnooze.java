public class NoonSnooze {
    public static void main(String[] args) {
        // this program takes minutes and prints the result time with day part
        // take int command-line argument snooze
        int snooze = Integer.parseInt(args[0]);
        // using / and % operators to compute new values
        int setTime = 12 * 60;
        int day = 60 * 24;
        int totalMinutes = setTime + snooze;
        int realTime = totalMinutes % day;
        int hours = realTime / 60;
        int minuteResult = realTime % 60;

        // using ternary operator to determine day part: am or pm
        String ampm = (hours < 12) ? "am" : " pm";

        // using if else conditional to format the output
        if (hours == 0)
            System.out.printf((hours + 12) + ":%02d am", minuteResult);
        else if (snooze < 60)
            System.out.println("12" + ":" + snooze + " pm");
        else if (hours < 12)
            System.out.println((hours + 12) - 12 + ":" + minuteResult + " " + ampm);
        else if (hours == 12)
            System.out.println(hours + ":" + minuteResult + " " + ampm);
        else
            System.out.println((hours - 12) + ":" + minuteResult + "" + ampm);
    }
}



