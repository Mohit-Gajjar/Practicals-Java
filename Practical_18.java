// Write a program in Java in which a subclass constructor invokes the constructor of the super class and instantiate the values.
class Practical_18 {
    Practical_18(String string) {
        System.out.println(string);
    }
}

class Practical_18_A extends Practical_18 {
    Practical_18_A(String string) {
        super(string);
    }
}

class Main2 {

    public static void main(String[] args) {
        new Practical_18("Invoked from subclass");
    }
}
