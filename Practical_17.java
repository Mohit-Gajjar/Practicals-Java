// Write an application that illustrates how to access a hidden variable. Class A declares a static variable x. The class B extends A and declares an instance variable x. display(
// ) method in B displays both of these variables.
class Practical_17 {
     static int x;
        private int y = 30;
     void display1(){
         int y=21;
         System.out.println("Hidden Variable: " + this.y);
         System.out.println("Local Variable: " + y);

     }
}

class A extends Practical_17 {
    int x;

    void display() {
        System.out.println("Static Variable: " + Practical_17.x);
        System.out.println("Local Variable: " + x);
    }
}

class Main1 {
    public static void main(String[] args) {
        Practical_17 a = new Practical_17();
        a.display1();
        Practical_17.x = 10;
        A a1 = new A();
        a1.x = 20;
        a1.display();
    }
}
