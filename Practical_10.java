// Write a program in Java to demonstrate use of this keyword. Check whether this can access the private members of the class or not
class Practical_10 {

    private int a ;
    Practical_10(int a){
        this.a = a;
    }
    public static void main(String[] args) {
        Practical_10 practical_10 = new Practical_10(12);
        System.out.println(practical_10.a);
    }
}
