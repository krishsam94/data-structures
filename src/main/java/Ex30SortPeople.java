public class Ex30SortPeople {
    // https://leetcode.com/problems/sort-the-people/
    public static void main(String[] args) {
        String[] names = {"Mary","John","Emma"};
        int[] heights = {180,165,170};
        String[] sortedNames = sortPeople(names, heights);
        for(String name: sortedNames) {
            System.out.print(name + " ");
        }
    }
    static String[] sortPeople(String[] names, int[] heights) {
        return doSelectionSort(heights, names);
    }
    static String[] doSelectionSort(int[] heights, String[] names) {
        for(int i=0; i<heights.length-1; i++) {
            int maxIdx = i;
            for(int j=i+1; j<heights.length; j++) {
                if(heights[j] > heights[maxIdx]) {
                    maxIdx = j;
                }
            }
            String temp = names[i];
            names[i] = names[maxIdx];
            names[maxIdx] = temp;
            int temp2 = heights[i];
            heights[i] = heights[maxIdx];
            heights[maxIdx] = temp2;
        }
        return names;
    }
}
