// Write a program in Java to demonstrate single inheritance, multilevel inheritance and hierarchical inheritance.
class Practical_15 {
    String val = "Single Inheritance";
    String val2 = "Multi level Inheritance";
    String val3 = "Hierichical Inheritence";

}
class Practical_15_A extends Practical_15{
    void display(){
        System.out.println(val);
    }
}
class Practical_15_B extends Practical_15{
    void display(){
        System.out.println(val2);
    }
}
class Practical_15_C extends Practical_15{
    void display(){
        System.out.println(val3);
    }
}
class Runner1{
    public static void main(String[] args) {
        Practical_15_A test = new Practical_15_A();
        test.display();
        Practical_15_B test1 = new Practical_15_B();
        test1.display();
        Practical_15_C test2 = new Practical_15_C();
        test2.display();
    }
}
