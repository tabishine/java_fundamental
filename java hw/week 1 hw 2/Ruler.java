public class Ruler {
    public static void main(String[] args) {
        String ruler1 = "1";
        String ruler2 = ruler1 + " 2 " + ruler1; // ruler = "1 2 1"
        String ruler3 = ruler2 + " 3 " + ruler2;   // ruler =  1 2 1 3 1 2 1
        System.out.println(ruler3);

    }
}
