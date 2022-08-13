public class DrunkenMaster {
    public static void main(String[] args) {
        char[] array = args[0].toCharArray();
        int x = 0;
        int y = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 'R')
                x += 1;
            else if (array[i] == 'L')
                x -= 1;
            else if (array[i] == 'U')
                y += 1;
            else
                y -= 1;
        }
        System.out.println("(" + x + "," + y + ")");
    }
}
