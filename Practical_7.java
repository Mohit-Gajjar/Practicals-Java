// Write programs in Java to use Wrapper class of each primitive data types
public class Practical_7 {
    public static void main(String[] args) {
        int a = 10;
        char b = 'a';
        double c = 1.0;
        boolean d = false;

        Integer A = Integer.valueOf(a);
        Character B = Character.valueOf(b);
        Double C = Double.valueOf(c);
        Boolean D = Boolean.valueOf(d);

        System.out.println(A);
        System.out.println(B);
        System.out.println(C);
        System.out.println(D);
    }
}
