// Write a program in Java to demonstrate the use of 'final' keyword in the field declaration. How it is accessed using the objects.
class Practical_13 {
    final String name;

    Practical_13(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        Practical_13 practical_13 = new Practical_13("Mohit Gajjar");
        System.out.println("Name: " + practical_13.name);
    }
}