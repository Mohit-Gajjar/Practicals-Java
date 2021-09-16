import java.util.Scanner;
// Write a program in Java to find second maximum of n numbers without using arrays
class Practical_4 {
    public static void main(String[] args) {
        int n, large = 0, slarge = 0, ele;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter how many elements to insert: ");
        n = scanner.nextInt();
        
        System.out.println("Enter the elements");
        for (int i = 1; i <= n; i++) {
            ele = scanner.nextInt();
            if (ele > large) {
                slarge = large;
                large = ele;
            } else if (ele > slarge) {
                slarge = ele;
            }

        }
        System.out.println("The Second Largest Number is " + slarge);
        scanner.close();
    }
}
