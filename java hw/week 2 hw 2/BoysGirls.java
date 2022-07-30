public class BoysGirls {
    public static void main(String[] args) {
        int boys = 0;
        int girls = 0;
        while (boys == 0 || girls == 0) {
            if (Math.random() < 0.5) girls++;
            else boys++;
        }
        System.out.println("boys " + boys);
        System.out.println("girls " + girls);
        System.out.println(boys + girls);

    }
}
