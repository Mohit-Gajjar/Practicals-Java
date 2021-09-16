// Write a program in Java to develop overloaded constructor. Also develop the copy constructor to create a new object with the state of the existing object.
class Practical_11 {
    Practical_11() {
        System.out.println("This is default constructor");
    }

    Practical_11(int a) {
        System.out.println("This is prameterarized constructor");
    }
    Practical_11(Practical_11 practical_11){
        System.out.println("This is the copy constructor");
        practical_11.display();
    }
    void display(){
        System.out.println("This Methord is called from copy constructor");
    }
    public static void main(String[] args) {
        Practical_11 test1 = new Practical_11();
        new Practical_11(12);
        new Practical_11(test1);

    }
}
