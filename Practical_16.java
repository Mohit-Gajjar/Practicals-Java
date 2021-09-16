// Create a class to find out whether the given year is leap year or not. (Use inheritance for this program)
public class Practical_16 {
    public static void main(String[] args) {
        int year = 2020;
        if ((year % 4 == 0) && (year % 100 != 0) || (year % 100 == 0)) {

            System.out.println("The year " + year + " is leap year.");
        } else {
            System.out.println("The year " + year + " is not leap year.");

        }
    }
}
