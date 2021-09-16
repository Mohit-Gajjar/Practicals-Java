// Write a program in Java to multiply two matrix.
public class Practical_8 {
    public static void main(String[] args) {
        int arr1[][] = { { 1, 2 }, { 3, 4 } };
        int arr2[][] = { { 1, 2 }, { 3, 4 } };
        int arr3[][] = { { 0, 0 }, { 0, 0 } };

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                for (int k = 0; k < 2; k++) {
                    arr3[i][j] = arr1[i][k] * arr2[k][j];
                }
            }
        }
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(arr3[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
