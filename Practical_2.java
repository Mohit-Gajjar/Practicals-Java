// Write a program in Java to generate first n prime numbers.
class Practical_2 {
   public static void main(String[] args) {
      int n, i;

      n = 100;
      for (i = 1; i <= n; i++) {
         int count = 0;
         for (int j = i; j >= 1; j--) {
            if (i % j == 0) {
               count = count + 1;
            }
         }
         if (count == 2) {
            System.out.print(" " + i);
         }
      }
   }
}
