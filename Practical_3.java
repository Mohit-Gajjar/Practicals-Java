// Write a program in Java to find maximum of three numbers using conditional operator
class Practical_3 {
    public static void main(String[] args) {
        int a, b, c;
        a = 30;
        b = 21;
        c = 43;
        if (a > b && a > c) {
            System.out.println("Number " + a + " is greater");
        } else if (b > c) {
            System.out.println("Number " + b + " is greater");
        } else {
            System.out.println("Number " + c + " is greater");
        }
    }
}
