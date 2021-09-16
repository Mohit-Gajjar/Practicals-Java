// Develop minimum 4 program based on variation in methods i.e. passing by value, passing by reference, returning values and returning objects from methods.
class Practical_14 {
    static int a1;
    static int b1;
    static int sum = 0;

    private Practical_14(int a, int b) {
        a1 = a;
        b1 = b;
    }

    static void add1(int a, int b) {
        int sum = 0;
        sum = a + b;
        System.out.println("Passing values: " + sum);
    }

    static void add2(int a, int b) {
        int sum = 0;
        sum = a + b;
        System.out.println("Passing refrences: " + sum);
    }

    static int add3(int a, int b) {
        int sum = 0;
        sum = a + b;
        return sum;
    }

    static Practical_14 add4() {
        int sum1 = 0;
        Practical_14 practical_14 = new Practical_14(12, 21);
        sum1 = a1 + b1;
        sum = sum1;
        return practical_14;
    }
}

class Runner {
    public static void main(String[] args) {
        Practical_14.add1(21, 12);
        Practical_14.add2(21, 12);
        System.out.println("Returning value: " + Practical_14.add3(21, 12));
        Practical_14.add4();
        System.out.println("Returning object: " + Practical_14.sum);
    }
}