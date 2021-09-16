// Write an application that illustrates method overriding in the same package and different packages. Also demonstrate accessibility rules in inside and outside packages
class X {
    void display(){
        System.out.println("Class X method");
    }
}
class Y extends X{
    void display(){
        System.out.println("Class Y method");
    }
}


class Practical_20 {
    public static void main(String[] args) {
        X a = new X();
        a.display();
        Y y = new Y();
        y.display();
    }
}
