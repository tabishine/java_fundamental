public class HW1 {
    public static void main(String[] args) {
        double number1 = Double.parseDouble(args[0]);
        double number2 = Double.parseDouble(args[1]);
        double sum = number1 + number2;
        double product = number1 * number2;
        double quotient = (number1) / number2;
        double remainder = number1 % number2;
        System.out.println(sum);
        System.out.println(product);
        System.out.println(quotient);
        System.out.println(remainder);
    }
}
