// Write a program in Java to demonstrate implementation of multiple inheritance using interfaces.
interface M {
     String string1 = "Interface M";
}

interface N {
     String string2 = "Interface N";
}

class Practical_22 implements M, N {
    public static void main(String[] args) {
        System.out.println(string1);
        System.out.println(string2);

    }
}
