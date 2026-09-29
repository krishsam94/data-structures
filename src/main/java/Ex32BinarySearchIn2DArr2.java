import java.util.Arrays;

public class Ex32BinarySearchIn2DArr2 {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 13, 15},
                {18, 20, 22, 34}
        };
        int[] res = do2dBinarySearch(arr, 6);
        System.out.println(Arrays.toString(res));
    }
    static int[] do2dBinarySearch(int[][] arr, int target) {
        int[] res = {-1, -1};
        int row = 0;
        int col = arr[row].length-1;
        int maxRowToSearch = arr.length - 1;
        while(row <= maxRowToSearch) {
            if(arr[row][col] == target) {
                res[0] = row;
                res[1] = col;
                break;
            } else if(col > 0 && arr[row][col] > target) {
                // if last column contains greater than target, then all elements in that column is greatest
                // so eliminate that column
                col--;
                maxRowToSearch = row;
            } else {
                row++;
            }
        }
        return res;
    }
}
