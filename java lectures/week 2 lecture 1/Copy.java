public class Copy {
    public static void main(String[] args) {
        double[] numbers = new double[10];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Math.random();
        }
        System.out.println("Elements in numbers: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i] + " ");
        }
        double[] copyOfnumbers = new double[numbers.length];

        for (int i = 0; i < copyOfnumbers.length; i++) {
            copyOfnumbers[i] = numbers[i];
        }

        System.out.println();
        System.out.println("Elements in copyOfnumbers: ");
        for (int i = 0; i < copyOfnumbers.length; i++) {
            System.out.println(copyOfnumbers[i] + " ");
        }

    }
}
