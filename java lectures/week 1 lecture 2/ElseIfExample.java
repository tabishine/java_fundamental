public class ElseIfExample {
    public static void main(String[] args) {
        int temperature = Integer.parseInt(args[0]);
        // [0,10) --> cool
        // [10, 20) --> warm
        // [20, 30) --> hot
        // [30, 40) --> very hot
        if (temperature < 10)
            System.out.println("cool");
        else if (temperature < 20)
            System.out.println("warm");
        else if (temperature < 30)
            System.out.println("hot");
        else if (temperature < 40)
            System.out.println("very hot");
        else
            System.out.println("crazy hot");
    }
}
