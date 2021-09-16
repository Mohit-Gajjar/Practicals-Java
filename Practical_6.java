// Write a program in Java to convert number into words & print it 
class Practical_6 {
    public static void main(String[] args) {
        int num = 201;
        int u = num % 10;
        int tt = num / 10;
        int t = tt % 10;
        int h = num / 100;

        String[] unitPlace = { "Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten",
                "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen",
                "Twenty" };
        String[] tensPlace = { "", "Ten", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty",
                "Ninety" };
        String hun = "Hundred";

        if (num > 0 && num < 999) {
            if (num <= 20) {
                System.out.println(unitPlace[num]);
            } else if (num < 100) {
                System.out.println(tensPlace[t] + " " + unitPlace[u]);
            } else {
                System.out.println(unitPlace[h] + " " + hun + " " + tensPlace[t] + " " + unitPlace[u]);
            }
        }
    }
}
