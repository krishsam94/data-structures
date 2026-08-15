import java.util.Scanner;

public class Ex1MultiDimensionalArray {
    public static void main(String[] args) {
        int[][] arr = new int[3][];
        int[][] arr2 = {
                {1, 2, 4},
                {3, 6},
                {2, 6, 7, 9, 10}
        };
        System.out.println(arr2[0][2]);

        // Fill arrays from input
        Scanner scn = new Scanner(System.in);
        int[][] arr3 = new int[2][2]; // Rectangular Array

        // Input
        for (int row = 0; row < arr3.length; row++) {
            for (int col = 0; col < arr3[row].length; col++) {
                arr3[row][col] = scn.nextInt();
            }
        }

        // Print values
        for (int row = 0; row < arr3.length; row++) {
            for (int col = 0; col < arr3[row].length; col++) {
                System.out.print(arr3[row][col] + " ");
            }
            System.out.println();
        }
    }
}