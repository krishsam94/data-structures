public class Ex11SmallestCharGreaterThanTarget {
    public char nextGreatestLetter(char[] letters, char target) {
        if(target >= letters[letters.length - 1]) return letters[0];
        int start = 0;
        int end = letters.length - 1;
        while(start <= end) {
            int mid = start + (end - start) / 2;
            if(letters[mid] > target) {
                end = mid - 1;
            } else if (letters[mid] <= target) { // if letters[mid] == target, then next greater will be in right hand side so increment start
                start = mid + 1;
            }
        }
        return letters[start];
    }
}

// Example 1:
//
//Input: letters = ["c","f","j"], target = "a"
//Output: "c"
//Explanation: The smallest character that is lexicographically greater than 'a' in letters is 'c'.
//Example 2:
//
//Input: letters = ["c","f","j"], target = "c"
//Output: "f"
//Explanation: The smallest character that is lexicographically greater than 'c' in letters is 'f'.
//Example 3:
//
//Input: letters = ["x","x","y","y"], target = "z"
//Output: "x"
//Explanation: There are no characters in letters that is lexicographically greater than 'z' so we return letters[0].
