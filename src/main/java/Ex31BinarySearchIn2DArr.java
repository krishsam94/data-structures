import java.util.Arrays;

public class Ex31BinarySearchIn2DArr {
    public static void main(String[] args) {
        int[][] arr = {
                {10, 20, 30, 40},
                {15, 25, 33, 42},
                {20, 31, 37, 45},
                {25, 35, 38, 49}
        };
        int[] res = do2dBinarySearch(arr, 38);
        System.out.println(Arrays.toString(res));
    }
    static int[] do2dBinarySearch(int[][] arr, int target) {
        int[] res = {-1, -1};
        int row = 0;
        int col = arr[row].length-1;
        while(row < arr.length) {
            if(arr[row][col] == target) {
                res[0] = row;
                res[1] = col;
                break;
            } else if(col > 0 && arr[row][col] > target) {
                // if last column contains greater than target, then all elements in that column is greatest
                // so eliminate that column
                col--;
            } else {
                row++;
            }

        }
        return res;
    }
}
