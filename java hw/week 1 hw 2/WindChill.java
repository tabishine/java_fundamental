public class WindChill {
    public static void main(String[] args) {
        double t = Integer.parseInt(args[0]);
        double v = Integer.parseInt(args[1]);
        double w = 35.74 + 0.6215 * t + (0.4275 * t - 35.75) * Math.pow(v, 0.16);
        double gradus = (w - 32) * 5 / 9;
        System.out.println("Wind Chill Temperature");
        System.out.println("Fahrenheit: " + w + "°F");
        System.out.println("Celcius: " + gradus + "°C");

    }
}
