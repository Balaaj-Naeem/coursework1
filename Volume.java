public class Volume {

    static double sphere(double d) {
        double r = d / 2.0;
        return (4.0 / 3.0) * Math.PI * Math.pow(r, 3);
    }

    public static void main(String[] args) {
        double result = sphere(25.2);
        System.out.println(result);
    }
}