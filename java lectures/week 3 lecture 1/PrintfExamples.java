public class PrintfExamples {
    public static void main(String[] args) {
        // %d - int
        // %f - double
        // %s - String
        // \n - newline
        // \t - tab

        int h = 12;
        int m = 5;
        String ampm = "pm";
        System.out.println("%d:%02d%s", h, m, ampm);
    }
}
