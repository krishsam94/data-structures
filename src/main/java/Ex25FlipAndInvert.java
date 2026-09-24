public class Ex25FlipAndInvert {
    public static void main(String[] args) {
        int[][] image = {{1,1,0},{1,0,1},{0,0,0}};
        image = flipAndInvertImage(image);
        for(int i=0; i<image.length; i++) {
            for(int j=0; j<image[i].length; j++) {
                System.out.print(image[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static int[][] flipAndInvertImage(int[][] image) {
        for(int i=0; i<image.length; i++) {
            for(int j=0; j<image[i].length/2; j++) {
                // take first and last elements to swap and invert those while swapping
                int temp = image[i][j] == 0 ? 1 : 0;
                image[i][j] = image[i][image[i].length-1-j] == 0 ? 1 : 0;
                image[i][image[i].length-1-j] = temp;
            }
            // if length is odd, so it won't be swapped, in this case just invert it
            if (image[i].length % 2 == 1) {
                image[i][image[i].length/2] = image[i][image[i].length/2] == 0 ? 1 : 0;
            }
        }
        return image;
    }
}
