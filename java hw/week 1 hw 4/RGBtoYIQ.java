public class RGBtoYIQ {
    @edu.umd.cs.findbugs.annotations.SuppressFBWarnings("RV_01_TO_INT")
    public static void main(String[] args) {
        int R = StdRandom.uniform(0, 255);
        int G = StdRandom.uniform(0, 255);
        int B = StdRandom.uniform(0, 255);
        System.out.println(R);
        System.out.println(G);
        System.out.println(B);
        double Y = (int) Math.random() * 2;
        double I = StdRandom.uniform(-0.5957, 0.5957);
        double Q = StdRandom.uniform(-0.5226, 0.5226);
        System.out.println(Y);
        System.out.println(I);
        System.out.println(Q);


    }
}
