// Write a program in Java to demonstrate the use of private constructor and also write a method which will count the number of instances created using default constructor only
class Practical_12 {
    static int count;

    private Practical_12(String message) {
        System.out.println(message);
    }

    private Practical_12() {
        count++;
    }

    static Practical_12 getReplica() {
        count++;
        Practical_12 practical_12 = new Practical_12("This is the private constructor");
        return practical_12;
    }
}

class Main {
    public static void main(String[] args) {
        Practical_12.getReplica();
        Practical_12.getReplica();
        Practical_12.getReplica();

        System.out.println("Number of instance created is " + Practical_12.count);
    }
}
