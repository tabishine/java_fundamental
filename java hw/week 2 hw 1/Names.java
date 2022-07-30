public class Names {
    public static void main(java.lang.String[] args) {
        String[] names = { "Ringo", "Paul", "John", "George" };
        String temp = " ";
        for (int i = 0; i < names.length / 2; i++) {
            temp = names[i];
            names[i] = names[names.length - 1 - i];
            names[names.length - 1 - i] = temp;
        }

        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i] + " ");
        }
    }
}
