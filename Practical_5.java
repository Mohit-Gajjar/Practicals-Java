// Write a program in Java to reverse the digits of a number using while loop
public class Practical_5 {
    public static void main(String[] args) {
        int r, n, reverse = 0, num;
        n = 1234;
        num = n;
        while (n > 0) {
            r = n % 10;
            reverse = reverse * 10 + r;
            n = n / 10;
        }
        System.out.println("Reverse Of " + num + " is " + reverse);
    }
}
