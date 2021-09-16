// Write a program that illustrates interface inheritance. Interface P12 inherits from both P1 and P2. Each interface declares one constant and one method. The class Q implements P12. Instantiate Q and invoke each of its methods. Each method displays one of the constants.

interface P1 {
    final static String string1 = "Interface P1";
    void display1();
}

interface P2 {
    final static String string2 = "Interface P2";
    void display2();
}

interface P12 extends P1, P2 {
    final static String string = "Interface P12";
    void display();
}

class Q implements P12 {

    @Override
    public void display1() {
        System.out.println(P1.string1);
    }

    @Override
    public void display2() {
        System.out.println(P2.string2);
    }

    @Override
    public void display() {
        System.out.println(P12.string);
    }

}

class Practical_19 {
    public static void main(String[] args) {
        Q q = new Q();
        q.display1();
        q.display2();
        q.display();
    }
}