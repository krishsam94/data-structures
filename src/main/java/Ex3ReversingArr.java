public class Ex3ReversingArr {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println("Original array:");
        printArray(arr);
        reverseArray(arr);
        System.out.println("Reversed array:");
        printArray(arr);
    }

    public static void reverseArray(int[] arr) {
        // Reverse array by swapping elements from both ends
        for (int strtIdx = 0; strtIdx < arr.length / 2; strtIdx++) {
            int temp = arr[strtIdx];
            int endIndex = arr.length - 1;
            arr[strtIdx] = arr[endIndex - strtIdx];
            arr[endIndex - strtIdx] = temp;
        }
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}