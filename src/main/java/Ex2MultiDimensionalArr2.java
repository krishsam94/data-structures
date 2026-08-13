import java.util.Scanner;

public class Ex2MultiDimensionalArr2
{
	public static void main(String[] args) {
		// Fill arrays from input
		Scanner scn = new Scanner(System.in);
		int[][] arr3 = new int[2][]; // Jagged Array
		
		// Input
		for (int row = 0; row < arr3.length; row++) {
		    arr3[row] = new int[2];
		    for(int col = 0; col < arr3[row].length; col++) {
		        arr3[row][col] = scn.nextInt();
		    }
		}
		
		// Print values
		for (int row = 0; row < arr3.length; row++) {
		    for(int col = 0; col < arr3[row].length; col++) {
		        System.out.print(arr3[row][col] + " ");
		    }
		    System.out.println();
		}
	}
}